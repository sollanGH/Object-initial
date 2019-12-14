package 流与文件操作;
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
			System.out.println("accept方法在客户端接入之前一直阻塞！");
			System.out.println(socket.getInetAddress().getHostAddress() + "连接到服务器");
			// 输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 输出流
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//输出流,带自动行刷新
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
			String line = null;
			int i=1;
			//readLine()读取一行文本，若没有读到换行符，则进入类似阻塞的状态。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.equals("overPrintWriter流的数据")) {
					break;
				}
//				System.out.println(br.readLine());
				pw.println(line.toUpperCase());//通过写入行分隔符字符串终止当前行。
//				bw.write(line.toUpperCase());
//				bw.newLine();
//				bw.flush();
				System.out.println("第"+i+"次循环");
				i++;
			}
			System.out.println("服务已关闭");
			pw.close();
			br.close();
			bw.close();
			serversocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
