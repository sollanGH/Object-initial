package swing程序设计;

import javax.swing.*;

public class ActionEvent {

	public static void main(String[] args) {
		JFrame frame=new JFrame("窗口");
		JButton button=new JButton("按钮");
		
		MyEventListener mel=new MyEventListener();//建立监听器对象
		button.addActionListener(mel);//对按钮注册监听 (实现mel对象所对应的监听方法)
		
/*   
            button.addActionListener(new ActionListener() {		//直接在创建监听时就实现监听器的功能
方			public void actionPerformed(ActionEvent arg0) {
法				System.out.println("这是点击按钮后所产生的事件");
				JOptionPane.showMessageDialog(null,"点击了按钮！");
二			}
		});
*/
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLocation(600,300);
		

	}

}
