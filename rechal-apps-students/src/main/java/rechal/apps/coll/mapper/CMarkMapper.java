package rechal.apps.coll.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rechal.apps.coll.entity.CMark;
import rechal.apps.coll.entity.CMarkExample;

public interface CMarkMapper {
    int countByExample(CMarkExample example);

    int deleteByExample(CMarkExample example);

    int deleteByPrimaryKey(Long mId);

    int insert(CMark record);

    int insertSelective(CMark record);

    List<CMark> selectByExample(CMarkExample example);

    CMark selectByPrimaryKey(Long mId);

    int updateByExampleSelective(@Param("record") CMark record, @Param("example") CMarkExample example);

    int updateByExample(@Param("record") CMark record, @Param("example") CMarkExample example);

    int updateByPrimaryKeySelective(CMark record);

    int updateByPrimaryKey(CMark record);
}