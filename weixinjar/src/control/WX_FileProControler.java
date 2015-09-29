package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import util.WX_Static;
/**
 * ����.properties�ļ��Ĵ�����
 * @author YanFuzhong
 * @date 2015-9-29 ����10:15:20
 * @version 1.0
 */
public class WX_FileProControler extends WX_FileControler{
	/**
	 * ���Դ洢����Ԫ
	 */
	private  Properties p  = new Properties();
	/**
	 * ��ʼ��pro�ļ�������
	 * @param path ����classpath��·��
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
	 * ��ȡ����ֵ
	 * @param key
	 * @return String value
	 */
	public String getValue(String key){
		return p.getProperty(key);
	}
}
