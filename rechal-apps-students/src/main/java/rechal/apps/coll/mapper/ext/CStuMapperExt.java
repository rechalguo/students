package rechal.apps.coll.mapper.ext;

import java.util.List;

import rechal.apps.coll.entity.CStu;
import rechal.apps.coll.mapper.CStuMapper;
import rechal.apps.coll.model.StuModel;

public interface CStuMapperExt extends CStuMapper{
    List<CStu> selectByPage(StuModel example);
}