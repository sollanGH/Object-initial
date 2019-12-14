package �����ļ�����.ch2_�ֽ����Ļ���;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream �ֽ�������(������)
 * 1���ֽ�=8λ
 * 1���ַ�=2���ֽ�(javaĬ��)
 * 
 * Unicode����ͨ����:
 * (0-127λ)ASCII�롢(128-255)ASCII��չ�롢����Ϊ�����ַ����롣��Ϊ2�ֽڱ�ʾ
 * 
 * utf-8���紫����:
 * Ӣ���ַ�=1�ֽڡ������ַ�=3�ֽ�
 * 
 * GBK���������룺
 * ����=3�ֽ�	 Ӣ��=1�ֽ�
 *
 * int read(byte[])���������������ݿ��á���⵽�ļ�ĩβ�����׳��쳣ǰ���˷���һֱ������
 * ������Ч����ͬ�ڣ� read(b, 0, b.length)
 */
public class InputStreamTest {

	public static void main(String[] args) {
		int ch=0;
		int cnt=0;
		byte[] b=new byte[10];
		InputStream is = null;
		try {
			// ��ȡһ���ļ�������תΪ�ֽ���
			is = new FileInputStream("D:\\JAVA�������\\File\\01.txt");
			
			// ���������ж�ȡ���ݵ���[һ���ֽ�],��������ȡ,�շ���-1��ÿreadһ�Σ���ָ������ƶ�һ���ֽ�
			ch = is.read();
			System.out.println("��һ���ֽ�unicode���룺"+ch);
			ch = is.read();
			System.out.println("�ڶ����ֽ�unicode���룺"+ch);
			
			//���������ж�ȡһ���������ֽڣ�������[�洢]�ڻ��������� b ��
			cnt=is.read(b);
			System.out.println("�洢�˶��ٸ��ֽڵ�byte[]:"+cnt+"��");
			
			//��ȡ1���ֽڴ洢��b�У���b�ĵ�1��������ʼ�洢�����ش洢�����ֽ�����
			cnt=is.read(b, 1, 5);
			System.out.println(cnt);
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
/**
 * �̳й�ϵ��
 * InputStream-->FilterOutputStream-->BufferedInputStream
 * 			  -->FileInputStream
 * 
 * 
 * 
 */




















