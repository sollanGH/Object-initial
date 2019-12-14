package 流与文件操作.ch1_File;

import java.io.File;
import java.io.FilenameFilter;
/**
 * ?
 *
 */
public class 文件过滤器 {

	public static void main(String[] args) {
		MyFileFilter filter = new MyFileFilter();
		File file = new File("d:\\jj");
		File[] list = file.listFiles(filter);
		for (File f : list) {
			System.out.println("得到的文件：" + f.getName());
		}
	}
}

class MyFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String fileName) {
		// 判断字符串是否是以.MP3结尾
		boolean b = fileName.endsWith(".mp3");

		return b;
	}

}
