package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CClassExample;

public interface CClassMapper {
    int countByExample(CClassExample example);

    int deleteByExample(CClassExample example);

    int deleteByPrimaryKey(Long cId);

    int insert(CClass record);

    int insertSelective(CClass record);

    List<CClass> selectByExample(CClassExample example);

    CClass selectByPrimaryKey(Long cId);

    int updateByExampleSelective(@Param("record") CClass record, @Param("example") CClassExample example);

    int updateByExample(@Param("record") CClass record, @Param("example") CClassExample example);

    int updateByPrimaryKeySelective(CClass record);

    int updateByPrimaryKey(CClass record);
}