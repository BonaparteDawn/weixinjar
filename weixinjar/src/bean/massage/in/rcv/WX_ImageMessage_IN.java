package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 图片消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:00:43
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_ImageMessage_IN extends WX_BaseMessage_IN{
	/**
	 * 图片链接
	 */
	private String PicUrl;
	
	/**
	 * 获得{@link #PicUrl}的值
	 * @return 成员变量PicUrl (数据类型 String)
	 */
	public String getPicUrl() {
		return PicUrl;
	}

	/**
	 * 设置成员变量{@link #PicUrl}的值
	 * @param picUrl 成员变量 (数据类型 String)
	 */
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	@Override
	public String toString() {
		return "WX_ImageMessage_IN [PicUrl=" + PicUrl + "]";
	}
}
