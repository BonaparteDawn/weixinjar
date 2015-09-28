package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * 图片模型
 * @author YanFuzhong
 * @date 2015-9-24 下午10:03:07
 * @version 1.0
 */
public class WX_Image  extends WX_Object{
	/**
	 * 媒体文件ID
	 */
	private String MediaId;
	
	/**
	 * 获得{@link #MediaId}的值
	 * @return 成员变量MediaId (数据类型 String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * 设置成员变量{@link #MediaId}的值
	 * @param mediaId 成员变量 (数据类型 String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	@Override
	public String toString() {
		return "WX_Image [MediaId=" + MediaId + "]";
	}
	
}
