package ������.TCPЭ��;

import java.io.*;
import java.net.*;
import message.Message;

public class Server {

	/*---------��----ȡ----��----��----��----��----��---------------------------------------*/

	private void read() {
		try {
			// �����������׽���
			ServerSocket server = new ServerSocket(2333);
			System.out.println("�������ѿ�����");

			// �������ӿͻ��˵��׽��֣�����ʹ��accept()����
			Socket so = server.accept();
			System.out.println("�пͻ������ӹ���");

			// ���׽����еġ��ֽڡ�����ת��Ϊ���ַ�������
			InputStreamReader isr = new InputStreamReader(so.getInputStream());
			// ��ȡ����ʱ�����ַ�������������
			BufferedReader br = new BufferedReader(isr);
			// !!!![�������Ķ���ǧ��Ҫд��while���棬��Ȼbr���󽫱����´��������¶�ȡû��������]
			while (true) {

				// �ַ���������readLine()������ȡ�ַ����ܷ���; ����������brδcloseǰ,readLine()���ס�������������ݡ�
				String str = br.readLine();
				// �ر���
				System.out.println("���Կͻ��˵���Ϣ��" + str);
				if (str.equals("Hello Server!10")) {
					br.close();
					break;
				}

			}
		} catch (IOException w) {
			w.printStackTrace();
		}
	}

	/*--------��----��----��----��----д----��----��----��------------------------------------------------*/

	private void write() {
		try {
			// �����������׽���
			ServerSocket ser = new ServerSocket(2333);
			System.out.println("�������ѿ�����");
			// �������ӿͻ��˵��׽��֣�����ʹ��accept()����
			Socket so = ser.accept();
			System.out.println("�пͻ������ӹ���");
			// PrintWriterר������д�ַ������ݵ�socket
			PrintWriter pw = new PrintWriter(so.getOutputStream());

			for (int i = 1; i <= 10; i++) {
				// ����д���ַ����ķ���
				pw.println("Hello Client! "+i);

			}
			// �ر���
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void ObjectRead() {
		try {
			// �����������׽���
			ServerSocket server = new ServerSocket(2333);
			System.out.println("�������ѿ�����");

			while (true) {

				Socket so = server.accept();
				// �������ӿͻ��˵��׽��֣�����ʹ��accept()����
				System.out.println("�пͻ������ӹ���");
				InputStream is = so.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				Object one = ois.readObject();
				Message se = (Message) one;
				Message ss = new Message();

				System.out.println("���Կͻ��˵���Ϣ��" + ss.name);
				System.out.println("���Կͻ��˵���Ϣ��" + ss.pwd);

			}
		} catch (IOException | ClassNotFoundException w) {
			w.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server s = new Server();
		s.write();
		// s.read();
		// s.ObjectRead();
	}
}
