package rechal.apps.coll.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CClassExample;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CMarkExample;
import rechal.apps.coll.entity.CMarked;
import rechal.apps.coll.entity.CMarkedExample;
import rechal.apps.coll.entity.CMarkedExt;
import rechal.apps.coll.entity.CTermed;
import rechal.apps.coll.entity.CTermedExample;
import rechal.apps.coll.mapper.ext.CClassMapperExt;
import rechal.apps.coll.mapper.ext.CCourseMapperExt;
import rechal.apps.coll.mapper.ext.MarkedMapperExt;
import rechal.apps.coll.mapper.ext.ScoreMapper;
import rechal.apps.coll.mapper.ext.TermedMapper;
import rechal.apps.coll.model.MarkedModel;
import rechal.apps.coll.model.Score;
import rechal.apps.coll.model.ScoreModel;
import rechal.apps.coll.util.DateTimeUtil;

@Service
public class StaService {

	@Autowired
	private CCourseMapperExt courseMapper;
	@Autowired
	private TermedMapper termedMapper;
	@Autowired
	private ScoreMapper scoreMapper;
	@Autowired
	private MarkedMapperExt markedMapper;
	@Autowired
	private CClassMapperExt clazzMapper;
	
	@Autowired
	DataSourceTransactionManager dataSourceTransactionManager;
	@Autowired
	TransactionDefinition transactionDefinition;
	
	@Value("${app.online.rate}")
	private Double onlineRate;
	@Value("${app.online.limit}")
	private Double onlineLimit;

	public void insertTermed(CTermed termed) {
		this.termedMapper.insert(termed);
	}

