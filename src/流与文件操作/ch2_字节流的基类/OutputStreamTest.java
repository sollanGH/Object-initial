package �����ļ�����.ch2_�ֽ����Ļ���;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * OutputStream �ֽ�������(������)
 * 
 * ���÷�����write();push();close();
 */
public class OutputStreamTest {
	public static void main(String[] args) {
		OutputStream os = null;
		byte[] b = { 'A', 'B', 'C', '!' ,'D'};

		try {
			// �½�һ���ļ������������������ݡ�
			os = new FileOutputStream("D:\\JAVA�������\\File\\05.txt");
			// �� b.length ���ֽڴ�ָ���� byte ����д��������
			os.write(b);
			os.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
/**
 * �̳й�ϵ��
 * OutputStream-->FilterOutputStream-->BufferOutputStream
 * 			   -->FileInputStream
 * 
 */



















