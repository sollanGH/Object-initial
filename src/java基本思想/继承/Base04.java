package java基本思想.继承;

public class Base04 { // 【如何调用父类的构造方法】
	public double size;
	public String name;

	public Base04(double size, String name) { // 构造方法
		this.size = size; // 成员变量的size等于方法中的size
		this.name = name;
	}
	public Base04() { //空的构造方法
		
	}
}
