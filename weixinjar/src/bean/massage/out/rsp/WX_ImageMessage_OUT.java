package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Image;

import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * �ظ���ͼƬ��Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:06:25
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_ImageMessage_OUT extends WX_BaseMessage_OUT{
	/**
	 * ͼƬ
	 */
	private WX_Image Image;
	
	/**
	 * ���{@link #Image}��ֵ
	 * @return ��Ա����Image (�������� WX_Image)
	 */
	public WX_Image getImage() {
		return Image;
	}

	/**
	 * ���ó�Ա����{@link #Image}��ֵ
	 * @param image ��Ա���� (�������� WX_Image)
	 */
	public void setImage(WX_Image image) {
		Image = image;
	}

	@Override
	public String toString() {
		return "WX_ImageMessage_OUT [Image=" + Image + "]";
	}
	
}
