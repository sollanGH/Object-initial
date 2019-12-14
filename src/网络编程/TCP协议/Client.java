package ������.TCPЭ��;

import java.io.*;
import java.net.Socket;
import message.Message;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3077743347276626091L;

	// Ҫ���䵽�������˵ı���
	int i = 100;
	double d = 12.25;
	String name = "Client's String";

	/*----------��----ȡ----��----��----��----��----Ϣ--------------------------------*/

	public void read() {
		try {
			// �����ͻ����׽��֣���д�롾��������ַ���롾�˿ںš�
			Socket so = new Socket("127.0.0.1", 2333);
			System.out.println("�����ӵ�������");
			// ��д��ġ��ַ�������ת��Ϊ���ֽڡ�����
			InputStreamReader isr = new InputStreamReader(so.getInputStream());
			// ��ȡ����ʱ�����ַ�������������
			BufferedReader reader = new BufferedReader(isr);
			String str;
			
			while ((str=reader.readLine())!=null) {
				// �ַ���������readLine()������ȡ�ַ����ܷ���
				str = reader.readLine();
				System.out.println("�������˷�������Ϣ��" + str);
				if (str.equals("Hello Client! 10")) {
					// �ر���
					reader.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*--------PrintWriter----д----��----��----��-----------------------------------------*/

	public void write() {
		try {
			// �����ͻ����׽��֣���д�롾��������ַ���롾�˿ںš�
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("�����ӵ�������");
			// PrintWriterר������д�ַ������ݵ�socket,Ҳӵ�н����ֽڡ�ת��Ϊ���ַ���������
			PrintWriter pw = new PrintWriter(sk.getOutputStream());
			// ����д���ַ����ķ���
			int i = 1;
			while (true) {
				pw.println("Hello Server!" + i);
				pw.flush();
				i++;
				if (i > 15) {
					// �ر���
					pw.close();
					break;
				}
			}

		} catch (IOException p) {
			p.printStackTrace();
		}
	}

	/*-------BufferedWriter----д----��----��----��-------------------------------------*/

	public void OtherWrit() {
		try {
			// �����ͻ����׽��֣���д�롾��������ַ���롾�˿ںš�
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("�����ӵ�������");
			// ������ġ��ַ�������ת��Ϊ���ֽڡ�����
			OutputStreamWriter osw = new OutputStreamWriter(sk.getOutputStream());
			// ��д����ַ������뻺������Ȼ���ͳ�
			BufferedWriter bw = new BufferedWriter(osw);
			// ����д���ַ����ķ���
			bw.write("Hello Client!");
			// �ر���
			bw.close();

		} catch (IOException p) {
			p.printStackTrace();
		}
	}

	public void ObjectWrite() {
		try {
			// �����ͻ����׽��֣���д�롾��������ַ���롾�˿ںš�
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("�����ӵ�������");
			OutputStream ops = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(ops);
			Message me = new Message();
			me.setName("SOLLAN");
			me.setPwd("ysc01");
			oos.writeObject(sk);

			oos.close();
			sk.close();

		} catch (IOException p) {
			p.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client cl = new Client();
		// cl.write();
		cl.read();
		// cl.ObjectWrite();

	}
}
