package rechal.apps.coll.mapper.ext;

import java.util.List;
import java.util.Map;

import rechal.apps.coll.model.BaseInfoModel;

public interface BaseInfoMapper {

	List<Map<String,Object>> selectGrade(BaseInfoModel model);
	List<Map<String,Object>> selectTermedbyPage(BaseInfoModel model);
}
