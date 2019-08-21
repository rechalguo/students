package rechal.apps.coll.mapper.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.mapper.CCourseMapper;
import rechal.apps.coll.model.CourseModel;

public interface CCourseMapperExt extends CCourseMapper{
    
    List<CCourse> selectByPage(CourseModel model);
    int insertCourse(CCourse record);
    int addMarkCourse(CCourse record);
    
    @MapKey(value="kName")
    Map<String,CCourse> cacheCourseKeyName();
}