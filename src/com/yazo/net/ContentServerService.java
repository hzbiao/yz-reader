package com.yazo.net;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParser;
import com.yazo.books.LineContent;

public class ContentServerService {
	public static LineContent getAndParseContent(String page_url, int line_chars) {
		HttpConnection conn;
		LineContent c = null;
		try {
			conn = (HttpConnection)Connector.open(page_url, Connector.READ );
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			KXmlParser parser = new KXmlParser();
			c = new LineContent(line_chars);
			parser.setInput(conn.openInputStream(), "utf-8");
			parser.nextTag();
			parser.require(XmlPullParser.START_TAG, null, "page");
			while (parser.nextTag()!=XmlPullParser.END_TAG){
				parser.require(XmlPullParser.START_TAG, null, null);
				String name = parser.getName();
				if (name.equals("header")){
					c.header = parser.nextText();
				} else if (name.equals("content")){
					while(parser.nextTag()!=XmlPullParser.END_TAG){
						parser.require(XmlPullParser.START_TAG, null, null);
						String nn = parser.getName();
						if (nn.equals("link")){
							String arrow, text, desc, url;
							arrow = text = desc = url = null;
							while(parser.nextTag()!=XmlPullParser.END_TAG){
								parser.require(XmlPullParser.START_TAG, null, null);
								String n = parser.getName();
								String t = parser.nextText();
								if (n.equals("arrow"))	arrow = t;
								else if (n.equals("text")) text = t;
								else if (n.equals("desc")) desc = t;
								else if (n.equals("url")) url = t;
								parser.require(XmlPullParser.END_TAG, null, n);
							}
							c.addLink(arrow, text, desc, url);
						}else if(nn.equals("text")){
							c.addText(parser.nextText());
						}
						parser.require(XmlPullParser.END_TAG, null, nn);
					}
				}
				parser.require(XmlPullParser.END_TAG, null, name);
			}
			parser.require(XmlPullParser.END_TAG, null, "page");
		} catch (Exception e) {
			e.printStackTrace();
			c = null;
		}
		return c;
	}
}