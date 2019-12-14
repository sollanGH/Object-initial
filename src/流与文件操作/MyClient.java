package 流与文件操作;
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
			System.out.println("连接到服务端");
			// 读取键盘输入
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// 输出流1
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 输出流2
			PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//这个true可使原内容进行追加
			// 读取服务端数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String line = br.readLine();
				System.out.println("键盘输入的数据："+line);
				//第一次写入
				pw.println(line+"PrintWriter流的数据");
				//第二次写入
				bw.write(line+"BufferedWriter的数据");//写入字符数组
				bw.newLine();//写入一个行分隔符
				//第三次写入
				bw.write("第三行数据");
				bw.newLine();//写入一个行分隔符
				
				bw.flush();//刷新该流的缓冲,强制将缓冲流中数据发送。
				if (line.equals("over")) {
					break;
				}
				//【读取】一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。 	
				System.out.println(reader.readLine());
				System.out.println(reader.readLine());
				System.out.println(reader.readLine());//总共读取三行
			}
			System.out.println("接下来关闭流操作");
			reader.close();
			br.close();
			bw.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("IO异常！！！！！！！！！");
		}
	}


}
