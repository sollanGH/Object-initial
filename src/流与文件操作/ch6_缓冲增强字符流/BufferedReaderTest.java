package 流与文件操作.ch6_缓冲增强字符流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲增强字符流 缓冲区 8192个字符
 * new BufferedReader(字符流); 
 * 能大幅提高字符的读取效率
 * 能直接读取一个字符串readLine()
 */
public class BufferedReaderTest {
	
	static String path = "D:\\JAVA程序设计\\File\\05.txt";

	public static void main(String[] args) {
		String str;
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			
			//读取一行字符
			while((str=(br.readLine()))!=null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
