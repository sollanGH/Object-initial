package swing�������;

import javax.swing.*;

public class ActionEvent {

	public static void main(String[] args) {
		JFrame frame=new JFrame("����");
		JButton button=new JButton("��ť");
		
		MyEventListener mel=new MyEventListener();//��������������
		button.addActionListener(mel);//�԰�ťע����� (ʵ��mel��������Ӧ�ļ�������)
		
/*   
            button.addActionListener(new ActionListener() {		//ֱ���ڴ�������ʱ��ʵ�ּ������Ĺ���
��			public void actionPerformed(ActionEvent arg0) {
��				System.out.println("���ǵ����ť�����������¼�");
				JOptionPane.showMessageDialog(null,"����˰�ť��");
��			}
		});
*/
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLocation(600,300);
		

	}

}
