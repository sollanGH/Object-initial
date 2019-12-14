package �����ļ�����.ch5_���봦���ַ���;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �������ֽ�������
 * new InputStreamReader(InputStream in);
 * ���ֽ�����ת���ַ�����
 * ��ָ�������ʽ��Ĭ��Ϊϵͳ�����ʽ
 */
public class InputStreamReaderTest {

	static String path = "D:\\JAVA�������\\File\\05.txt";

	public static void main(String[] args) {
		InputStreamReader reader = null;
		char[] buff = new char[1024];
		try {
			// �����ֽ�����ת��Ϊ���ַ�����
			reader = new InputStreamReader(new FileInputStream(path), "GBK");
			
			//����ȡ�����ַ��浽buff,�����ض�ȡ�����ַ�������
			int cnt = reader.read(buff);
			System.out.println("��ȡ����"+cnt+"���ַ�");
			
			//��buffת��ΪString
			String str = new String(buff, 0, cnt);
			System.out.println("��ȡ�����ַ���"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/**
 * �̳й�ϵ��Reader-->InputStreamReader-->FileReader 
 * 		     	-->BufferedReader
 * 
 */