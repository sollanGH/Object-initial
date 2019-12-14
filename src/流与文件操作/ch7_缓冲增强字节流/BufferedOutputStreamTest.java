package 流与文件操作.ch7_缓冲增强字节流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 接收一个字节流
 * BufferedOutputStream(OutputStream out) 
 * 缓冲区：8192字节
 */
public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\java"));
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
