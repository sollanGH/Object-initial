package 流与文件操作.ch7_缓冲增强字节流;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 传输大量数据时使用(如压缩包)
 * 缓冲区大小8192字节
 * new BufferedInputStream(字节流);
 * 
 *
 */
public class BufferedInputStreamTest {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D://java"));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
