package control.interfaces;
/**
 * 
 * HTTP请求接口
 * @author YanFuzhong
 * @date 2015-9-26 下午04:51:45
 * @version
 */
public interface WX_HttpMethod {
	/**
	 * HTTP的GET请求
	 * @param get
	 */
	public void get(WX_Run get);
	/**
	 * HTTP的POST请求
	 * @param post
	 */
	public void post(WX_Run post);
}
