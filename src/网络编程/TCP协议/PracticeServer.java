package 网络编程.TCP协议;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 基本功能： 客户端发送消息给服务器，服务器立即返回数据给客户端 
 * 1.若任意一个流被关闭，socket将被关闭
 * 2.【client】、【service】任意一个socket被关闭，将无法再通信
 * 
 * @author 16190
 *
 */
public class PracticeServer {

	public static void main(String[] args) throws IOException {
		// 创建服务端套接字，指定端口号
		ServerSocket server = new ServerSocket(9658);
		System.out.println("服务器已启动");
		// 【阻塞】直到有客户端连接
		Socket socket = server.accept();
		System.out.println("有客户端连接");

		while (true) {
			// 用于存储读取到的数据
			char[] buff = new char[1024];
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(in);
			int count = br.read(buff, 0, buff.length);
			System.out.println("[客户端发来消息：]" + new String(buff));

			// 接收完数据后立即发送数据会客户端
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw = new BufferedWriter(out);
			out.write(buff);
			out.flush();

//			br.close();
//			out.close();

		}

	}

}
