package bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;

import util.WX_Static;
/**
 * 
 * 所有微信对象的基类
 * @author YanFuzhong
 * @date 2015-9-26 下午05:17:03
 * @version
 */
public abstract class WX_Object {
	/**
	 * 日志记录器
	 */
	public Log log = WX_Static.log(getClass());
	/**
	 * 写数据到输出流中（使用完需要手动关闭数据流）
	 * @param info
	 * @param out
	 * @return boolean
	 */
	public boolean write(String info,OutputStream out){
		boolean res =false;
		if (out ==null) {
			res =false;
			return res;
		}
		try {
			res=write(info.getBytes("UTF-8"), out);
		} catch (UnsupportedEncodingException e) {
			log.error(e.getMessage());
		}
		return res;
	}
	/**
	 * 写数据到输出流中（使用完需要手动关闭数据流）
	 * @param data
	 * @param out
	 * @return boolean
	 */
	public boolean write(byte[] data,OutputStream out){
		boolean res =false;
		if (out ==null) {
			res =false;
			return res;
		}
		try {
			IOUtils.write(data, out);
			res=true;
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return res;
	}
	/**
	 * 读数据到输入流中（使用完需要手动关闭数据流）
	 * @param in
	 * @return String
	 */
	public String read(InputStream in){
		String res =null;
		if (in ==null) {
			res = null;
			return res;
		}
		try {
			InputStreamReader reader = new InputStreamReader(in, "utf-8");
			res=read(reader);
		} catch (UnsupportedEncodingException e) {
			log.error(e.getMessage());
		}
		return res;
	}
	/**
	 * 读数据到输入流中（使用完需要手动关闭数据流）
	 * @param in
	 * @return String
	 */
	public String read(InputStreamReader reader){
		String res =null;
		if (reader ==null) {
			res =null;
			return res;
		}
		StringBuilder builder = new StringBuilder();
		try {
			List<String> lines = IOUtils.readLines(reader);
			for (String line : lines) {
				builder.append(line);
			}
			res=builder.toString();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return res;
	}
	
	
}