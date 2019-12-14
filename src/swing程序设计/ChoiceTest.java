package swing程序设计;

import java.awt.Choice;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoiceTest {// 下拉列表框

	public static void main(String[] args) {
		JFrame frame = new JFrame("下拉列表框");
		String str1 = "琪亚娜";
		String str2 = "芽衣";
		String str3 = "布诺妮亚";
		String str4 = "姬子";
		String str5 = "德莉莎";
		String str6 = "希儿";
		String str7 = "九霄";
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
 * 构造方法:
 * public Choice();//创建下拉列表框
 * 
 * 常用方法:
 * public  void    add(String name);//增加项、名
 * public  String  getSelectedItem();//返回当前被选中项的名称
 * 
 * public  int     getSelectedIndex();//返回当前被选中项的索引,第一项为0
 * public  void    insert(String name,int index);//在指定索引值处插入项
 * public  void    remove(String name);//删除名称为name的且索引值最小的那一项
 * public  int     getItemCount();//返回列表项总数
 * public  void    select(String name);//将名字为name的项设为选中状态，若有重名则选索引值最小的
 * public  void    remove(int index);//删除索引值为index的项
 * public  void    removeAll();//删除全部项
 * 
 * 
 * 
 * 
*/
















