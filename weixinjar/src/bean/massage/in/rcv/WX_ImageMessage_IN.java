package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ͼƬ��Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:00:43
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_ImageMessage_IN extends WX_BaseMessage_IN{
	/**
	 * ͼƬ����
	 */
	private String PicUrl;
	
	/**
	 * ���{@link #PicUrl}��ֵ
	 * @return ��Ա����PicUrl (�������� String)
	 */
	public String getPicUrl() {
		return PicUrl;
	}

	/**
	 * ���ó�Ա����{@link #PicUrl}��ֵ
	 * @param picUrl ��Ա���� (�������� String)
	 */
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	@Override
	public String toString() {
		return "WX_ImageMessage_IN [PicUrl=" + PicUrl + "]";
	}
}
