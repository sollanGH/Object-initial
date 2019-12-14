package 流与文件操作.ch3_字符流的基类;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 抽象类
 *含默认缓冲区1024个字符 
 *数据是先存储到[缓冲区]，缓冲区存满再送出。
 *缓冲区刷新三方法:flush();close();缓冲区存满
 *
 */
public class WriterTest {
	public static void main(String[] args) {
		
		char[] cbuf= {'1','2','3','4','5','6','7','8','9','0'};
		try {
			Writer wi=new FileWriter("D:\\JAVA程序设计\\File\\03.txt",true);
			//写入一个字符串
			wi.write("写入一个字符串");
			//写入一个字符数组
			wi.write(cbuf);
			//写入单个字符(字符都能用数字表示)
			wi.write(64);
			//将缓冲区的数据发送出去
			wi.flush();
			//关闭流，并发送缓冲区的数据
			wi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 继承关系：
 * 
 * 		 
 * Writer-->OutputStreamWriter-->FileWriter
 * 		 -->BufferedWriter
 * 		 -->PrintWriter
 * 
 * 
 */








