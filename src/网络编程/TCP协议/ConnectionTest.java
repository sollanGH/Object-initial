package 网络编程.TCP协议;
import java.io.*;
import java.net.Socket;

import com.mysql.jdbc.Util;


public class ConnectionTest {

	public static void main(String[] args) throws IOException {
		Socket socket=new Socket("10.11.41.10",8888);
		OutputStream out=socket.getOutputStream();
		out.write("已接收到信息！".getBytes("UTF-8"));
		out.close();

	}

}
