package �����ļ�����;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 6666);
			System.out.println("���ӵ������");
			// ��ȡ��������
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// �����1
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// �����2
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//���true��ʹԭ���ݽ���׷��
			// ��ȡ���������
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String line = br.readLine();
				System.out.println("������������ݣ�"+line);
				//��һ��д��
				pw.println(line+"PrintWriter��������");
				//�ڶ���д��
				bw.write(line+"BufferedWriter������");//д���ַ�����
				bw.newLine();//д��һ���зָ���
				//������д��
				bw.write("����������");
				bw.newLine();//д��һ���зָ���
				
				bw.flush();//ˢ�¸����Ļ���,ǿ�ƽ������������ݷ��͡�
				if (line.equals("over")) {
					break;
				}
				//����ȡ��һ���ı��С�ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż��С� 	
				System.out.println(reader.readLine());
				System.out.println(reader.readLine());
				System.out.println(reader.readLine());//�ܹ���ȡ����
			}
			System.out.println("�������ر�������");
			reader.close();
			br.close();
			bw.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("IO�쳣������������������");
		}
	}


}
