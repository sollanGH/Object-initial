package �����ļ�����;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�ļ��ַ����Ĵ���ȡ
public class FileWrite {

	public static void main(String[] args) {

		/*------��-----��-----��-----��-----��----------------------------*/

		try {
			// �ļ��ַ���(д)����
			FileWriter fw = new FileWriter("D:/JAVA�������/File/FielWriter.txt",true);
			// ���ļ���д������(�����ݿ�ˢ��)
			fw.write("����һ���ļ��е��ַ���");
			// �ر���
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*-------��-----��-----��-----��-----ȡ----------------------------*/
			
		try {
			// �ļ��ַ���(��)����
			FileReader fr = new FileReader("D:/JAVA�������/File/FielWriter.txt");
			//�������������������������ݴ�������
			BufferedReader bfr = new BufferedReader(fr);
			//readLine()������ȡ�������е��ַ���
			String str = bfr.readLine();
			//�رջ�����
			bfr.close();
			System.out.println(str);
		} catch (IOException w) {
			w.printStackTrace();
		}
	}
}












