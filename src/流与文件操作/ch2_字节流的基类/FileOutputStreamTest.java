package �����ļ�����.ch2_�ֽ����Ļ���;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ʵ���ˡ�OutputStream���ӿ�
 * FileOutputStream(file) ����ģʽ������ԭ����
 * FileOutputStream(file��true) ׷��ģʽ������������
 */
public class FileOutputStreamTest {

	public static void main(String[] args) {

		InputStream is=null;
		
		File file = new File("D:\\JAVA�������\\File\\04.txt");
		try {
			byte[] b = "��".getBytes("GBK");
			//���������
			FileOutputStream fos = new FileOutputStream(file,true);
			//���ֽ���ǿ������
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file,true));
			//�ô�ӡ������
			PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
			//�ñ��������գ�ʹ���ֽ�����תΪ���ַ�����
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(file,true));
			//�����������ܽ����˰�
			
			fos.write(b);
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
