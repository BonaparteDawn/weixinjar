package control;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;

import bean.WX_Object;
import control.interfaces.WX_HttpMethod;
import control.interfaces.WX_Run;

/**
 * 
 * 微信核心控制器
 * @author YanFuzhong
 * @date 2015-9-26 下午02:36:05
 * @version 1.0
 */
public class WX_CoreControler extends WX_Object implements WX_HttpMethod{
	/**
	 * hash名
	 */
	private String hashname;
	/**
	 * 输入流
	 */
	private OutputStream out =null;
	/**
	 * 输出流
	 */
	private InputStream in = null;
	/**
	 * 请求
	 */
	private HttpServletRequest req =null;
	/**
	 *响应
	 */
	private HttpServletResponse resp = null;
	public WX_CoreControler(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		super();
		this.req=req;
		this.resp=resp;
		this.out = resp.getOutputStream();
		this.in = req.getInputStream();
		this.hashname="用户"+String.valueOf(hashCode());
	}
	/**
	 * 处理HTTP的get方法（验证用户的合法性和合法的操作）
	 * @param get 合法的操作
	 */
	@Override
	public void get(WX_Run get) {
		run(get);
	}
	/**
	 * 处理HTTP的POST方法（验证用户的合法性和合法的操作）
	 * @param post 合法的操作
	 */
	@Override
	public void post(WX_Run post) {
		run(post);
	}
	/**
	 * 验证用户的合法性和合法的操作的运行方法
	 * @param temp 合法的操作
	 */
	private void run(WX_Run temp) {
		if (temp ==null) {
			return;
		}
		log.info(hashname+": "+"开始连接....");
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<?> pn = req.getParameterNames();
		//存放连接返回的参数
		while (pn.hasMoreElements()) {
			String name = (String) pn.nextElement();
			map.put(name, req.getParameter(name));
		}
		//该次连接用户的名字
		map.put("hashname", String.valueOf(hashname));
		System.err.println(map);
		log.debug("map: "+ map);
		if (WX_DvpControler.checkSignature(map)) {
			log.info(hashname+": "+"证书验证通过");
			temp.run(in, out,map);
		}else {
			log.error(hashname+": "+"证书验证失败");
		}
		try {
			log.info(hashname+": "+"开始关闭所有连接.....");
			close();
			log.info(hashname+": "+"完成所有连接关闭.....");
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}
	/**
	 * 关闭连接
	 * @throws IOException
	 */
	private void close() throws IOException{
		if (out!=null) {
			log.info(hashname+": "+"即将关闭输出流.....");
			out.close();
			out=null;
			log.info(hashname+": "+"关闭输出流成功.....");
		}
		if (in!=null) {
			log.info(hashname+": "+"即将关闭输入流.....");
			in.close();
			in=null;
			log.info(hashname+": "+"关闭输入流成功.....");
		}
	}
	
	/**
	 * 获得{@link #log}的值
	 * @return 成员变量log (数据类型 Log)
	 */
	public Log getLog() {
		return log;
	}
	/**
	 * 获得{@link #req}的值
	 * @return 成员变量req (数据类型 HttpServletRequest)
	 */
	public HttpServletRequest getReq() {
		return req;
	}
	/**
	 * 获得{@link #resp}的值
	 * @return 成员变量resp (数据类型 HttpServletResponse)
	 */
	public HttpServletResponse getResp() {
		return resp;
	}
	/**
	 * 设置成员变量{@link #log}的值
	 * @param log 成员变量 (数据类型 Log)
	 */
	public void setLog(Log log) {
		this.log = log;
	}
	/**
	 * 设置成员变量{@link #req}的值
	 * @param req 成员变量 (数据类型 HttpServletRequest)
	 */
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	/**
	 * 设置成员变量{@link #resp}的值
	 * @param resp 成员变量 (数据类型 HttpServletResponse)
	 */
	public void setResp(HttpServletResponse resp) {
		this.resp = resp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_CoreControler [hashname=" + hashname + ", log=" + log
				+ ", out=" + out + ", in=" + in + ", req=" + req + ", resp="
				+ resp + "]";
	}
	
}