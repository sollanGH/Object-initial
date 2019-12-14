package 流与文件操作.ch3_字符流的基类;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 抽象类 
 * read()方法每次读取一个字符 
 *
 */

public class ReaderTest {

	static String path = "D:\\JAVA程序设计\\File\\05.txt";

	public static void main(String[] args) {

		int ch;
		char[] cb = new char[100];
		// 不用在finally中关闭流
		try (Reader reader = new FileReader(path);) {
			// 读取一个字符，用int接收
			ch = reader.read();
			System.out.println(ch);
			// 将字符读入数组，从数组0位开始，最多存100个字符，返回存入的字符数
			ch = reader.read(cb, 0, 100);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
/**
 * 继承关系：
 * Reader-->InputStreamReader-->FileReader
 * 		 -->BufferedReader
 * 
 * 
 * 
 * 
 */










