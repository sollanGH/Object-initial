package swing�������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogTest {

	
//	JOptionPane.showMessageDialog(null,"������ʾ����!");
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
		JButton button = new JButton("�����Ӵ���");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JDialog dialog = new JDialog(frame, "�Ӵ���", true);
				dialog.setSize(200, 150);
				dialog.setLocation(700, 400);
				dialog.setVisible(true);

			}
		});
		
		frame.add(button);
		frame.setSize(600, 500);
		frame.setLocation(600, 300);
		frame.setVisible(true);

	}

}
/*
 * ���췽�� : 
 * public JDialog(Frame f); 
 * public JDialog(Frame f,String title); 
 * public JDialog(Frame f,String title,boolean model); //�����塢���ڱ��⡢ָ������
 * 
 * �ŵ�:û����С�������
 * �����������Եķ�����JFrame����
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