package Java����.ch2_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		System.out.println("======Integer��������=============");
		/*
		 * 1.int ������������(������),����ֻ����Integer ��װ���� 
		 * 2.�������������ظ��������ݰ�[��Ȼ����](��С����)
		 * 
		 */
		Set<Integer> ages=new TreeSet<>();
		ages.add(1);
		ages.add(2);
		ages.add(45);
		ages.add(34);
		ages.add(9);
		ages.add(9);//���ظ�����������
		System.out.println(ages);
		
		System.out.println("======String��������=============");
		/*
		 * ����λ��ʼ��Unicode������б���Ƚ�(16λ,���ֽ�)
		 */
		Set<String> str=new TreeSet<>();
		str.add("aaaaa");
		str.add("bnnnn");
		str.add("bbbbb");
		str.add("ccccc");
		str.add("����");
		str.add("����");
		str.add("����");
		System.out.println(str);
		
		System.out.println(Integer.toHexString((int)'��'));
		System.out.println(Integer.toHexString((int)'��'));
		System.out.println(Integer.toHexString((int)'��'));
		
		System.out.println("======�Զ��������������==========");
		/*
		 * 1.����Ķ����ࡿ��Ҫʵ��Comparable�ӿ�
		 * 2.��Ҫ��д����,���Զ��塿����Ĺ���
		 * 3.�ŵ㣺��ֻ࣬��ͬʱʵ��һ�������ʱ���Ƽ�
		 * 4.ȱ�㣺ֻ��ͬʱʵ��һ������ʽ����Ϊ����һ������
		 */
		Set<Student> student=new TreeSet<>();
		student.add(new Student(30,"aaa"));
		student.add(new Student(18,"aad"));
		student.add(new Student(18,"ddd"));
		student.add(new Student(19,"ttt"));
		student.add(new Student(20,"ttt"));
		student.add(new Student(29,"ttt"));
		System.out.println(student);
		
		System.out.println("======�Զ���Ƚ���============");
		/*
		 * 1.�Զ���һ�����ࡿ��ʵ�֡��Ƚ�����
		 * 2.��Ҫʵ��Comparator�ӿ�
		 * 3.�ŵ㣺����ͬʱʵ�ֶ���������Ϊ����ʵ�ֶ��������
		 * 4.ȱ�㣺��Ҫ����ʵ���࣬�е��鷳
		 */
		Set<Student> ac=new TreeSet<>(new AgeAscComparator());
		ac.add(new Student(30,"aaa"));
		ac.add(new Student(30,"eaa"));
		ac.add(new Student(30,"ddd"));
		ac.add(new Student(19,"ttt"));
		ac.add(new Student(20,"ttt"));
		ac.add(new Student(23,"ttt"));
		System.out.println(ac);
		
	}

}
