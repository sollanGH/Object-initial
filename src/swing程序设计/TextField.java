package swing程序设计;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {// 文本框
	JFrame frame;
	JTextField text;
	JButton button;
	String st;

	public void login() {
		frame = new JFrame("窗口");
		text = new JTextField("", 20);// 设置内容 以及 设置长度
		button = new JButton("获取");

		frame.setLayout(new FlowLayout());
		frame.add(text);
		frame.add(button);
		button.addActionListener(new ActionListener() { // 设置按钮监听 并 实现按钮内容

			public void actionPerformed(ActionEvent arg0) {
				st = text.getText();// 获取文本框内内容
				System.out.println(st);
			}
		});

		frame.setBounds(600, 300, 300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		TextField sollan = new TextField();
		sollan.login();

	}

}
/*
 * 构造方法:
 * public TextField();//创建空文本框
 * public TextField(String str);//创建有初始文本的文本框
 * 
 * public TextField(int columns);//创建能容纳columns个字符的空文本框
 * public TextField(String str,int columns);//创建有初始文本,能容纳columns个字符的文本框
 * 
 * 常用方法:
 * text.setTest();  //设置文本框内内容
 * text.getTest();  //获取文本框内内容
 * 
 * text.getSelectedText();//返回文本框中被选中的文本
 * text.setEditable(boolean b);//设置文本框的可编辑状态,false不可编辑、true可编辑
 * text.setBackground(Color c);//设置背景颜色
 * text.setForeground(Color c);//设置字体颜色
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
