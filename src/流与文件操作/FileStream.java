package �����ļ�����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream { // �ļ������롿����������ֽ���

	public static void main(String[] args) {
		// �����ļ�����,ͨ��file������ļ����ܱ����´洢ˢ��
		File file = new File("D:\\JAVA�������\\File\\01.txt");
		if (file.exists()) {
			
			/*--------д-----��-----��-----��-----��-----��----��------------------------*/
			
			try {
				// �ֽ������,���ļ���д������(�����ڲ�д�ļ���������ˢ������)
				FileOutputStream out = new FileOutputStream(file,true);
				// ���ַ������л�����ɱ�����Ӧ�����֣�תΪ�ֽ�
				byte b[] = "����ɯ�����һ�ɰ���                 �ۣ�  ".getBytes();
				// ��b�е��ַ�д���ļ��С�д����ֽ����顿����������ڼ�λ��ʼ������д������ֽڡ�
				out.write(b);
				// �ر���
				out.close();
			} catch (Exception w) {
				w.printStackTrace();
			}
//			 file.delete();
		} else {
			try {
				//���������򴴽����ļ�
				file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}

		}

		/*-------��-----ȡ-----��-----��-----��-----��--------------------------------*/

		try {
			// ��������������(�����ڿ���ֱ��д���ļ���)
			FileInputStream in = new FileInputStream(file);
			// ����һ���������ڴ���������ַ����ֽڱ���
			byte[] i = new byte[3000];
			// ����ȡ�����ֽڴ���������������󡿡���������ĵڼ�λ��ʼ�桿��������೤���ݡ������Ѷ����ļ�ĩβ���򷵻�-1
			in.read(i);
			// �������������ڵ��ֽ�ת��Ϊ�ַ���
			System.out.println(new String(i));
			// �ر���
			in.close();
			String str=new String(i);
			System.out.println("��ȡ�������ݣ�\n"+str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
