#成功管理系统
功能
	1. 按考试编号上传成绩
	2. 根据条件生成分数线
	3. 统计各班级上线人数
	4. 查询学生成绩

编译运行 jdk 1.8
mvn clean compile
mvn package

部署
APP_HOME
	--bin/StuManager.jar
	--config/application.properties
	--data #数据库文件
	--jre  #java环境，如果系统已安装可删除本文件夹
	--logs
	--run.sh
	--start.bat
	
application.properties内容
	spring.profiles.active=prod
	
在浏览器中输入 http://localhost:9001/
用户和密码 jill.coder / password