package bean.massage.out.rsp;
import java.util.List;

import bean.massage.out.rsp.mb.WX_Article;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * �ظ���ͼ����Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:06:51
 * @version 1.0
 */
@XStreamAlias(value = "xml")
public class WX_NewsMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * ͼ����Ϣ���� (����Ϊ10������)
	 */
	private int ArticleCount;
	/**
	 * ����ͼ����Ϣ��Ϣ (Ĭ�ϵ�һ��itemΪ��ͼ)
	 */
	private List<WX_Article> Articles;
	
	/**
	 * ���{@link #ArticleCount}��ֵ
	 * @return ��Ա����ArticleCount (�������� int)
	 */
	public int getArticleCount() {
		return ArticleCount;
	}

	/**
	 * ���{@link #Articles}��ֵ
	 * @return ��Ա����Articles (�������� List<WX_Article>)
	 */
	public List<WX_Article> getArticles() {
		return Articles;
	}

	/**
	 * ���ó�Ա����{@link #ArticleCount}��ֵ
	 * @param articleCount ��Ա���� (�������� int)
	 */
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	/**
	 * ���ó�Ա����{@link #Articles}��ֵ
	 * @param articles ��Ա���� (�������� List<WX_Article>)
	 */
	public void setArticles(List<WX_Article> articles) {
		Articles = articles;
	}

	@Override
	public String toString() {
		return "WX_NewsMessage_OUT [ArticleCount=" + ArticleCount
				+ ", Articles=" + Articles + "]";
	}
	
}
