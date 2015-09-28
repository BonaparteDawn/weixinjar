package test.outmsg;

import java.util.ArrayList;
import java.util.List;

import bean.massage.out.rsp.WX_NewsMessage_OUT;
import bean.massage.out.rsp.mb.WX_Article;

import control.WX_XmlControler;

import util.WX_RESP_Util;
import util.WX_Static;

public class WX_NewsMessage_OUT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_NewsMessage_OUT out = new WX_NewsMessage_OUT();
		out.setArticleCount(1);
		List<WX_Article> articles = new ArrayList<WX_Article>();
		WX_Article temp = new WX_Article();
		temp.setDescription("desctiption");
		temp.setPicUrl("picUrl");
		temp.setTitle("title");
		temp.setUrl("url");
		articles.add(temp);
		out.setArticles(articles);
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		out.setMsgType(WX_RESP_Util.news);
		out.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(out));
	}

}
