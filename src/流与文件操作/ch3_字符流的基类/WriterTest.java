package �����ļ�����.ch3_�ַ����Ļ���;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * ������
 *��Ĭ�ϻ�����1024���ַ� 
 *�������ȴ洢��[������]���������������ͳ���
 *������ˢ��������:flush();close();����������
 *
 */
public class WriterTest {
	public static void main(String[] args) {
		
		char[] cbuf= {'1','2','3','4','5','6','7','8','9','0'};
		try {
			Writer wi=new FileWriter("D:\\JAVA�������\\File\\03.txt",true);
			//д��һ���ַ���
			wi.write("д��һ���ַ���");
			//д��һ���ַ�����
			wi.write(cbuf);
			//д�뵥���ַ�(�ַ����������ֱ�ʾ)
			wi.write(64);
			//�������������ݷ��ͳ�ȥ
			wi.flush();
			//�ر����������ͻ�����������
			wi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/**
 * �̳й�ϵ��
 * 
 * 		 
 * Writer-->OutputStreamWriter-->FileWriter
 * 		 -->BufferedWriter
 * 		 -->PrintWriter
 * 
 * 
 */








