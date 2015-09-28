package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * 音乐模型
 * @author YanFuzhong
 * @date 2015-9-24 下午10:04:36
 * @version 1.0
 */
public class WX_Music  extends WX_Object{
	/**
	 * 音乐标题
	 */
	private String Title;
	/**
	 * 音乐描述
	 */
	private String Description;
	/**
	 * 音乐链接
	 */
	private String MusicUrl;
	/**
	 * 高质量音乐链接 (WiFi环境优先使用该链接播放音乐)
	 */
	private String HQMusicUrl;
	/**
	 * 缩略图的媒体ID (通过上传的多媒体文件得到ID)
	 */
	private String ThumbMediaId;
	
	/**
	 * 获得{@link #Title}的值
	 * @return 成员变量Title (数据类型 String)
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * 获得{@link #Description}的值
	 * @return 成员变量Description (数据类型 String)
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * 获得{@link #MusicUrl}的值
	 * @return 成员变量MusicUrl (数据类型 String)
	 */
	public String getMusicUrl() {
		return MusicUrl;
	}

	/**
	 * 获得{@link #HQMusicUrl}的值
	 * @return 成员变量HQMusicUrl (数据类型 String)
	 */
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	/**
	 * 获得{@link #ThumbMediaId}的值
	 * @return 成员变量ThumbMediaId (数据类型 String)
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	/**
	 * 设置成员变量{@link #Title}的值
	 * @param title 成员变量 (数据类型 String)
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * 设置成员变量{@link #Description}的值
	 * @param description 成员变量 (数据类型 String)
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * 设置成员变量{@link #MusicUrl}的值
	 * @param musicUrl 成员变量 (数据类型 String)
	 */
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	/**
	 * 设置成员变量{@link #HQMusicUrl}的值
	 * @param hQMusicUrl 成员变量 (数据类型 String)
	 */
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
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
		return "Music [Title=" + Title + ", Description=" + Description
				+ ", MusicUrl=" + MusicUrl + ", HQMusicUrl=" + HQMusicUrl
				+ ", ThumbMediaId=" + ThumbMediaId + "] ";
	}
	
}
