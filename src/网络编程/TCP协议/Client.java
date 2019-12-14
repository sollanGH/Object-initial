package 网络编程.TCP协议;

import java.io.*;
import java.net.Socket;
import message.Message;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3077743347276626091L;

	// 要传输到服务器端的变量
	int i = 100;
	double d = 12.25;
	String name = "Client's String";

	/*----------读----取----服----务----端----信----息--------------------------------*/

	public void read() {
		try {
			// 创建客户端套接字，并写入【服务器地址】与【端口号】
			Socket so = new Socket("127.0.0.1", 2333);
			System.out.println("已连接到服务器");
			// 将写入的【字符】数据转换为【字节】数据
			InputStreamReader isr = new InputStreamReader(so.getInputStream());
			// 读取数据时都用字符缓冲流来缓存
			BufferedReader reader = new BufferedReader(isr);
			String str;
			
			while ((str=reader.readLine())!=null) {
				// 字符缓冲流的readLine()方法读取字符串很方便
				str = reader.readLine();
				System.out.println("服务器端发来的信息：" + str);
				if (str.equals("Hello Client! 10")) {
					// 关闭流
					reader.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*--------PrintWriter----写----出----数----据-----------------------------------------*/

	public void write() {
		try {
			// 创建客户端套接字，并写入【服务器地址】与【端口号】
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("已连接到服务器");
			// PrintWriter专门用于写字符串数据到socket,也拥有将【字节】转换为【字符】的能力
			PrintWriter pw = new PrintWriter(sk.getOutputStream());
			// 用于写入字符串的方法
			int i = 1;
			while (true) {
				pw.println("Hello Server!" + i);
				pw.flush();
				i++;
				if (i > 15) {
					// 关闭流
					pw.close();
					break;
				}
			}

		} catch (IOException p) {
			p.printStackTrace();
		}
	}

	/*-------BufferedWriter----写----出----数----据-------------------------------------*/

	public void OtherWrit() {
		try {
			// 创建客户端套接字，并写入【服务器地址】与【端口号】
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("已连接到服务器");
			// 将输出的【字符】数据转换为【字节】数据
			OutputStreamWriter osw = new OutputStreamWriter(sk.getOutputStream());
			// 将写入的字符串存入缓存区，然后送出
			BufferedWriter bw = new BufferedWriter(osw);
			// 用于写入字符串的方法
			bw.write("Hello Client!");
			// 关闭流
			bw.close();

		} catch (IOException p) {
			p.printStackTrace();
		}
	}

	public void ObjectWrite() {
		try {
			// 创建客户端套接字，并写入【服务器地址】与【端口号】
			Socket sk = new Socket("127.0.0.1", 2333);
			System.out.println("已连接到服务器");
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
