package java基本思想.抽象类;

public class Circle02 extends Shape01 {// 【继承了抽象类就必须实现抽象类中所有的抽象方法】

	public float r;
	private final float PI = 3.14f;// 定义一个不可更改的(final修饰)成员变量

	public Circle02(String name, float r) {
		super(name);// 向父类的构造方法传递name值
		this.r = r;// 成员变量r的值设为和局部变量r的值相等
	}

	public double calcArea() {// 重写了父类的抽象方法
		return PI * r * r; 
	}
}
