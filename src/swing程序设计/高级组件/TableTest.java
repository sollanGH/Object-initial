package swing�������.�߼����;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest {

	static JFrame frame = new JFrame("���");// ������ֿ�дҲ�У�������

	public void table() {
		String[][] rowData = { { "22", "40", "12:00" }, { "22", "39", "13:00" }, { "22", "38", "14:00" } };
		String[] columnNames = { "Ʊ��", "��Ʊ", "����ʱ��" };
		JTable table = new JTable(rowData, columnNames);// ���������ֱ�Ϊ��ÿһ�е����ݡ�����������

		JScrollPane scrollPane = new JScrollPane(table);// �����ճ�ڻ����ϡ�û�л��������ʾ��������
		frame.add(scrollPane);// ��������ӵ������
	}

	public static void main(String[] args) {
		frame.setSize(600, 500);
		frame.setLocation(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		TableTest sollan = new TableTest();
		sollan.table();
	}

}