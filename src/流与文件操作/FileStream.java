package 流与文件操作;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream { // 文件【输入】、【输出】字节流

	public static void main(String[] args) {
		// 创建文件对象,通过file对象的文件不能被重新存储刷新
		File file = new File("D:\\JAVA程序设计\\File\\01.txt");
		if (file.exists()) {
			
			/*--------写-----入-----字-----节-----化-----字----符------------------------*/
			
			try {
				// 字节输出流,向文件内写入内容(括号内不写文件名将不能刷新数据)
				FileOutputStream out = new FileOutputStream(file,true);
				// 将字符串序列化，变成编码表对应的数字，转为字节
				byte b[] = "德莉莎世界第一可爱！                 噗！  ".getBytes();
				// 将b中的字符写入文件中【写入的字节数组】、【从数组第几位开始】、【写入多少字节】
				out.write(b);
				// 关闭流
				out.close();
			} catch (Exception w) {
				w.printStackTrace();
			}
//			 file.delete();
		} else {
			try {
				//若不存在则创建新文件
				file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}

		/*-------读-----取-----文-----件-----数-----据--------------------------------*/

		try {
			// 创建输入流对象(括号内可以直接写入文件名)
			FileInputStream in = new FileInputStream(file);
			// 创建一个数组用于储存读到的字符的字节编码
			byte[] i = new byte[3000];
			// 将读取到的字节存放在数组里【存入对象】、【从数组的第几位开始存】、【存入多长数据】，若已读到文件末尾，则返回-1
			in.read(i);
			// 将储存在数组内的字节转换为字符串
			System.out.println(new String(i));
			// 关闭流
			in.close();
			String str=new String(i);
			System.out.println("读取到的数据：\n"+str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
