package swing程序设计;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyEventListener implements ActionListener{//事件监听器，单独写一个类来实现监听

	public void actionPerformed(ActionEvent e) {
		System.out.println("这是点击按钮后所产生的事件");
		
		//弹出提示窗口
		JOptionPane.showMessageDialog(null,"点击了按钮！");
	}

	public void sollan() {
		System.out.println("11111");
	}
}
