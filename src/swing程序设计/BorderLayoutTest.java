package swing�������;

import javax.swing.*;

public class BorderLayoutTest {

	public static void main(String[] args) {
		JFrame frame=new JFrame("����");
		JButton button01=new JButton("EAST");
		JButton button02=new JButton("WEST");
		JButton button03=new JButton("SOUTH");
		JButton button04=new JButton("NORTH");
		JButton button05=new JButton("CENTER");
		
		frame.add(button02,"West");//����borderlayout��Ĭ�ϲ��ֹ����������Բ���frame.setlayout(new flowlayout());�������
		frame.add(button01,"East");//��λ����ĸ��д��������
		frame.add(button03,"South");
		frame.add(button04,"North");
		frame.add(button05,"Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocation(600, 300);
		frame.setVisible(true);
	}

}
