package 流与文件操作.ch4_文件字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 存在缓冲区8192个字节
 * 先把write的字符存入【缓冲区】，再将缓冲区的字符存入物理节点(文件)
 * !!!缓冲区刷新三方法:flush();close();缓冲区存满
 *
 */
public class FileWriterTest {
	
	static String path = "D:\\JAVA程序设计\\File\\05.txt";

	public static void main(String[] args) {
		Writer writer=null;
		try {
			writer=new FileWriter(path,true);
			writer.write("你好吗2019");
			
			//刷新缓冲区，将缓冲区字符存入节点
			writer.flush();
			
			System.out.println("关闭流，并刷新缓冲区");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/**
 * 继承关系：
 * 
 * 		 -->BufferedWriter
 * Writer-->OutputStreamWriter-->FileWriter
 * 		 -->PrintWriter
 * 
 * 
 */