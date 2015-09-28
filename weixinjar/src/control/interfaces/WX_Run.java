package control.interfaces;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
/**
 * 
 * 运行接口
 * @author YanFuzhong
 * @date 2015-9-26 下午04:37:48
 * @version 1.0
 */
public interface WX_Run {
	/**
	 * 运行
	 * @param in 输入流
	 * @param out 输出流
	 * @param map 传入参数
	 */
	public void run(InputStream in ,OutputStream out,Map<String, String> map);
}
