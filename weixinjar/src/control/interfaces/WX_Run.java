package control.interfaces;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
/**
 * 
 * ���нӿ�
 * @author YanFuzhong
 * @date 2015-9-26 ����04:37:48
 * @version 1.0
 */
public interface WX_Run {
	/**
	 * ����
	 * @param in ������
	 * @param out �����
	 * @param map �������
	 */
	public void run(InputStream in ,OutputStream out,Map<String, String> map);
}
