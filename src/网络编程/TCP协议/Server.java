package 网络编程.TCP协议;

import java.io.*;
import java.net.*;
import message.Message;

public class Server {

	/*---------读----取----客----户----端----数----据---------------------------------------*/

	private void read() {
		try {
			// 创建服务器套接字
			ServerSocket server = new ServerSocket(2333);
			System.out.println("服务器已开启！");

			// 创建连接客户端的套接字，并且使用accept()方法
			Socket so = server.accept();
			System.out.println("有客户端连接过来");

			// 将套接字中的【字节】数据转换为【字符】数据
			InputStreamReader isr = new InputStreamReader(so.getInputStream());
			// 读取数据时都用字符缓冲流来缓存
			BufferedReader br = new BufferedReader(isr);
			// !!!![输入流的对象千万不要写在while里面，不然br对象将被重新创建，导致读取没有连贯性]
			while (true) {

				// 字符缓冲流的readLine()方法读取字符串很方便; 输入流对象br未close前,readLine()会记住读到了哪行数据。
				String str = br.readLine();
				// 关闭流
				System.out.println("来自客户端的消息：" + str);
				if (str.equals("Hello Server!10")) {
					br.close();
					break;
				}

			}
		} catch (IOException w) {
			w.printStackTrace();
		}
	}

	/*--------向----客----户----端----写----入----数----据------------------------------------------------*/

	private void write() {
		try {
			// 创建服务器套接字
			ServerSocket ser = new ServerSocket(2333);
			System.out.println("服务器已开启！");
			// 创建连接客户端的套接字，并且使用accept()方法
			Socket so = ser.accept();
			System.out.println("有客户端连接过来");
			// PrintWriter专门用于写字符串数据到socket
			PrintWriter pw = new PrintWriter(so.getOutputStream());

			for (int i = 1; i <= 10; i++) {
				// 用于写入字符串的方法
				pw.println("Hello Client! "+i);

			}
			// 关闭流
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void ObjectRead() {
		try {
			// 创建服务器套接字
			ServerSocket server = new ServerSocket(2333);
			System.out.println("服务器已开启！");

			while (true) {

				Socket so = server.accept();
				// 创建连接客户端的套接字，并且使用accept()方法
				System.out.println("有客户端连接过来");
				InputStream is = so.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				Object one = ois.readObject();
				Message se = (Message) one;
				Message ss = new Message();

				System.out.println("来自客户端的消息：" + ss.name);
				System.out.println("来自客户端的消息：" + ss.pwd);

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
