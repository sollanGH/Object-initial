package swing�������;

import java.awt.*;
import javax.swing.*;

public class Panel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		JPanel panel = new JPanel();
		JButton button = new JButton("��ť");

		panel.setBackground(Color.pink);// �������ı�����ɫ

		panel.add(button);// ����ť��ӵ������ȥ
		frame.add(panel);// �������ӵ������

		frame.setLayout(null);// ����ܵ�Ĭ�ϲ��ֹ�������Ϊ��
		panel.setLocation(30, 30);// �������ĳ�ʼλ��
		frame.setSize(800, 600);
		frame.setLocation(600, 300);// ���ÿ�ܵĳ�ʼλ��

		panel.setSize(400, 400);// �������Ĵ�С
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
