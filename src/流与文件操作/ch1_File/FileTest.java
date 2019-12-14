package �����ļ�����.ch1_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File��Ļ���API����
 * 
 * @author 16190
 *
 */
public class FileTest {

	public static void main(String[] args) {
//		APItest();
		 directory();
		// lookupDir("D:\\JAVA�������\\File");
	}

	public static void APItest() {
		// �����ļ�����(��û�д����ļ�)
		File file = new File("D:\\JAVA�������\\File\\FielWriter.txt");
		try {
			// �����ļ�
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����ļ��Ƿ����
		boolean isExist = file.exists();
		System.out.println("�ļ��Ƿ���ڣ�" + isExist);
		// �ж��Ƿ����ļ�
		boolean isFile = file.isFile();
		System.out.println("�Ƿ���һ���ļ���" + isFile);
		// �ж��Ƿ���Ŀ¼
		boolean isDirectory = file.isDirectory();
		System.out.println("�Ƿ���һ��Ŀ¼��" + isDirectory);

		// �ļ�������޸�����
		long date = file.lastModified();
		Date day = new Date(date);
		SimpleDateFormat simp = new SimpleDateFormat("yyy��MM��dd�� HH:mm:ss E");
		String lastDay = simp.format(day);
		System.out.println("�ļ�������޸�ʱ�䣺" + lastDay);

		// �ļ�����
		long length = file.length();
		System.out.println("�ļ��ĳ��ȣ�" + length + "�ֽ�");

		// ��ȡ�ļ���
		String fileName = file.getName();
		System.out.println("�ļ���Ϊ��" + fileName);

		// ��ȡ�����ļ���
		String parentName = file.getParent();
		System.out.println("�ļ��ĸ���·����" + parentName);

		// ��ȡ�ļ��ľ���·��
		String path = file.getAbsolutePath();
		System.out.println("�ļ��ľ���·���ǣ�" + path);

	}

	// Ŀ¼��ص�API
	public static void directory() {
		// ����һ���µ�Ŀ¼,����һ�δ����༶Ŀ¼
		File file2 = new File("D:\\JAVA�������\\File\\myfile2");
		boolean isCreate = file2.mkdirs();
		System.out.println("Ŀ¼�Ƿ񴴽��ɹ���" + isCreate + "\n");

		// ��ʾĿ¼�嵥
		File file3 = new File("D:\\JAVA�������\\File");
		File[] list = file3.listFiles();
		for (File f : list) {
			System.out.println(f.getName());
		}

	}

	// �ݹ����Ŀ¼�嵥
	public static void lookupDir(String path) {
		String p = "D:\\JAVA�������\\File";
		File file4 = new File(path);
		if (file4.exists()) {// �ж��ļ�(Ŀ¼)�Ƿ���ڣ������������˳�
			System.out.println("�ļ������ڣ�");
			return;
		}
		File[] li = file4.listFiles();// ��ȡ��ǰ�ļ��嵥
		if (li == null) {// �жϴ�Ŀ¼�Ƿ�Ϊ�գ�Ϊ����ֻ�����ǰ�ļ���
			System.out.println("�ļ���Ϊ��" + file4.getAbsolutePath());
			return;
		}
		for (File file : li) { // ��Ϊ�����������Ŀ¼
			String absPath = file.getAbsolutePath();
			if (file.isFile()) {
				System.out.println("�ļ�����" + file.getAbsolutePath());
			} else {
				System.out.println("Ŀ¼����" + file.listFiles());
				lookupDir(absPath);
			}
		}
	}

}
