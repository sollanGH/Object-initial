package swing程序设计;

import java.awt.Color;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.*;

public class TextArea {//文本域

	public static void main(String[] args) {
		JFrame frame=new JFrame("文本域");
		JTextArea area=new JTextArea("这是一个文本域",30,10);//文本、指定行数、列数
		JScrollPane spanel=new JScrollPane(area);
		area.setBackground(Color.pink);
		frame.add(spanel);
		frame.setSize(600, 400);
		frame.setLocation(600, 300);
		frame.setVisible(true);
		

	}

}
/*
 * 构造方法:
 * public TextArea();//空文本域
 * public TextArea(int rowa,int columns);//指定行数、列数
 * public TextArea(String str,int r,int c);//指定文字、行数、列数
 * public TextArea(String str,int r,int c,int scrollbar);//指定文字、行数、列数、滑动条的状态
 * 
 * 常用方法:
 * public String getText();//返回文本区中的文字
 * public void setText(String str);//设置文本区中的文字
 * public void append(String str);//在文本末端添加文字
 * 
 * public String getSelectedText();//返回文本域中选中的文字
 * public int getSelectionStart();//返回文本域中选中文字的起始位置
 * public int get SelectioneEnd();//返回文本域中选中文字的末尾位置
 * public void insert(String str,int pos);//将字符串添加到文本域指定位置
 * public void replaceRange(String str,int start,int end);//用字符串代替从start到end之间的文本
 * 
 * 
 * 
 * 
 * 事件：
 * TextEvent  TextListener接口 当文本内容发生改变时触发事件
 * MouseEvent  MouseMotionListener接口
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/









