package util;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import control.WX_FileControler;
import control.WX_FileProControler;
import control.WX_XmlControler;

import bean.WX_DeveloperConfig;
import bean.WX_Object;
/**
 * 系统静态实用工具，欲使用本jar应用，需要提前给所有的set方法赋值
 * @author YanFuzhong
 * @date 2015-9-24 下午10:37:16
 * @version 1.0
 */
public class WX_Static  extends WX_Object{
	/**
	 * 开发者公众账号的基本信息
	 */
	 public static WX_DeveloperConfig devConfig;
	 /**
	  * 项目class根路径
	  */
	 public static String  CLASSPATH;
	 /**
	  * 数据编码
	  */
	 public static String ENCODE;
	 /**
	  * 返回码信息管理器
	  */
	 public static WX_FileProControler RETURNCODE_MANAGER;
	 static{
		 CLASSPATH = WX_Static.class.getClassLoader().getResource("").getFile().toString();
		ENCODE = "UTF-8";
		String info = WX_FileControler.readFromFile(CLASSPATH+"/dvpconfig.xml");
		devConfig = (WX_DeveloperConfig) WX_XmlControler.xml2object(info, WX_DeveloperConfig.class);
		RETURNCODE_MANAGER = new WX_FileProControler("returncode.properties");
	 }
	/**
	 * 获得当前的系统时间
	 * @return long
	 */
	public static long getCurrentTime(){
		return new Date().getTime();
	}
	public static Log log(Class<?> temp){
		return LogFactory.getLog(temp);
	}
}