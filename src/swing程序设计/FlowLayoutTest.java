package swing�������;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {//�����ң����ϵ�����������(Ĭ��λ�þ���)

	public static void main(String[] args) {
		JFrame frame=new JFrame("����");
		JButton button01=new JButton("��ť1");
		JButton button02=new JButton("��ť2");
		JButton button03=new JButton("��ť3");
		frame.setLayout(new FlowLayout()); //����ܵĲ�������ΪFlowLayout
		frame.add(button01);
		frame.add(button02);
		frame.add(button03);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 300);
		frame.setSize(600,400);
		frame.setVisible(true);
		
	}

}
/*
 * ���췽��:
 * public FlowLayout();
 * public FlowLayout(int alignment); alignment=0������� ;  alignment=1Ĭ��,���� ;   alignment=2���Ҷ���;
 * 
 * 
 * 
 * 
 * 
*/
