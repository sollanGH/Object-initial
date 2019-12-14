package java基本思想.对象;

public class One01 { // 对于一个类来说最常见的三类数据有：构造方法、变量、方法
	public String name;
	public String color;// 定义变量，也可以叫做实例变量或非静态变量

	public One01(String name1, String color1) {// 定义构造方法(和对象的创建有关) 系统会默认一个空的构造方法
		name = name1;
		color = color1;
	}

	public void run(String speed) {// 定义方法，也叫做实例变量或非静态方法
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
