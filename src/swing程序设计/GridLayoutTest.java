package swing�������;

import java.awt.*;
import javax.swing.*;

public class GridLayoutTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		JButton button01 = new JButton("01");
		JButton button02 = new JButton("02");
		JButton button03 = new JButton("03");
		JButton button04 = new JButton("04");
		JButton button05 = new JButton("05");
		JButton button06 = new JButton("06");
		frame.setLayout(new GridLayout(3, 2,2,10));// �����ֹ���������Ϊ���񲼾�,��������3��2��,ˮƽ���2��ֱ���10
		frame.add(button01);
		frame.add(button02);
		frame.add(button03);
		frame.add(button04);
		frame.add(button05);
		frame.add(button06);
		frame.pack();// �˷������Ե������ڴ�С��ʹ�����������

		frame.setLocation(600, 300);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}


/*
 * ���췽��:
 * public GridLayout(3,3);
 * public GridLayout(3,3,10,10); //�С��С�ˮƽ��ࡢ��ֱ���
 * 
 * 
*/











