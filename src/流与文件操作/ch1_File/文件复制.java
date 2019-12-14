package 流与文件操作.ch1_File;

import java.io.*;


public class 文件复制 {
	
	
	//传入【文件源地址】、【复制到的地址】
	public static void copyFileOld(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			int ch;
			//每读取一个字节就存储一个字节
			while((ch=is.read())!=-1) {
				//计算共有多少个字节
				total++;
				os.write(ch);
				System.out.printf("当前已复制的字节数：%d\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("操作消耗时间："+(endTime-startTime)+"ms");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		/**
		 * 一次读存一个字节
		 * 速度十分缓慢
		 *
		 */
	}
	
	//设置byte[]缓冲区，增加了速度
	public static void copyFileNew(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			//似乎10w左右性能【最优】
			byte[] buff=new byte[100000];
			int cnt=0;
			//若每次存到缓冲区的字节数大于零,每次读取10w个字节
			while((cnt=is.read(buff))>0) {
				total+=cnt;
				//将 byte 数组写入此输出流
				os.write(buff, 0, cnt);
				System.out.printf("当前已复制的字节数：%d		\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("操作消耗时间："+(endTime-startTime)+"ms");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	
	//使用Buffer流包装
	public static void copyFileBuffer(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		
		try {
			//可以用buffer包装，使效率再次提升！
			is=new BufferedInputStream(new FileInputStream(src));
			os = new BufferedOutputStream(new FileOutputStream(dest));
			//使用增强流似乎byte[]缓冲区设置得越大越快
			byte[] buff=new byte[1000000];
			int cnt=0;
			//若每次存到缓冲区的字节数大于零,每次读取100w个字节
			while((cnt=is.read(buff))>0) {
				total+=cnt;
				//将 byte 数组写入此输出流
				os.write(buff, 0, cnt);
				System.out.printf("当前已复制的字节数：%d		\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("操作消耗时间："+(endTime-startTime)+"ms");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		/**
		 * 运行原理：
		 * BufferedInputStream自身有缓冲流，若为8192字节，
		 * 若byte[4000],read()方法使用时，将源文件读取8192字节到自己的缓冲区，再将其中的4000个字节赋予byte[],缓冲区数据录完后
		 * read()再次从源文件节点获取8192个字节，以此类推。
		 * 
		 * 每次byte[]获取了字节数据，便通过write()写入输出缓冲区，若缓冲区为8192字节，3次后缓冲区存满，便开始写入文件节点，以此类推。
		 * 
		 */
	}
	
	public static void main(String[] args) {
//		copyFileOld("D:\\JAVA程序设计\\File\\工具.rar", "D:\\JAVA程序设计\\File\\myfile\\工具.rar");
//		copyFileNew("D:\\JAVA程序设计\\File\\MP4.mp4", "E:\\aa\\谭雅.mp4");
		copyFileBuffer("D:\\JAVA程序设计\\File\\工具.rar", "D:\\JAVA程序设计\\File\\myfile\\工具.rar");
	}

}