	/**
	 * 成绩的导入会生成需要设置阀值的科目，会保存当前学期考试编号
	 * @param termNo
	 * @param scoreStr
	 * @param scores
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> importedScores(String termNo, List<String> courses, List<Score> scores, boolean reset) throws Exception{
		Map<String, String> res = new HashMap<>();
		CTermedExample e = new CTermedExample();
		e.createCriteria().andMNoEqualTo(termNo);
		List<CTermed> t = this.termedMapper.selectByExample(e);
		if (t != null && !t.isEmpty() && "2".compareTo(t.get(0).gettStat())==0) {
			res.put("code", "1");
			res.put("msg", "此学期成绩已生成分数线，不能再次导入");
			return res;
		}
		
		Map<String, CCourse> crsMapping=courseMapper.cacheCourseKeyName();  // 学科名字与字段对应表
		List<CMarked> marked=new ArrayList<>(courses.size());
		//动态的学科列
		StringBuilder courseStr=new StringBuilder();
		for(String cstr:courses){
			courseStr=courseStr.append(",").append("M_").append(crsMapping.get(cstr).getkNo().toUpperCase().trim());
			CMarked cm=new CMarked();
			cm.setmNo(termNo);
			cm.setkNo(crsMapping.get(cstr).getkNo());
			cm.setMsAll(scores.size());
			cm.setMsCreateDate(DateTimeUtil.getCurrentDate());
			cm.setMsRate(this.onlineRate);
			cm.setMsWeight(1.0);
			marked.add(cm);
		}
		//综合
		CMarked cm=new CMarked();
		cm.setmNo(termNo);
		cm.setkNo("All");
		cm.setMsAll(scores.size());
		cm.setMsCreateDate(DateTimeUtil.getCurrentDate());
		cm.setMsRate(this.onlineRate);
		cm.setMsWeight(1.0);
		marked.add(cm);

		long t3 = System.currentTimeMillis();
		System.out.println("-----------------------开始插入: " + System.currentTimeMillis());
		//手动开启事务
		TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
		try{
			if(reset) {
				CMarkExample me=new CMarkExample();
				me.createCriteria().andMNoEqualTo(termNo);
				this.scoreMapper.deleteByExample(me);
				
				CTermedExample te=new CTermedExample();
				te.createCriteria().andMNoEqualTo(termNo);
				this.termedMapper.deleteByExample(te);
				
				CMarkedExample ce=new CMarkedExample();
				ce.createCriteria().andMNoEqualTo(termNo);
				this.markedMapper.deleteByExample(ce);
			}
			
			//保存成绩 
			this.scoreMapper.insertBatch(courseStr.toString(), scores);
			
			//保存学期考试编号
			CTermed termed=new CTermed();
			termed.setmNo(termNo);
			termed.settStat("1");
			this.termedMapper.insert(termed);  
			
			//保存需要设置阀值的科目
			this.markedMapper.inserts(marked);
			
			//手动提交事务
			dataSourceTransactionManager.commit(transactionStatus);//提交
		}catch(Exception ee){
			//手动回滚事务
			dataSourceTransactionManager.rollback(transactionStatus);
			ee.printStackTrace();
		}
		
//		SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);// 关闭session的自动提交;
//		try {
//			sqlSession.insert("rechal.apps.coll.mapper.ext.ScoreMapper.insertBatch",scoreStr, scores);
//			CTermed termed=new CTermed();
//			termed.setmNo(termNo);
//			termed.settStat("1");
//			sqlSession.insert("rechal.apps.coll.mapper.ext.TermedMapper.insert", termed);
//			sqlSession.commit();
//		} finally {
//			sqlSession.close();
//		}

		long t4 = System.currentTimeMillis();
		System.out.println("-----------------------结束: " + System.currentTimeMillis());
		System.out.println("-----------------------用时: " + (t4 - t3));

		res.put("code", "0");
		res.put("msg", "上传成功,"+scores.size()+"条记录");
		return res;
	}
	
	public ScoreModel scoreList(ScoreModel model) {
		model.setColl(getCollStr(model.getScore().getmNo()));
		List<Map<String,Object>> results=this.scoreMapper.selectByPage(model);
		model.getRows().addAll(results);
		return model;
	}
	
	public MarkedModel markedList(MarkedModel model) {
		List<CMarkedExt> results=this.markedMapper.selectByPage(model);
		model.getRows().addAll(results);
		return model;
	}
	public int markedSave(CMarkedExt model) throws Exception {
		CTermedExample e = new CTermedExample();
		e.createCriteria().andMNoEqualTo(model.getmNo());
		List<CTermed> t = this.termedMapper.selectByExample(e);
		if (t != null && !t.isEmpty() && "2".compareTo(t.get(0).gettStat())==0) {
			throw new Exception("此学期成绩已生成分数线，不能再修改上线率");
		}
		
		CMarked update=new CMarked();
		CMarked c=this.markedMapper.selectByPrimaryKey(model.getMsId());
		
		update.setMsId(model.getMsId());
		if(model.getMsWeight()!=null) update.setMsWeight(model.getMsWeight());
		if(model.getMsRate()!=null){  //根据上线率计算上线人数
			update.setMsRate(model.getMsRate());
			BigDecimal bg = new BigDecimal(update.getMsRate()*c.getMsAll());
			update.setMsMarked(bg.setScale(0, BigDecimal.ROUND_HALF_UP).intValue());
		}
		if(model.getMsMarked()!=null) {//根据上线人数计算上线率
			update.setMsMarked(model.getMsMarked());
			BigDecimal bg = new BigDecimal(model.getMsMarked()*1.0/c.getMsAll());
			update.setMsRate(bg.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		return this.markedMapper.updateByPrimaryKeySelective(update);
	}
	
	public MarkedModel markedCreate(MarkedModel model) throws Exception {
		CTermedExample e = new CTermedExample();
		e.createCriteria().andMNoEqualTo(model.getMarked().getmNo());
		List<CTermed> t = this.termedMapper.selectByExample(e);
		if(t==null||t.isEmpty())
			throw new Exception("未发现此编号成绩");
		if ("2".compareTo(t.get(0).gettStat())==0) {
			throw new Exception("此考试编号成绩已生成分数线，不能重复生成");
		}
		CTermed ct=t.get(0);
		
		model.setLimit(10000);
		model.setPage(1);
		List<CMarkedExt> results=this.markedMapper.selectByPage(model);
		
		List<Map<String,Object>> rank=null;
		//计算总分数线
		for(int i=0;i<results.size();i++) {
			if("ALL".equalsIgnoreCase(results.get(i).getkNo())) {
				//综合分数线
				model.setColl(this.getCollStr(model.getMarked().getmNo()));
			} else {
				model.setColl("M_".concat(results.get(i).getkNo().toUpperCase()));
			}
			model.getMarked().setMsMarked(results.get(i).getMsMarked());
			rank=this.markedMapper.selectMarkLine(model);
			
			//保存分数线
			if(rank!=null&&!rank.isEmpty()) {
				results.get(i).setMsLine( ((Double) rank.get(0).get("MARKLINE")).doubleValue()); 
				results.get(i).setMsMarked(((Long) rank.get(0).get("MARKED")).intValue());
			}
		}
		
		//手动开启事务
		TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
		try{
			//保存成绩 
			for(CMarkedExt mext:results){
				CMarked c=new CMarked();
				c.setMsId(mext.getMsId());
				c.setMsLine(mext.getMsLine());
				c.setMsMarked(mext.getMsMarked());
				this.markedMapper.updateByPrimaryKeySelective(c);
			}
			
			//更新termed状态
			ct.settStat("2");
			this.termedMapper.updateByPrimaryKeySelective(ct);
			
			//手动提交事务
			dataSourceTransactionManager.commit(transactionStatus);//提交
		}catch(Exception ee){
			//手动回滚事务
			dataSourceTransactionManager.rollback(transactionStatus);
			ee.printStackTrace();
		}
		
		model.getRows().addAll(results);
		return model;
	}
	
	
	
	public MarkedModel markedListByClass(MarkedModel model) throws Exception{
		CTermedExample e = new CTermedExample();
		e.createCriteria().andMNoEqualTo(model.getMarked().getmNo());
		List<CTermed> t = this.termedMapper.selectByExample(e);
		if(t==null||t.isEmpty())
			throw new Exception("未发现此编号成绩");
		
		List<Map<String, String>> cols=this.getColumns(model.getMarked().getmNo());
		model.setColl(this.getCollStr(cols));
		
		//初始化列表
		int clazzNums=this.maxClassNumber();
		Map<String, CCourse> courses=courseMapper.cacheCourseKeyName();  // 学科名字与字段对应表
		String courseMapping="总分,";
		Map<String, String> rows=new HashMap<>();
		List<String> clazzNos=new ArrayList<>(clazzNums);
		
		String gNo=Character.toString(model.getMarked().getmNo().charAt(9));
		String gName=new String(gNo);
		CMarkedExample cme=new CMarkedExample();
		cme.createCriteria().andMNoEqualTo(model.getMarked().getmNo()).andKNoEqualTo("All");
		List<CMarked> allMarked=this.markedMapper.selectByExample(cme);
		if(allMarked!=null&&!allMarked.isEmpty()) {
			Integer stus=allMarked.get(0).getMsMarked();
			gName=gName.concat("(").concat(stus==null?"--":Integer.toString(stus)).concat(")");
		}
		rows.put("G_NO", gName);
		
		for(int i=0;i<clazzNums;i++) {
			rows.put("C_"+Integer.toString(i+1), "");
			clazzNos.add("C_"+Integer.toString(i+1));
		}
		
		//综合上线人数  zh 的key是班级编码 5-1..
		Map<String, CMarkedExt> zh=this.markedMapper.selectMarkdByClass(model);
		CMarkedExt markedClass=null;
		Object marked=null;
		String v=null;
		for(String cno:clazzNos) {
			v=gNo+"-".concat(cno.substring(cno.indexOf("_")+1));
			markedClass=zh.get(v);
			if(markedClass==null) continue;
			marked=markedClass.getMsMarked();
			if(marked==null) marked="0";
			rows.put(cno, ""+marked);
		}
		
		for(Map<String, String> c:cols){
			String cno=c.get("C_NO");
			if(cno.toUpperCase().startsWith("M_")) {
				cno=cno.substring(2);
			}
			for(String cs:courses.keySet()) {
				if(courses.get(cs).getkNo().toUpperCase().equals(cno.toUpperCase())){
					courseMapping=courseMapping.concat(cs).concat(",");
				}
			}
			model.setCourse(cno);
			zh=this.markedMapper.selectMarkdByClass(model);
			for(String clazzNo:clazzNos) {
				v=gNo+"-".concat(clazzNo.substring(clazzNo.indexOf("_")+1));
				markedClass=zh.get(v);
				if(markedClass==null) marked="0";
				else {
					marked=markedClass.getMsMarked();
					if(marked==null) marked="0";
				}
				v=rows.get(clazzNo);
				if(v==null||"".equals(v)) v="0";
				rows.put(clazzNo, v+","+marked);
			}
		}
		courseMapping=courseMapping.substring(0, courseMapping.length()-1);
		model.getRows().add(rows);
		model.getUserdata().put("COURSE_SEQ", courseMapping);
		return model;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Map<String, String>> getColumns(String mNo){
		return this.scoreMapper.selectTableColumns(mNo);
	}
	
	/**
	 * 获取综合分数的字段（需要根据字段和权重拼接）
	 * @param mNo
	 * @return
	 */
	public String getCollStr(String mNo) {
		return this.getCollStr(this.scoreMapper.selectTableColumns(mNo));
	}
	public String getCollStr(List<Map<String, String>> cols) {
		StringBuilder all=new StringBuilder("(0");
		cols.stream().forEach(col->{
			String w=col.get("WEIGHT");
			if(StringUtils.isBlank(w)) w="1.0";
			all.append("+").append("IFNULL(").append(col.get("C_NO")).append(" * ").append(w).append(",0)");
		});
		all.append(")");
		return all.toString();
	}
	
	public int maxClassNumber() {
		CClassExample c=new CClassExample();
		List<CClass> classes=this.clazzMapper.selectByExample(c);
		String s=null;
		String max="8";
		for(int i=0;i<classes.size();i++) {
			s=classes.get(i).getcNo().substring(2);
			if(max.compareTo(s)<0) max=s;
		}
		return Integer.parseInt(max);
	}
//	public ScoreModel termedList(ScoreModel model) {
//		List<Map<String, String>> cols=this.getColumns(model.getScore().getmNo());
//		StringBuilder all=new StringBuilder("(0");
//		cols.stream().forEach(col->{
//			all.append("+").append("IFNULL(").append(col.get("C_NO")).append(",0)");
//		});
//		all.append(")");
//		model.setColl(all.toString());
//		List<Map<String,Object>> results=this.scoreMapper.selectByPage(model);
//		model.getRows().addAll(results);
//		
//		return model;
//	}
}
