package swing�������;

import java.awt.Color;
import javax.swing.*;

public class LabelTest {

	public static void main(String[] args) {
		String st = "���Ϻ�";// �ֲ�����
		JFrame frame = new JFrame("����");
		JPanel panel = new JPanel();
		JLabel label01 = new JLabel();// ������ǩ
		JLabel label02 = new JLabel();
		label01.setText("���");
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
		
		String a=label01.getText();//��ȡ��ǩ����
		System.out.println(a);
	}

}

/*
 * ���췽��:
 * public JLabel();
 * public JLabel(String text); //�ı�
 * public JLabel(String text,int aligment); //�ı��������ı�ˮƽ���뷽ʽ  Label.LEFT�����; Label.CENTER����; Label.RIGHT�Ҷ���;
 * 
 * label.setText();//���ñ�ǩ����
 * label.getText();//��ȡ��ǩ����
 * label.setAligment();//���ö��뷽ʽ
 * label.setBackground(color c);//���ñ�ǩ������ɫ
 * label.setForeground(Color c);//���ñ�ǩ���ı���ɫ
 * 
 * 
*/











