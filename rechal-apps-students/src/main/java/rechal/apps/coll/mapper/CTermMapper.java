package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CTerm;
import rechal.apps.coll.entity.CTermExample;

public interface CTermMapper {
    int countByExample(CTermExample example);

    int deleteByExample(CTermExample example);

    int deleteByPrimaryKey(Long tId);

    int insert(CTerm record);

    int insertSelective(CTerm record);

    List<CTerm> selectByExample(CTermExample example);

    CTerm selectByPrimaryKey(Long tId);

    int updateByExampleSelective(@Param("record") CTerm record, @Param("example") CTermExample example);

    int updateByExample(@Param("record") CTerm record, @Param("example") CTermExample example);

    int updateByPrimaryKeySelective(CTerm record);

    int updateByPrimaryKey(CTerm record);
}