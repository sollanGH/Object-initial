package swing程序设计;

import java.awt.List;

import javax.swing.JFrame;

public class ListTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("列表框");
		String str1 = "琪亚娜";
		String str2 = "芽衣";
		String str3 = "布诺妮亚";
		String str4 = "姬子";
		String str5 = "德莉莎";
		String str6 = "希儿";
		String str7 = "九霄";

		List list = new List(4, true);// 可见行数、可多选
		
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
