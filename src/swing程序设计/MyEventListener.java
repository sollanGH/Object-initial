package swing�������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyEventListener implements ActionListener{//�¼�������������дһ������ʵ�ּ���

	public void actionPerformed(ActionEvent e) {
		System.out.println("���ǵ����ť�����������¼�");
		
		//������ʾ����
		JOptionPane.showMessageDialog(null,"����˰�ť��");
	}

	public void sollan() {
		System.out.println("11111");
	}
}
