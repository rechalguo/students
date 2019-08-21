package rechal.apps.coll.mapper.ext;

import rechal.apps.coll.entity.CTermed;
import rechal.apps.coll.mapper.CTermedMapper;

public interface TermedMapper extends CTermedMapper{
    int insert(CTermed record);
}