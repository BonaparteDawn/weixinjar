package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import org.apache.commons.io.IOUtils;

import util.WX_Static;
import bean.WX_Object;
/**
 * 
 * 文件和对象之间的控制器
 * @author YanFuzhong
 * @date 2015-9-25 下午06:04:58
 * @version 1.0
 */
public class WX_FileControler  extends WX_Object{
	/**
	 * 将信息写入文件中
	 * @param path 文件位置
	 * @param info 需要保存的信息
	 * @return
	 */
	public static boolean writeToFile(String path,String info){
		boolean res = false;
		if (path ==null || info ==null || path.equals("")) {
			return res;
		}
		try {
			Writer output =new FileWriter(new File(path));
			IOUtils.write(info, output );
			output.close();
			res =true;
		} catch (IOException e) {
			WX_Static.log(WX_FileControler.class).error(e.getMessage());
		}
		return res;
	}
	/**
	 * 将信息从文件中读取出来
	 * @param path
	 * @return String
	 */
	public static String readFromFile(String path){
		String res = null;
		if (path== null || path.equals("")) {
			return res;
		}
		try {
			Reader input = new FileReader(new File(path));
			List<String> lines = IOUtils.readLines(input);
			StringBuffer stringBuffer = new StringBuffer();
			for (String line : lines) {
				stringBuffer.append(line).append("\n");
			}
			res = stringBuffer.toString();
		} catch (FileNotFoundException e) {
			WX_Static.log(WX_FileControler.class).error(e.getMessage());
		} catch (IOException e) {
			WX_Static.log(WX_FileControler.class).error(e.getMessage());
		}
		return res;
	}
}
