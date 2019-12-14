package Java集合.ch2_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		System.out.println("======Integer类型排序=============");
		/*
		 * 1.int 基本数据类型(不可用),这里只能用Integer 包装类型 
		 * 2.排序树：不可重复、将数据按[自然排序](从小到大)
		 * 
		 */
		Set<Integer> ages=new TreeSet<>();
		ages.add(1);
		ages.add(2);
		ages.add(45);
		ages.add(34);
		ages.add(9);
		ages.add(9);//【重复】将被丢弃
		System.out.println(ages);
		
		System.out.println("======String类型排序=============");
		/*
		 * 以首位开始的Unicode编码进行编码比较(16位,两字节)
		 */
		Set<String> str=new TreeSet<>();
		str.add("aaaaa");
		str.add("bnnnn");
		str.add("bbbbb");
		str.add("ccccc");
		str.add("张已");
		str.add("西西");
		str.add("样张");
		System.out.println(str);
		
		System.out.println(Integer.toHexString((int)'张'));
		System.out.println(Integer.toHexString((int)'样'));
		System.out.println(Integer.toHexString((int)'西'));
		
		System.out.println("======自定义对象类型排序==========");
		/*
		 * 1.排序的对象【类】需要实现Comparable接口
		 * 2.需要重写方法,【自定义】排序的规则
		 * 3.优点：简洁，只需同时实现一种排序的时候推荐
		 * 4.缺点：只能同时实现一种排序方式，因为还有一个方法
		 */
		Set<Student> student=new TreeSet<>();
		student.add(new Student(30,"aaa"));
		student.add(new Student(18,"aad"));
		student.add(new Student(18,"ddd"));
		student.add(new Student(19,"ttt"));
		student.add(new Student(20,"ttt"));
		student.add(new Student(29,"ttt"));
		System.out.println(student);
		
		System.out.println("======自定义比较器============");
		/*
		 * 1.自定义一个【类】来实现【比较器】
		 * 2.需要实现Comparator接口
		 * 3.优点：可以同时实现多种排序，因为可以实现多个排序类
		 * 4.缺点：需要创建实现类，有点麻烦
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
