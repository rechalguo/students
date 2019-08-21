package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CCourseExample;

public interface CCourseMapper {
    int countByExample(CCourseExample example);

    int deleteByExample(CCourseExample example);

    int deleteByPrimaryKey(Long kId);

    int insert(CCourse record);

    int insertSelective(CCourse record);

    List<CCourse> selectByExample(CCourseExample example);

    CCourse selectByPrimaryKey(Long kId);

    int updateByExampleSelective(@Param("record") CCourse record, @Param("example") CCourseExample example);

    int updateByExample(@Param("record") CCourse record, @Param("example") CCourseExample example);

    int updateByPrimaryKeySelective(CCourse record);

    int updateByPrimaryKey(CCourse record);
}