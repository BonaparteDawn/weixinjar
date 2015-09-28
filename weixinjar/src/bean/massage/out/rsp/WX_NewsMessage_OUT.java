package bean.massage.out.rsp;
import java.util.List;

import bean.massage.out.rsp.mb.WX_Article;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 回复的图文消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:06:51
 * @version 1.0
 */
@XStreamAlias(value = "xml")
public class WX_NewsMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * 图文消息个数 (限制为10条以内)
	 */
	private int ArticleCount;
	/**
	 * 多条图文消息信息 (默认第一个item为大图)
	 */
	private List<WX_Article> Articles;
	
	/**
	 * 获得{@link #ArticleCount}的值
	 * @return 成员变量ArticleCount (数据类型 int)
	 */
	public int getArticleCount() {
		return ArticleCount;
	}

	/**
	 * 获得{@link #Articles}的值
	 * @return 成员变量Articles (数据类型 List<WX_Article>)
	 */
	public List<WX_Article> getArticles() {
		return Articles;
	}

	/**
	 * 设置成员变量{@link #ArticleCount}的值
	 * @param articleCount 成员变量 (数据类型 int)
	 */
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	/**
	 * 设置成员变量{@link #Articles}的值
	 * @param articles 成员变量 (数据类型 List<WX_Article>)
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
