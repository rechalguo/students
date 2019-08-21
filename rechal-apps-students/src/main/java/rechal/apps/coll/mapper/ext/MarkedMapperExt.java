package rechal.apps.coll.mapper.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import rechal.apps.coll.entity.CMarked;
import rechal.apps.coll.entity.CMarkedExt;
import rechal.apps.coll.mapper.CMarkedMapper;
import rechal.apps.coll.model.MarkedModel;

public interface MarkedMapperExt extends CMarkedMapper {

    int inserts(List<CMarked> records);
    List<CMarkedExt> selectByPage(MarkedModel model);
    
    //综合分数线
    List<Map<String,Object>> selectMarkLine(MarkedModel model);
    List<Map<String,Object>> selectCourseMarkLine(MarkedModel model);
    
    /**
     * 统计班级上线人数
     * @param model
     * @return
     */
    @MapKey(value="kNo")
    Map<String, CMarkedExt> selectMarkdByClass(MarkedModel model);
}