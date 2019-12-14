package 流与文件操作.ch9_对象流;

import java.io.*;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/**
		 * ObjectOutputStream(OutputStream out) 
		 * 存入一个对象 
		 * 1.存入的类需要继承Serializable实现可序列化 
		 * 2.利用writeObject()方法传送一个对象
		 * 3.这个对象被转成OutputStream【最基本】字节流形式 
		 * 4.OutputStream可再转化成其他形式
		 * 5.【发送方】与【接收方】都必须拥有一个类名(含包路径)相同的类。
		 */
		// 写出的对象以OutputStream基本字节形式输送出去
		OutputStream out = new FileOutputStream(new File("D:\\JAVA程序设计\\File\\music\\object.txt"));
		// 创建对象流，传入目标地点
		ObjectOutputStream oos = new ObjectOutputStream(out);
		Student st = new Student("张岚", "女");
		oos.writeObject(st);
		oos.close();
		out.close();

		/**
		 * 获取一个对象 
		 * 1.使用readObject()方法获取一个对象 
		 * 2.对象需要被转化为InputStream(基本字节型)
		 */
		File file = new File("D:\\JAVA程序设计\\File\\music\\object.txt");
		InputStream in = new FileInputStream(file);
		// 创建对象流,参数为获取地点
		ObjectInputStream ois = new ObjectInputStream(in);
		Student student = (Student) ois.readObject();
		System.out.println(student);
		ois.close();
		in.close();

	}

}
/**
 * 继承关系：
 * InputSrteam-->ObjectInputStream(字节流)
 * 
 */
