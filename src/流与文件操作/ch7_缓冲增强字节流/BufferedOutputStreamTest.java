package �����ļ�����.ch7_������ǿ�ֽ���;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * ����һ���ֽ���
 * BufferedOutputStream(OutputStream out) 
 * ��������8192�ֽ�
 */
public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\java"));
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
