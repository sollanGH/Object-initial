package 流与文件操作.ch4_文件字符流;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * FileReader内存在8192字节的缓冲区
 * 在读第一次时将足量的字符存入缓冲区，之后再从缓冲区取字符
 * 当缓冲区被读空时，再去节点取字符。(节点就是数据源，例如一个.txt文件)
 *
 */
public class FileReaderTest {

	static String path = "D:\\JAVA程序设计\\File\\05.txt";
	
	public static void main(String[] args) {
		FileReader reader=null;
		int ch=0;
		Scanner scan=new Scanner(System.in);
		try {
			reader=new FileReader(path);
			//将足量的字符存入缓冲区,并读一个字符
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
			System.out.printf("按任意键读入下一个字符\n");
			scan.nextLine();
			
			//从缓冲区读入一个字符【若此时更改了文件，输出也不会改变】
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
			System.out.println("按任意键读入下一个字符\n");
			scan.nextLine();
			//从缓冲区取一个字符
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
		} catch (IOException e) {
			e.printStackTrace();
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
