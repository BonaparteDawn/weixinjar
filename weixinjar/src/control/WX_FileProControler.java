package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import util.WX_Static;
/**
 * 处理.properties文件的处理器
 * @author YanFuzhong
 * @date 2015-9-29 上午10:15:20
 * @version 1.0
 */
public class WX_FileProControler extends WX_FileControler{
	/**
	 * 属性存储管理单元
	 */
	private  Properties p  = new Properties();
	/**
	 * 初始化pro文件管理器
	 * @param path 基于classpath的路径
	 */
	public WX_FileProControler(String path) {
		super();
		try {
			File file = new File(WX_Static.CLASSPATH+"/"+path);
			FileInputStream in = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(in, WX_Static.ENCODE);
			p.load(reader);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	/**
	 * 获取键的值
	 * @param key
	 * @return String value
	 */
	public String getValue(String key){
		return p.getProperty(key);
	}
}
