package �����ļ�����.ch3_�ַ����Ļ���;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ������ 
 * read()����ÿ�ζ�ȡһ���ַ� 
 *
 */

public class ReaderTest {

	static String path = "D:\\JAVA�������\\File\\05.txt";

	public static void main(String[] args) {

		int ch;
		char[] cb = new char[100];
		// ������finally�йر���
		try (Reader reader = new FileReader(path);) {
			// ��ȡһ���ַ�����int����
			ch = reader.read();
			System.out.println(ch);
			// ���ַ��������飬������0λ��ʼ������100���ַ������ش�����ַ���
			ch = reader.read(cb, 0, 100);

		} catch (IOException e1) {
			e1.printStackTrace();
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










