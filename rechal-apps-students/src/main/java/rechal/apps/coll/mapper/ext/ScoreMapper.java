package rechal.apps.coll.mapper.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import rechal.apps.coll.mapper.CMarkMapper;
import rechal.apps.coll.model.Score;
import rechal.apps.coll.model.ScoreModel;

public interface ScoreMapper extends CMarkMapper {
    int insertBatch(@Param("courses") String courses,@Param("list") List<Score> records);
    
    List<Map<String, String>> selectTableColumns(@Param("mNo") String mNo);
    
    List<Map<String, Object>> selectByPage(ScoreModel example);
}