package �����ļ�����.ch9_������;

import java.io.*;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/**
		 * ObjectOutputStream(OutputStream out) 
		 * ����һ������ 
		 * 1.���������Ҫ�̳�Serializableʵ�ֿ����л� 
		 * 2.����writeObject()��������һ������
		 * 3.�������ת��OutputStream����������ֽ�����ʽ 
		 * 4.OutputStream����ת����������ʽ
		 * 5.�����ͷ����롾���շ���������ӵ��һ������(����·��)��ͬ���ࡣ
		 */
		// д���Ķ�����OutputStream�����ֽ���ʽ���ͳ�ȥ
		OutputStream out = new FileOutputStream(new File("D:\\JAVA�������\\File\\music\\object.txt"));
		// ����������������Ŀ��ص�
		ObjectOutputStream oos = new ObjectOutputStream(out);
		Student st = new Student("���", "Ů");
		oos.writeObject(st);
		oos.close();
		out.close();

		/**
		 * ��ȡһ������ 
		 * 1.ʹ��readObject()������ȡһ������ 
		 * 2.������Ҫ��ת��ΪInputStream(�����ֽ���)
		 */
		File file = new File("D:\\JAVA�������\\File\\music\\object.txt");
		InputStream in = new FileInputStream(file);
		// ����������,����Ϊ��ȡ�ص�
		ObjectInputStream ois = new ObjectInputStream(in);
		Student student = (Student) ois.readObject();
		System.out.println(student);
		ois.close();
		in.close();

	}

}
/**
 * �̳й�ϵ��
 * InputSrteam-->ObjectInputStream(�ֽ���)
 * 
 */
