package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CMarked;
import rechal.apps.coll.entity.CMarkedExample;

public interface CMarkedMapper {
    int countByExample(CMarkedExample example);

    int deleteByExample(CMarkedExample example);

    int deleteByPrimaryKey(Long msId);

    int insert(CMarked record);

    int insertSelective(CMarked record);

    List<CMarked> selectByExample(CMarkedExample example);

    CMarked selectByPrimaryKey(Long msId);

    int updateByExampleSelective(@Param("record") CMarked record, @Param("example") CMarkedExample example);

    int updateByExample(@Param("record") CMarked record, @Param("example") CMarkedExample example);

    int updateByPrimaryKeySelective(CMarked record);

    int updateByPrimaryKey(CMarked record);
}