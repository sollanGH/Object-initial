package java基本思想.关键字;

public class StaticDemo {
	static final String name="德莉莎";
	
	static {
		System.out.println("静态代码块，在类被加载时运行==11111111111111111111111111");
	}
	
	{
		System.out.println("实例代码块，第二弹");
	}
	{
		System.out.println("实例代码块，在对象被创建，并在这之前运行！==33333333333333333333333333333333");
	}
	
	
	public StaticDemo(){
		System.out.println("构造方法，在对象被创建时运行==444444444444444444444444444444");
	}

	public static void main(String[] args) {
		System.out.println("主方法调用==22222222222222222222222222222222");
		StaticDemo sd=new StaticDemo();

	}
	/*
	 * 1.[静态方法]不能调用[成员方法、变量]，只能通过[对象]访问
	 * 2.[静态方法]可以调用[静态变量、方法]
	 * 3.[成员变量]可以调用[静态变量、方法],方式为【类名】.【静态方法、变量】 Person.count
	 * 4.static修饰的[静态方法]直属于[类]
	 * 5.[成员]方法及成员变量直属于[某对象],类高于对象
	 * 
	 *	程序运行顺序：
	 *1.静态代码块、静态变量——(同等级,谁在前面就先运行谁)
	 *2.成员变量、实例代码块——(同等级,谁在前面就先运行谁)
	 *3.构造方法
	 * 
	 */

}
