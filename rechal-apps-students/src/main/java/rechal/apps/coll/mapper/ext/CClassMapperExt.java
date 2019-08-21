package rechal.apps.coll.mapper.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.mapper.CClassMapper;
import rechal.apps.coll.model.ClazzModel;

public interface CClassMapperExt extends CClassMapper {

    List<CClass> selectByPage(ClazzModel example);
    
    @MapKey(value="cNo")
    Map<String,CClass> cacheClassKeyName();
}