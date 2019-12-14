package 流与文件操作.ch2_字节流的基类;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * OutputStream 字节流基类(抽象类)
 * 
 * 常用方法：write();push();close();
 */
public class OutputStreamTest {
	public static void main(String[] args) {
		OutputStream os = null;
		byte[] b = { 'A', 'B', 'C', '!' ,'D'};

		try {
			// 新建一个文件【若存在则会清空内容】
			os = new FileOutputStream("D:\\JAVA程序设计\\File\\05.txt");
			// 将 b.length 个字节从指定的 byte 数组写入此输出流
			os.write(b);
			os.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
/**
 * 继承关系：
 * OutputStream-->FilterOutputStream-->BufferOutputStream
 * 			   -->FileInputStream
 * 
 */



















