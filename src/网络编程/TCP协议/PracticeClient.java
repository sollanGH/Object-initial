package ������.TCPЭ��;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class PracticeClient {
	/**
	 * 1.�׽��ֵ����롢���������һ�����ر�ʱ���׽���Ҳ�ᱻ�ر� 
	 * 2.�׽��ֱ��ر�ʱ�������Ҳ�ᱻ�ر�
	 * 3.�ͻ��������˵��׽���ֻҪһ�߱��رգ����޷���ͨ�š�
	 * 4.readLine()����ֻ�ж����س����ܵõ�ֵ����ȡʱС��
	 * 5.�������������ڷ�������ʱֻ��ͨ��close()��flush()��ʽ����δ�������������ݡ�
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 9658);
		while (true) {
			// ���
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw = new BufferedWriter(out);
			
			bw.write(str);
			bw.flush();

			try {
				//�������Ա�֤read()ʱ���������ѷ�������
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			char buff[] = new char[1024];
			int count = in.read(buff, 0, buff.length);
			System.out.println(new String(buff));

//			bw.close();
//			in.close();
		}
	}
}
