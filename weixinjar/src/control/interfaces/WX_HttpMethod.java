package control.interfaces;
/**
 * 
 * HTTP����ӿ�
 * @author YanFuzhong
 * @date 2015-9-26 ����04:51:45
 * @version
 */
public interface WX_HttpMethod {
	/**
	 * HTTP��GET����
	 * @param get
	 */
	public void get(WX_Run get);
	/**
	 * HTTP��POST����
	 * @param post
	 */
	public void post(WX_Run post);
}
