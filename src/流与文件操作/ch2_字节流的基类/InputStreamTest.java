package 流与文件操作.ch2_字节流的基类;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream 字节流基类(抽象类)
 * 1个字节=8位
 * 1个字符=2个字节(java默认)
 * 
 * Unicode国际通用码:
 * (0-127位)ASCII码、(128-255)ASCII扩展码、其余为各国字符编码。均为2字节表示
 * 
 * utf-8网络传播码:
 * 英文字符=1字节、中文字符=3字节
 * 
 * GBK简体中文码：
 * 中文=3字节	 英文=1字节
 *
 * int read(byte[])方法：在输入数据可用、检测到文件末尾或者抛出异常前，此方法一直阻塞。
 * 方法的效果等同于： read(b, 0, b.length)
 */
public class InputStreamTest {

	public static void main(String[] args) {
		int ch=0;
		int cnt=0;
		byte[] b=new byte[10];
		InputStream is = null;
		try {
			// 获取一个文件，将其转为字节流
			is = new FileInputStream("D:\\JAVA程序设计\\File\\01.txt");
			
			// 从输入流中读取数据的下[一个字节],可连续读取,空返回-1。每read一次，流指针向后移动一个字节
			ch = is.read();
			System.out.println("第一个字节unicode编码："+ch);
			ch = is.read();
			System.out.println("第二个字节unicode编码："+ch);
			
			//从输入流中读取一定数量的字节，并将其[存储]在缓冲区数组 b 中
			cnt=is.read(b);
			System.out.println("存储了多少个字节到byte[]:"+cnt+"个");
			
			//读取1个字节存储到b中，从b的第1个索引开始存储，返回存储到的字节数。
			cnt=is.read(b, 1, 5);
			System.out.println(cnt);
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
/**
 * 继承关系：
 * InputStream-->FilterOutputStream-->BufferedInputStream
 * 			  -->FileInputStream
 * 
 * 
 * 
 */




















