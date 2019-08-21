/**
 * 
 */
package rechal.apps.coll.util.db;

import java.io.File;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description 
 * @author guoruichao
 * @version 1.0
 * @date 2018年5月25日上午9:32:12
 */
public class H2Server {
	private static Logger log = LoggerFactory.getLogger(H2Server.class);
	private String dir;
	private String port;
	private Server dbserver;
	
	public void start() {
		try {
			String home=System.getProperty("user.dir");
			if(StringUtils.isBlank(dir)) dir="data";
			String dbdir=home.concat(File.separator).concat(dir);
			File f=new File(dbdir);
			if(!f.exists())
				f.mkdirs();
			
			
			if(StringUtils.isBlank(port)) port="8082";
			dbserver = Server.createWebServer("-webAllowOthers","-webPort",port,"-baseDir",f.getAbsolutePath(),"-ifNotExists");
			dbserver.start();
			log.info("H2 server started[{},{}]",port, dir);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	public void close() {
		if(dbserver!=null&&dbserver.isRunning(true)){
			dbserver.shutdown();
		}
		log.info("H2 server stopped");
	}

	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}
