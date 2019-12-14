package swing程序设计;

import javax.swing.*;

public class BorderLayoutTest {

	public static void main(String[] args) {
		JFrame frame=new JFrame("窗口");
		JButton button01=new JButton("EAST");
		JButton button02=new JButton("WEST");
		JButton button03=new JButton("SOUTH");
		JButton button04=new JButton("NORTH");
		JButton button05=new JButton("CENTER");
		
		frame.add(button02,"West");//由于borderlayout是默认布局管理器，所以不用frame.setlayout(new flowlayout());这种语句
		frame.add(button01,"East");//方位首字母大写，带引号
		frame.add(button03,"South");
		frame.add(button04,"North");
		frame.add(button05,"Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocation(600, 300);
		frame.setVisible(true);
	}

}
