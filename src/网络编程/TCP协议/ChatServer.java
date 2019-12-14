package ������.TCPЭ��;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	private boolean started = false;
	private List<ChatThread> chatThreads = new ArrayList<ChatThread>();

	public static void main(String[] args) {
		new ChatServer().startServer();
	}

	private void startServer() {
		try {
			// ���������Socket
			ServerSocket seso = new ServerSocket(8888);
			started = true;
			while (started) {
				// ���ܿͻ�����������
				Socket sos = seso.accept();
				System.out.println("һ���ͻ���������");
				// �����̴߳���ͻ���ͨ��
				ChatThread ct = new ChatThread(sos);
				chatThreads.add(ct);
				new Thread(ct).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private class ChatThread implements Runnable {
		private Socket socket;
		private DataInputStream din = null;
		private DataOutputStream don = null;
		private boolean bConnected = false;

		public ChatThread(Socket socket) {
			super();
			this.socket = socket;
		}

		// ������Ϣ�ĺ���
		private void send(String strMsgIn) {
			try {
				don.writeUTF(strMsgIn);
				don.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				din = new DataInputStream(socket.getInputStream());
				don = new DataOutputStream(socket.getOutputStream());
				// ��ȡ����
				bConnected = true;
				while (bConnected) {
					String strMsgIn = din.readUTF();
					System.out.println(strMsgIn);
					// ���յ����ݺ��͸�ÿ���ͻ���
					for (int i = 0; i < chatThreads.size(); i++) {
						chatThreads.get(i).send(strMsgIn);
					}
				}
			} catch (IOException e) {
				try {
					// ����ͻ��˳����رգ�ֱ�ӹر����ӣ����Ƴ�List�еĵ�ǰ�߳�
					socket.close();
					chatThreads.remove(this);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} finally {
				try {
					din.close();
					don.close();
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
