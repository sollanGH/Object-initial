package swing�������;

import java.awt.Choice;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoiceTest {// �����б��

	public static void main(String[] args) {
		JFrame frame = new JFrame("�����б��");
		String str1 = "������";
		String str2 = "ѿ��";
		String str3 = "��ŵ����";
		String str4 = "����";
		String str5 = "����ɯ";
		String str6 = "ϣ��";
		String str7 = "����";
		Choice choice = new Choice();
		choice.add(str1);
		choice.add(str2);
		choice.add(str3);
		choice.add(str4);
		choice.add(str5);
		choice.add(str6);
		choice.add(str7);
		
		frame.add(choice);
		frame.setSize(600, 400);
		frame.setLocation(600, 300);
		frame.setVisible(true);

	}

	 public void copi() {
		 
	 JFrame frame = new JFrame("");
	 JPanel panel=new JPanel();
	 frame.add(panel);
	 frame.setSize(600, 400);
	 frame.setLocation(600, 300);
	 frame.setVisible(true);
	 
	 }

}

/*
 * ���췽��:
 * public Choice();//���������б��
 * 
 * ���÷���:
 * public  void    add(String name);//�������
 * public  String  getSelectedItem();//���ص�ǰ��ѡ���������
 * 
 * public  int     getSelectedIndex();//���ص�ǰ��ѡ���������,��һ��Ϊ0
 * public  void    insert(String name,int index);//��ָ������ֵ��������
 * public  void    remove(String name);//ɾ������Ϊname��������ֵ��С����һ��
 * public  int     getItemCount();//�����б�������
 * public  void    select(String name);//������Ϊname������Ϊѡ��״̬������������ѡ����ֵ��С��
 * public  void    remove(int index);//ɾ������ֵΪindex����
 * public  void    removeAll();//ɾ��ȫ����
 * 
 * 
 * 
 * 
*/
















