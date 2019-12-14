package swing程序设计.高级组件;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest {

	static JFrame frame = new JFrame("表格");// 各组件分开写也行？！！！

	public void table() {
		String[][] rowData = { { "22", "40", "12:00" }, { "22", "39", "13:00" }, { "22", "38", "14:00" } };
		String[] columnNames = { "票价", "余票", "发车时间" };
		JTable table = new JTable(rowData, columnNames);// 两个参数分别为【每一行的数据】、【列名】

		JScrollPane scrollPane = new JScrollPane(table);// 将表格粘在滑条上。没有滑条表格将显示不完整。
		frame.add(scrollPane);// 将滑条添加到框架中
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