package �����ļ�����.ch7_������ǿ�ֽ���;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �����������ʱʹ��(��ѹ����)
 * ��������С8192�ֽ�
 * new BufferedInputStream(�ֽ���);
 * 
 *
 */
public class BufferedInputStreamTest {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D://java"));
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
