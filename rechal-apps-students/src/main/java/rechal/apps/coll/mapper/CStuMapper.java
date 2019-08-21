package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CStu;
import rechal.apps.coll.entity.CStuExample;

public interface CStuMapper {
    int countByExample(CStuExample example);

    int deleteByExample(CStuExample example);

    int deleteByPrimaryKey(String sNo);

    int insert(CStu record);

    int insertSelective(CStu record);

    List<CStu> selectByExample(CStuExample example);

    CStu selectByPrimaryKey(String sNo);

    int updateByExampleSelective(@Param("record") CStu record, @Param("example") CStuExample example);

    int updateByExample(@Param("record") CStu record, @Param("example") CStuExample example);

    int updateByPrimaryKeySelective(CStu record);

    int updateByPrimaryKey(CStu record);
}