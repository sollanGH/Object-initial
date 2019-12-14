package 流与文件操作;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//文件字符串的存与取
public class FileWrite {

	public static void main(String[] args) {

		/*------字-----符-----串-----存-----储----------------------------*/

		try {
			// 文件字符流(写)创建
			FileWriter fw = new FileWriter("D:/JAVA程序设计/File/FielWriter.txt",true);
			// 向文件中写入数据(新数据可刷新)
			fw.write("这是一个文件中的字符串");
			// 关闭流
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*-------字-----符-----串-----读-----取----------------------------*/
			
		try {
			// 文件字符流(读)创建
			FileReader fr = new FileReader("D:/JAVA程序设计/File/FielWriter.txt");
			//创建缓冲区，将读到的数据暂存在这里
			BufferedReader bfr = new BufferedReader(fr);
			//readLine()方法读取缓冲区中的字符串
			String str = bfr.readLine();
			//关闭缓冲流
			bfr.close();
			System.out.println(str);
		} catch (IOException w) {
			w.printStackTrace();
		}
	}
}












