package swing程序设计;

import java.awt.*;
import javax.swing.*;

public class GridLayoutTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗口");
		JButton button01 = new JButton("01");
		JButton button02 = new JButton("02");
		JButton button03 = new JButton("03");
		JButton button04 = new JButton("04");
		JButton button05 = new JButton("05");
		JButton button06 = new JButton("06");
		frame.setLayout(new GridLayout(3, 2,2,10));// 将布局管理器设置为网格布局,并给参数3行2列,水平间距2垂直间距10
		frame.add(button01);
		frame.add(button02);
		frame.add(button03);
		frame.add(button04);
		frame.add(button05);
		frame.add(button06);
		frame.pack();// 此方法可以调整窗口大小，使组件紧凑排列

		frame.setLocation(600, 300);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}


/*
 * 构造方法:
 * public GridLayout(3,3);
 * public GridLayout(3,3,10,10); //行、列、水平间距、垂直间距
 * 
 * 
*/











