package �����ļ�����.ch4_�ļ��ַ���;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * ���ڻ�����8192���ֽ�
 * �Ȱ�write���ַ����롾�����������ٽ����������ַ���������ڵ�(�ļ�)
 * !!!������ˢ��������:flush();close();����������
 *
 */
public class FileWriterTest {
	
	static String path = "D:\\JAVA�������\\File\\05.txt";

	public static void main(String[] args) {
		Writer writer=null;
		try {
			writer=new FileWriter(path,true);
			writer.write("�����2019");
			
			//ˢ�»����������������ַ�����ڵ�
			writer.flush();
			
			System.out.println("�ر�������ˢ�»�����");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/**
 * �̳й�ϵ��
 * 
 * 		 -->BufferedWriter
 * Writer-->OutputStreamWriter-->FileWriter
 * 		 -->PrintWriter
 * 
 * 
 */