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
	
}
