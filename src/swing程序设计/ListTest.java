package swing�������;

import java.awt.List;

import javax.swing.JFrame;

public class ListTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("�б��");
		String str1 = "������";
		String str2 = "ѿ��";
		String str3 = "��ŵ����";
		String str4 = "����";
		String str5 = "����ɯ";
		String str6 = "ϣ��";
		String str7 = "����";

		List list = new List(4, true);// �ɼ��������ɶ�ѡ
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		list.add(str5);
		list.add(str6);
		list.add(str7);

		frame.add(list);
		frame.setSize(600, 400);
		frame.setLocation(600, 300);
		frame.setVisible(true);

	}

}
