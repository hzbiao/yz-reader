package com.yazo.ui;

import java.util.Vector;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import com.yazo.books.*;
import com.yazo.util.Utils;

public class ScreenPages {
	int width, height;
	BrowserContent[] contents;
	Image[] screens;
	
	public ScreenPages(int width, int height){
		this.width = width;
		this.height = height;
		screens = new Image[20];
	}
	
	public void drawContents(BrowserContent[] contents){
		this.contents = contents;
		
		screens[0] = Image.createImage(width, height);
		Graphics g = screens[0].getGraphics();
		
		g.setColor(0x00FF00);
		int posy = 10;
		for(int i=0; i<contents.length; i++){
			posy += 16;
			BrowserContent bc = contents[i];
			Font f = Font.getFont(Font.FACE_MONOSPACE, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);
			int font_width1 = f.charWidth('��');//һ�����ֵĳ���
			int font_width2 = f.charWidth('a');//һ����Ϊ��ĸ�ĳ���
			
			
			if (bc.content_type == "text"){
				int string_width = f.stringWidth(bc.content);//һ��content�ĳ���
				System.out.println("����Ŀ��font_width="+font_width1+"\n��Ϊ�ַ��Ŀ��="+font_width2+"\n�ַ����ܳ���" +
						"="+string_width);
				if(width<string_width){
					Vector v = Utils.splitStr(f, bc.content, width);
					for(int j=0;j<v.size();j++){
					}
				}
			} else if (bc.content_type == "link"){
				g.drawString(bc.content, 10, posy, Graphics.BASELINE|Graphics.LEFT);
			} else if (bc.content_type == "line"){
				g.drawLine(10, posy, width, posy);
			}
		}
		g = null;
	}
	
	public Image getPage(int page){
		return screens[page];
	}
}
