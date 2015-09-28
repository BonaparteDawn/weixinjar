package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 视频消息
 * @author YanFuzhong
 * @date 2015-9-24 下午09:53:59
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VideoMessage_IN  extends WX_BaseMessage_IN {
	/**
	 * 视频消息媒体ID
	 */
	private String MediaId;
	/**
	 * 视频消息缩略图的媒体ID
	 */
	private String ThumbMediaId;
	
	/**
	 * 获得{@link #MediaId}的值
	 * @return 成员变量MediaId (数据类型 String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * 获得{@link #ThumbMediaId}的值
	 * @return 成员变量ThumbMediaId (数据类型 String)
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	/**
	 * 设置成员变量{@link #MediaId}的值
	 * @param mediaId 成员变量 (数据类型 String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	/**
	 * 设置成员变量{@link #ThumbMediaId}的值
	 * @param thumbMediaId 成员变量 (数据类型 String)
	 */
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return "WX_VideoMessage_IN [MediaId=" + MediaId + ", ThumbMediaId="
				+ ThumbMediaId + "]";
	}
}
