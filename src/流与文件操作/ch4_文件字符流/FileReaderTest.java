package �����ļ�����.ch4_�ļ��ַ���;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * FileReader�ڴ���8192�ֽڵĻ�����
 * �ڶ���һ��ʱ���������ַ����뻺������֮���ٴӻ�����ȡ�ַ�
 * ��������������ʱ����ȥ�ڵ�ȡ�ַ���(�ڵ��������Դ������һ��.txt�ļ�)
 *
 */
public class FileReaderTest {

	static String path = "D:\\JAVA�������\\File\\05.txt";
	
	public static void main(String[] args) {
		FileReader reader=null;
		int ch=0;
		Scanner scan=new Scanner(System.in);
		try {
			reader=new FileReader(path);
			//���������ַ����뻺����,����һ���ַ�
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
			System.out.printf("�������������һ���ַ�\n");
			scan.nextLine();
			
			//�ӻ���������һ���ַ�������ʱ�������ļ������Ҳ����ı䡿
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
			System.out.println("�������������һ���ַ�\n");
			scan.nextLine();
			//�ӻ�����ȡһ���ַ�
			ch=reader.read();
			System.out.printf("%c\n",ch);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/**
 * �̳й�ϵ��
 * Reader-->InputStreamReader-->FileReader
 * 		 -->BufferedReader
 * 
 * 
 * 
 * 
 */
