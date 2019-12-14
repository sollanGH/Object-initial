package ������.TCPЭ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * �������ܣ� �ͻ��˷�����Ϣ���������������������������ݸ��ͻ��� 
 * 1.������һ�������رգ�socket�����ر�
 * 2.��client������service������һ��socket���رգ����޷���ͨ��
 * 
 * @author 16190
 *
 */
public class PracticeServer {

	public static void main(String[] args) throws IOException {
		// ����������׽��֣�ָ���˿ں�
		ServerSocket server = new ServerSocket(9658);
		System.out.println("������������");
		// ��������ֱ���пͻ�������
		Socket socket = server.accept();
		System.out.println("�пͻ�������");

		while (true) {
			// ���ڴ洢��ȡ��������
			char[] buff = new char[1024];
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(in);
			int count = br.read(buff, 0, buff.length);
			System.out.println("[�ͻ��˷�����Ϣ��]" + new String(buff));

			// ���������ݺ������������ݻ�ͻ���
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw = new BufferedWriter(out);
			out.write(buff);
			out.flush();

//			br.close();
//			out.close();

		}

	}

}
