package �����ļ�����.ch8_��ӡ��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;



/**
 *
 * �������֧�������������print(boolean��char��char[]��double��float��int�� long ��Object��String)
 * ���ڻ�����
 * 
 * ͨ��File������
 * PrintWriter(File file) ;
 * PrintWriter(File file, String csn) ;
 * 
 * ͨ��·��������
 * PrintWriter(String fileName) ;
 * PrintWriter(String fileName, String csn) ;
 * 
 * ͨ���ֽ���������
 * PrintWriter(OutputStream out);
 * PrintWriter(OutputStream out, boolean autoFlush) ; 
 * 
 * ͨ���ַ���������
 * PrintWriter(Writer out) ;
 * PrintWriter(Writer out, boolean autoFlush) ;
 */
public class PrintWriterTest {

	public static void main(String[] args) {
		try {
			PrintWriter write=new PrintWriter(new FileOutputStream("D:\\JAVA�������\\File\\05.txt",true));
			//�������
			write.write("���һ�����ַ�����");
			//�������
			write.print(true);
			//��������������������ڵ�
			write.flush();
			//�ر���
			write.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
/**
 * �̳й�ϵ��
 * Writer-->PrintWriter
 */











