package swing程序设计;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogTest {

	
//	JOptionPane.showMessageDialog(null,"弹出提示窗口!");
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("父窗口");
		JButton button = new JButton("弹出子窗口");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JDialog dialog = new JDialog(frame, "子窗口", true);
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
 * 构造方法 : 
 * public JDialog(Frame f); 
 * public JDialog(Frame f,String title); 
 * public JDialog(Frame f,String title,boolean model); //父窗体、窗口标题、指定类型
 * 
 * 优点:没有最小化和最大化
 * 设置其他属性的方法与JFrame类似
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