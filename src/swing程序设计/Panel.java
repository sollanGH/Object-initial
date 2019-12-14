package swing程序设计;

import java.awt.*;
import javax.swing.*;

public class Panel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗口");
		JPanel panel = new JPanel();
		JButton button = new JButton("按钮");

		panel.setBackground(Color.pink);// 设置面板的背景颜色

		panel.add(button);// 将按钮添加到面板中去
		frame.add(panel);// 将面板添加到框架中

		frame.setLayout(null);// 将框架的默认布局管理器设为空
		panel.setLocation(30, 30);// 设置面板的初始位置
		frame.setSize(800, 600);
		frame.setLocation(600, 300);// 设置框架的初始位置

		panel.setSize(400, 400);// 设置面板的大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/
