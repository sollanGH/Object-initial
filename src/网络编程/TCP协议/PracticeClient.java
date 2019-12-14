package 网络编程.TCP协议;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class PracticeClient {
	/**
	 * 1.套接字的输入、输出流任意一个被关闭时，套接字也会被关闭 
	 * 2.套接字被关闭时，相关流也会被关闭
	 * 3.客户端与服务端的套接字只要一边被关闭，就无法再通信。
	 * 4.readLine()方法只有读到回车才能得到值。读取时小心
	 * 5.带缓冲区的流在发送数据时只能通过close()或flush()方式发送未满缓冲量的数据。
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 9658);
		while (true) {
			// 输出
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw = new BufferedWriter(out);
			
			bw.write(str);
			bw.flush();

			try {
				//阻塞，以保证read()时服务器端已返回数据
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
