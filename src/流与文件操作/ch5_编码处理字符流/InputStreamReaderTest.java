package 流与文件操作.ch5_编码处理字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 必须由字节流创建
 * new InputStreamReader(InputStream in);
 * 【字节流】转【字符流】
 * 可指定解码格式，默认为系统编码格式
 */
public class InputStreamReaderTest {

	static String path = "D:\\JAVA程序设计\\File\\05.txt";

	public static void main(String[] args) {
		InputStreamReader reader = null;
		char[] buff = new char[1024];
		try {
			// 将【字节流】转换为【字符流】
			reader = new InputStreamReader(new FileInputStream(path), "GBK");
			
			//将读取到的字符存到buff,并返回读取到的字符数量。
			int cnt = reader.read(buff);
			System.out.println("读取到了"+cnt+"个字符");
			
			//将buff转换为String
			String str = new String(buff, 0, cnt);
			System.out.println("读取到的字符："+str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/**
 * 继承关系：Reader-->InputStreamReader-->FileReader 
 * 		     	-->BufferedReader
 * 
 */