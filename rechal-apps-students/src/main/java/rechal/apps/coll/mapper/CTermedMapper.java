package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CTermed;
import rechal.apps.coll.entity.CTermedExample;

public interface CTermedMapper {
    int countByExample(CTermedExample example);

    int deleteByExample(CTermedExample example);

    int deleteByPrimaryKey(Long tId);

    int insert(CTermed record);

    int insertSelective(CTermed record);

    List<CTermed> selectByExample(CTermedExample example);

    CTermed selectByPrimaryKey(Long tId);

    int updateByExampleSelective(@Param("record") CTermed record, @Param("example") CTermedExample example);

    int updateByExample(@Param("record") CTermed record, @Param("example") CTermedExample example);

    int updateByPrimaryKeySelective(CTermed record);

    int updateByPrimaryKey(CTermed record);
}