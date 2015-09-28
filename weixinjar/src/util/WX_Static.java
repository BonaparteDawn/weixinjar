package util;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import control.WX_FileControler;
import control.WX_XmlControler;

import bean.WX_DeveloperConfig;
import bean.WX_Object;
/**
 * ϵͳ��̬ʵ�ù��ߣ���ʹ�ñ�jarӦ�ã���Ҫ��ǰ�����е�set������ֵ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:37:16
 * @version 1.0
 */
public class WX_Static  extends WX_Object{
	/**
	 * �����߹����˺ŵĻ�����Ϣ
	 */
	 public static WX_DeveloperConfig devConfig;
	 public static String  ROOTPATH;
	 static{
		 ROOTPATH = WX_Static.class.getClassLoader().getResource("").getFile().toString();
		String info;
		info = WX_FileControler.readFromFile(ROOTPATH+"/dvpconfig.xml");
		devConfig = (WX_DeveloperConfig) WX_XmlControler.xml2object(info, WX_DeveloperConfig.class);
	 }
	/**
	 * ��õ�ǰ��ϵͳʱ��
	 * @return long
	 */
	public static long getCurrentTime(){
		return new Date().getTime();
	}
	public static Log log(Class<?> temp){
		return LogFactory.getLog(temp);
	}
}