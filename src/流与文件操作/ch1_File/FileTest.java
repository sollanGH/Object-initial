package 流与文件操作.ch1_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类的基本API方法
 * 
 * @author 16190
 *
 */
public class FileTest {

	public static void main(String[] args) {
//		APItest();
		 directory();
		// lookupDir("D:\\JAVA程序设计\\File");
	}

	public static void APItest() {
		// 创建文件对象(还没有创建文件)
		File file = new File("D:\\JAVA程序设计\\File\\FielWriter.txt");
		try {
			// 创建文件
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 检测文件是否存在
		boolean isExist = file.exists();
		System.out.println("文件是否存在：" + isExist);
		// 判断是否是文件
		boolean isFile = file.isFile();
		System.out.println("是否是一个文件：" + isFile);
		// 判断是否是目录
		boolean isDirectory = file.isDirectory();
		System.out.println("是否是一个目录：" + isDirectory);

		// 文件的最后修改日期
		long date = file.lastModified();
		Date day = new Date(date);
		SimpleDateFormat simp = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss E");
		String lastDay = simp.format(day);
		System.out.println("文件的最后修改时间：" + lastDay);

		// 文件长度
		long length = file.length();
		System.out.println("文件的长度：" + length + "字节");

		// 获取文件名
		String fileName = file.getName();
		System.out.println("文件名为：" + fileName);

		// 获取父级文件名
		String parentName = file.getParent();
		System.out.println("文件的父级路径：" + parentName);

		// 获取文件的绝对路径
		String path = file.getAbsolutePath();
		System.out.println("文件的绝对路径是：" + path);

	}

	// 目录相关的API
	public static void directory() {
		// 创建一个新的目录,不能一次创建多级目录
		File file2 = new File("D:\\JAVA程序设计\\File\\myfile2");
		boolean isCreate = file2.mkdirs();
		System.out.println("目录是否创建成功：" + isCreate + "\n");

		// 显示目录清单
		File file3 = new File("D:\\JAVA程序设计\\File");
		File[] list = file3.listFiles();
		for (File f : list) {
			System.out.println(f.getName());
		}

	}

	// 递归遍历目录清单
	public static void lookupDir(String path) {
		String p = "D:\\JAVA程序设计\\File";
		File file4 = new File(path);
		if (file4.exists()) {// 判断文件(目录)是否存在，若不存在则退出
			System.out.println("文件不存在！");
			return;
		}
		File[] li = file4.listFiles();// 获取当前文件清单
		if (li == null) {// 判断此目录是否为空，为空则只输出当前文件名
			System.out.println("文件名为：" + file4.getAbsolutePath());
			return;
		}
		for (File file : li) { // 不为空则遍历所有目录
			String absPath = file.getAbsolutePath();
			if (file.isFile()) {
				System.out.println("文件名：" + file.getAbsolutePath());
			} else {
				System.out.println("目录名：" + file.listFiles());
				lookupDir(absPath);
			}
		}
	}

}
