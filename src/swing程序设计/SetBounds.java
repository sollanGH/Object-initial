package swing程序设计;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class SetBounds {// 【绝对布局setBounds的用法及其作用】

	public static void main(String[] args) {
		JFrame frame = new JFrame("框架");
		JLabel label01 = new JLabel("账号");
		JLabel label02 = new JLabel("密码");
		JButton button = new JButton("登录");

		frame.setLayout(null);// 将布局管理器设置为空，方可使用setBounds调节组件方位及大小

		label01.setBounds(50, 10, 30, 30);// 参数值分别为：组件左上角X、Y轴坐标，组件大小的W、H
		frame.getContentPane().add(label01);

		label02.setBounds(50, 30, 40, 40);
		frame.getContentPane().add(label02);

		button.setBounds(50, 90, 60, 40);// 相当于setLocation和setSize的功能总和
		frame.add(button);

		label01.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e) {
				label01.setForeground(Color.red);
				System.out.println("鼠标已点击!");
			}
		});

		frame.setSize(600, 600);
		frame.setLocation(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
