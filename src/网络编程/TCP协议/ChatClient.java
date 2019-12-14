package ������.TCPЭ��;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

@SuppressWarnings("serial")
public class ChatClient extends Frame {
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private DataOutputStream dos = null;
	private DataInputStream dis = null;
	private Socket socket = null;
	private boolean bConnected = false;
	private Thread thread = null;

	public static void main(String[] args) {
		new ChatClient().frameClient();
	}

	public void frameClient() {
		setSize(400, 400);
		setLocation(400, 300);
		add(ta, BorderLayout.NORTH);
		add(tf, BorderLayout.SOUTH);
		pack();
		tf.addActionListener(new TfListener());
		// �رմ����¼�����
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				disconnected();
				System.exit(0);
			}
		});
		this.connect();
		setVisible(true);
	}

	// ���ӷ�������ַ
	private void connect() {
		try {
			socket = new Socket("127.0.0.1", 8888);
			thread = new Thread(new ChatThread());
			thread.start();
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �Ͽ�����
	private void disconnected() {
		bConnected = false;
		try {
			dos.close();
			dis.close();
			socket.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// ���̻س��¼�
	private class TfListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String strMsg = tf.getText();
			tf.setText("");
			try {
				dos.writeUTF(strMsg);
				dos.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	// �����߳̽��ܷ�������Ϣ
	private class ChatThread implements Runnable {
		@Override
		public void run() {
			try {
				bConnected = true;
				while (bConnected) {
					String msg = dis.readUTF();
					String taText = ta.getText();
					ta.setText(taText + msg + "\n");
				}
			} catch (SocketException e) {
				System.out.println("�˳�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
