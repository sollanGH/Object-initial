package �����ļ�����.ch6_������ǿ�ַ���;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ������ǿ�ַ��� ������ 8192���ַ�
 * new BufferedReader(�ַ���); 
 * �ܴ������ַ��Ķ�ȡЧ��
 * ��ֱ�Ӷ�ȡһ���ַ���readLine()
 */
public class BufferedReaderTest {
	
	static String path = "D:\\JAVA�������\\File\\05.txt";

	public static void main(String[] args) {
		String str;
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			
			//��ȡһ���ַ�
			while((str=(br.readLine()))!=null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
