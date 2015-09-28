package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * 视频模型
 * @author YanFuzhong
 * @date 2015-9-24 下午10:05:37
 * @version 1.0
 */
public class WX_Video  extends WX_Object{
	/**
	 * 媒体文件ID
	 */
	private String MediaId;
	/**
	 * 缩略图的媒体ID
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
		return "Video [MediaId=" + MediaId + ", ThumbMediaId=" + ThumbMediaId
				+ "] ";
	}
	
}
