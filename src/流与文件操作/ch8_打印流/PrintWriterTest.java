package 流与文件操作.ch8_打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;



/**
 *
 * 输出流，支持输出各种数据print(boolean、char、char[]、double、float、int、 long 、Object、String)
 * 存在缓冲区
 * 
 * 通过File创建：
 * PrintWriter(File file) ;
 * PrintWriter(File file, String csn) ;
 * 
 * 通过路径创建：
 * PrintWriter(String fileName) ;
 * PrintWriter(String fileName, String csn) ;
 * 
 * 通过字节流创建：
 * PrintWriter(OutputStream out);
 * PrintWriter(OutputStream out, boolean autoFlush) ; 
 * 
 * 通过字符流创建：
 * PrintWriter(Writer out) ;
 * PrintWriter(Writer out, boolean autoFlush) ;
 */
public class PrintWriterTest {

	public static void main(String[] args) {
		try {
			PrintWriter write=new PrintWriter(new FileOutputStream("D:\\JAVA程序设计\\File\\05.txt",true));
			//输出数据
			write.write("输出一个在字符串！");
			//输出数据
			write.print(true);
			//将缓冲区的数据输出到节点
			write.flush();
			//关闭流
			write.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
/**
 * 继承关系：
 * Writer-->PrintWriter
 */











