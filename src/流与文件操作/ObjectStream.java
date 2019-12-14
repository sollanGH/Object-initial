package 流与文件操作;

import java.io.*;

     //保存对象状态到文件中
public class ObjectStream implements Serializable {// 这个接口没有要实现的方法，是为了让类对象能序列化
	static ObjectStream object = new ObjectStream();

	/*-----------存-----储-----对-----象----------------------------------------*/

	private int width;
	private int height;

	public void setWidth(int w) {
		this.width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setHW() {
		this.width = 20;
		this.height = 20;
	}

	public static void main(String[] args) {
		// 创建类对象
		ObjectStream os = new ObjectStream();
		// 给类成员变量赋值
		os.setWidth(50);
		os.setHeight(70);

		try {
			// 创建文件，用来保存此状态的对象。文件扩展名自定义
			FileOutputStream fs = new FileOutputStream("G:/JAVA程序设计/File/foo.txt");
			// 对象流与文件流创建链接
			ObjectOutputStream oops = new ObjectOutputStream(fs);
			// 将对象写入对象流
			oops.writeObject(os);
			// 关闭对象流
			oops.close();
		} catch (IOException w) {
			w.printStackTrace();
		}

		/*--------读-----取-----对-----象--------------------------------*/
		// 将成员变量值改变
		os.setHW();

		try {
			// 文件输入流，确定被读取文件
			FileInputStream fi = new FileInputStream("G:/JAVA程序设计/File/foo.txt");
			// 对象输入流，和文件流建立链接
			ObjectInputStream oips = new ObjectInputStream(fi);
			// 读取文件中的对象，按照存储顺序读取，读取次数超过存储次数会报错
			// 将读取到的对象暂时存储到one中
			Object one = oips.readObject();
			// 创建本类的一个新的对象，将one中的对象强转为本类对象
			object = (ObjectStream) one;
			// 关闭对象流
			oips.close();
		} catch (ClassNotFoundException w) {
			w.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//打印的值依旧是改变之前的数值
		System.out.println(object.height);
		System.out.println(object.width);

	}
}
