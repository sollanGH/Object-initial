package swing程序设计;

import java.awt.Color;
import javax.swing.*;

public class LabelTest {

	public static void main(String[] args) {
		String st = "早上好";// 局部变量
		JFrame frame = new JFrame("窗口");
		JPanel panel = new JPanel();
		JLabel label01 = new JLabel();// 创建标签
		JLabel label02 = new JLabel();
		label01.setText("你好");
		label02.setText(st);
		// frame.setLayout(new FlowLayout());
		panel.setBackground(Color.pink);
		frame.add(panel);
		panel.add(label01);
		panel.add(label02);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocation(600, 300);
		frame.setVisible(true);
		
		String a=label01.getText();//获取标签内容
		System.out.println(a);
	}

}

/*
 * 构造方法:
 * public JLabel();
 * public JLabel(String text); //文本
 * public JLabel(String text,int aligment); //文本、设置文本水平对齐方式  Label.LEFT左对齐; Label.CENTER居中; Label.RIGHT右对齐;
 * 
 * label.setText();//设置标签内容
 * label.getText();//获取标签内容
 * label.setAligment();//设置对齐方式
 * label.setBackground(color c);//设置标签背景颜色
 * label.setForeground(Color c);//设置标签中文本颜色
 * 
 * 
*/











