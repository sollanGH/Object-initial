package 流与文件操作.ch2_字节流的基类;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 实现了【OutputStream】接口
 * FileOutputStream(file) 覆盖模式，覆盖原内容
 * FileOutputStream(file，true) 追加模式，不覆盖内容
 */
public class FileOutputStreamTest {

	public static void main(String[] args) {

		InputStream is=null;
		
		File file = new File("D:\\JAVA程序设计\\File\\04.txt");
		try {
			byte[] b = "你".getBytes("GBK");
			//用自身接收
			FileOutputStream fos = new FileOutputStream(file,true);
			//用字节增强流接收
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file,true));
			//用打印流接收
			PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
			//用编码流接收，使【字节流】转为【字符流】
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(file,true));
			//仅限这四种能接收了吧
			
			fos.write(b);
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
