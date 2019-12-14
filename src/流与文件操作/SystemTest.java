package 流与文件操作;

import java.io.*;

public class SystemTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Please input a String:");
		// 创建数组缓冲区
		byte[] b = new byte[512];//记录输入字符的ASC11值
		// 从标准输入流读取数据
		int count = System.in.read(b);
		// 按字符方式输出b元素值
		System.out.println("your input String is:");
		for (int i = 0; i < count; i++)
			System.out.println(b[i]);
	}

}
