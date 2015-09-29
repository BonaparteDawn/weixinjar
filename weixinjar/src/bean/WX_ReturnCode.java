package bean;

import util.WX_Static;

/**
 * 
 * 接口返回码
 * @author YanFuzhong
 * @date 2015-9-29 上午09:34:28
 * @version
 */
public class WX_ReturnCode {
	/**
	 * 返回码
	 */
	private String errcode;
	/**
	 * 返回码的说明
	 */
	private String errmsg;
	/**
	 * 返回码外文说明
	 */
	private String foreignErrmsg;
	/**
	 * 获得{@link #errcode}的值
	 * @return 成员变量errcode (数据类型 String)
	 */
	public String getErrcode() {
		return errcode;
	}
	/**
	 * 获得{@link #errmsg}的值
	 * @return 成员变量errmsg (数据类型 String)
	 */
	public String getErrmsg() {
		return errmsg;
	}
	/**
	 * 设置成员变量{@link #errcode}的值
	 * @param errcode 成员变量 (数据类型 String)
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
		setForeignErrmsg(WX_Static.RETURNCODE_MANAGER.getValue(errcode));
	}
	/**
	 * 设置成员变量{@link #errmsg}的值
	 * @param errmsg 成员变量 (数据类型 String)
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	/**
	 * 获得{@link #foreignErrmsg}的值
	 * @return 成员变量foreignErrmsg (数据类型 String)
	 */
	public String getForeignErrmsg() {
		return foreignErrmsg;
	}
	/**
	 * 设置成员变量{@link #foreignErrmsg}的值
	 * @param foreignErrmsg 成员变量 (数据类型 String)
	 */
	public void setForeignErrmsg(String foreignErrmsg) {
		this.foreignErrmsg = foreignErrmsg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ReturnCode [errcode=" + errcode + ", errmsg=" + errmsg
				+ ", foreignErrmsg=" + foreignErrmsg + "]";
	}
}
