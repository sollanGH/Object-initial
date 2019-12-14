package java基本思想.继承;

public class Bird02 { // 【重写父类方法】

	int a, b, z;

	public Bird02() { // Bird02类的构造方法
		System.out.println("Bird02类的构造方法");
	}

	public void fly() { // 创建一个共有的方法
		System.out.println("Bird02类的fly()方法");
	}

	public int jiafa(int c, int d) {
		a = c;
		b = d;
		z = a + b;
		return z;
	}

}
