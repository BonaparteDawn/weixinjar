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
 * ΢�ź��Ŀ�����
 * @author YanFuzhong
 * @date 2015-9-26 ����02:36:05
 * @version 1.0
 */
public class WX_CoreControler extends WX_Object implements WX_HttpMethod{
	/**
	 * hash��
	 */
	private String hashname;
	/**
	 * ������
	 */
	private OutputStream out =null;
	/**
	 * �����
	 */
	private InputStream in = null;
	/**
	 * ����
	 */
	private HttpServletRequest req =null;
	/**
	 *��Ӧ
	 */
	private HttpServletResponse resp = null;
	public WX_CoreControler(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		super();
		this.req=req;
		this.resp=resp;
		this.out = resp.getOutputStream();
		this.in = req.getInputStream();
		this.hashname="�û�"+String.valueOf(hashCode());
	}
	/**
	 * ����HTTP��get��������֤�û��ĺϷ��ԺͺϷ��Ĳ�����
	 * @param get �Ϸ��Ĳ���
	 */
	@Override
	public void get(WX_Run get) {
		run(get);
	}
	/**
	 * ����HTTP��POST��������֤�û��ĺϷ��ԺͺϷ��Ĳ�����
	 * @param post �Ϸ��Ĳ���
	 */
	@Override
	public void post(WX_Run post) {
		run(post);
	}
	/**
	 * ��֤�û��ĺϷ��ԺͺϷ��Ĳ��������з���
	 * @param temp �Ϸ��Ĳ���
	 */
	private void run(WX_Run temp) {
		if (temp ==null) {
			return;
		}
		log.info(hashname+": "+"��ʼ����....");
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<?> pn = req.getParameterNames();
		//������ӷ��صĲ���
		while (pn.hasMoreElements()) {
			String name = (String) pn.nextElement();
			map.put(name, req.getParameter(name));
		}
		//�ô������û�������
		map.put("hashname", String.valueOf(hashname));
		System.err.println(map);
		log.debug("map: "+ map);
		if (WX_DvpControler.checkSignature(map)) {
			log.info(hashname+": "+"֤����֤ͨ��");
			temp.run(in, out,map);
		}else {
			log.error(hashname+": "+"֤����֤ʧ��");
		}
		try {
			log.info(hashname+": "+"��ʼ�ر���������.....");
			close();
			log.info(hashname+": "+"����������ӹر�.....");
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}
	/**
	 * �ر�����
	 * @throws IOException
	 */
	private void close() throws IOException{
		if (out!=null) {
			log.info(hashname+": "+"�����ر������.....");
			out.close();
			out=null;
			log.info(hashname+": "+"�ر�������ɹ�.....");
		}
		if (in!=null) {
			log.info(hashname+": "+"�����ر�������.....");
			in.close();
			in=null;
			log.info(hashname+": "+"�ر��������ɹ�.....");
		}
	}
	
	/**
	 * ���{@link #log}��ֵ
	 * @return ��Ա����log (�������� Log)
	 */
	public Log getLog() {
		return log;
	}
	/**
	 * ���{@link #req}��ֵ
	 * @return ��Ա����req (�������� HttpServletRequest)
	 */
	public HttpServletRequest getReq() {
		return req;
	}
	/**
	 * ���{@link #resp}��ֵ
	 * @return ��Ա����resp (�������� HttpServletResponse)
	 */
	public HttpServletResponse getResp() {
		return resp;
	}
	/**
	 * ���ó�Ա����{@link #log}��ֵ
	 * @param log ��Ա���� (�������� Log)
	 */
	public void setLog(Log log) {
		this.log = log;
	}
	/**
	 * ���ó�Ա����{@link #req}��ֵ
	 * @param req ��Ա���� (�������� HttpServletRequest)
	 */
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	/**
	 * ���ó�Ա����{@link #resp}��ֵ
	 * @param resp ��Ա���� (�������� HttpServletResponse)
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