package swing�������;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class SetBounds {// �����Բ���setBounds���÷��������á�

	public static void main(String[] args) {
		JFrame frame = new JFrame("���");
		JLabel label01 = new JLabel("�˺�");
		JLabel label02 = new JLabel("����");
		JButton button = new JButton("��¼");

		frame.setLayout(null);// �����ֹ���������Ϊ�գ�����ʹ��setBounds���������λ����С

		label01.setBounds(50, 10, 30, 30);// ����ֵ�ֱ�Ϊ��������Ͻ�X��Y�����꣬�����С��W��H
		frame.getContentPane().add(label01);

		label02.setBounds(50, 30, 40, 40);
		frame.getContentPane().add(label02);

		button.setBounds(50, 90, 60, 40);// �൱��setLocation��setSize�Ĺ����ܺ�
		frame.add(button);

		label01.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e) {
				label01.setForeground(Color.red);
				System.out.println("����ѵ��!");
			}
		});

		frame.setSize(600, 600);
		frame.setLocation(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
