package swing�������;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {// �ı���
	JFrame frame;
	JTextField text;
	JButton button;
	String st;

	public void login() {
		frame = new JFrame("����");
		text = new JTextField("", 20);// �������� �Լ� ���ó���
		button = new JButton("��ȡ");

		frame.setLayout(new FlowLayout());
		frame.add(text);
		frame.add(button);
		button.addActionListener(new ActionListener() { // ���ð�ť���� �� ʵ�ְ�ť����

			public void actionPerformed(ActionEvent arg0) {
				st = text.getText();// ��ȡ�ı���������
				System.out.println(st);
			}
		});

		frame.setBounds(600, 300, 300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		TextField sollan = new TextField();
		sollan.login();

	}

}
/*
 * ���췽��:
 * public TextField();//�������ı���
 * public TextField(String str);//�����г�ʼ�ı����ı���
 * 
 * public TextField(int columns);//����������columns���ַ��Ŀ��ı���
 * public TextField(String str,int columns);//�����г�ʼ�ı�,������columns���ַ����ı���
 * 
 * ���÷���:
 * text.setTest();  //�����ı���������
 * text.getTest();  //��ȡ�ı���������
 * 
 * text.getSelectedText();//�����ı����б�ѡ�е��ı�
 * text.setEditable(boolean b);//�����ı���Ŀɱ༭״̬,false���ɱ༭��true�ɱ༭
 * text.setBackground(Color c);//���ñ�����ɫ
 * text.setForeground(Color c);//����������ɫ
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
