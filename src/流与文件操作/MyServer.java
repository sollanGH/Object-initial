package �����ļ�����;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket serversocket = new ServerSocket(6666);
			System.out.println("Server has running");
			Socket socket = serversocket.accept();
			System.out.println("accept�����ڿͻ��˽���֮ǰһֱ������");
			System.out.println(socket.getInetAddress().getHostAddress() + "���ӵ�������");
			// ������
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// �����
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//�����,���Զ���ˢ��
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
			String line = null;
			int i=1;
			//readLine()��ȡһ���ı�����û�ж������з������������������״̬��ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż��С�
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.equals("overPrintWriter��������")) {
					break;
				}
//				System.out.println(br.readLine());
				pw.println(line.toUpperCase());//ͨ��д���зָ����ַ�����ֹ��ǰ�С�
//				bw.write(line.toUpperCase());
//				bw.newLine();
//				bw.flush();
				System.out.println("��"+i+"��ѭ��");
				i++;
			}
			System.out.println("�����ѹر�");
			pw.close();
			br.close();
			bw.close();
			serversocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
