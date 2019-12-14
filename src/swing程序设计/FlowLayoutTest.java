package swing程序设计;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {//从左到右，从上到下依次排列(默认位置居中)

	public static void main(String[] args) {
		JFrame frame=new JFrame("窗口");
		JButton button01=new JButton("按钮1");
		JButton button02=new JButton("按钮2");
		JButton button03=new JButton("按钮3");
		frame.setLayout(new FlowLayout()); //将框架的布局设置为FlowLayout
		frame.add(button01);
		frame.add(button02);
		frame.add(button03);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 300);
		frame.setSize(600,400);
		frame.setVisible(true);
		
	}

}
/*
 * 构造方法:
 * public FlowLayout();
 * public FlowLayout(int alignment); alignment=0靠左对齐 ;  alignment=1默认,居中 ;   alignment=2靠右对齐;
 * 
 * 
 * 
 * 
 * 
*/
