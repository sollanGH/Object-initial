package �����ļ�����.ch1_File;

import java.io.File;
import java.io.FilenameFilter;
/**
 * ?
 *
 */
public class �ļ������� {

	public static void main(String[] args) {
		MyFileFilter filter = new MyFileFilter();
		File file = new File("d:\\jj");
		File[] list = file.listFiles(filter);
		for (File f : list) {
			System.out.println("�õ����ļ���" + f.getName());
		}
	}
}

class MyFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String fileName) {
		// �ж��ַ����Ƿ�����.MP3��β
		boolean b = fileName.endsWith(".mp3");

		return b;
	}

}
