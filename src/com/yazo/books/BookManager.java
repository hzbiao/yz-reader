package com.yazo.books;

public class BookManager {
	public String header = "abc";
	public BrowserContent[] contents;
	
	public BookManager(){
		header = "header ���±��� 01";
		contents = new BrowserContent[3];
		contents[0] = new BrowserContent("text", "this is some text������һЩ���֡�");
		contents[1] = new BrowserContent("link", "a link,һ������", "1189.jpg");
		contents[2] = new BrowserContent("line", null);
	}
	public BrowserContent[] getHomePage(){
		BrowserContent[] contents = new BrowserContent[11];
		contents[0] = new BrowserContent("text", "this is some text������һЩ���֡�");
		contents[1] = new BrowserContent("link", "a link,һ������", "1189.jpg");
		contents[2] = new BrowserContent("line", null);
		contents[3] = new BrowserContent("link", "a link,һ������", "1189.jpg");
		contents[4] = new BrowserContent("line", null);
		contents[5] = new BrowserContent("link", "a link,һ������", "1189.jpg");
		contents[6] = new BrowserContent("line", null);
		contents[7] = new BrowserContent("link", "a link,һ������", "1189.jpg");
		contents[8] = new BrowserContent("line", null);
		contents[9] = new BrowserContent("text", "this is some short text������һЩ�����֡�");
		contents[10] = new BrowserContent("text", "this is some long text������һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�����һЩ�����֡�");
		return contents;
	}
	
}
