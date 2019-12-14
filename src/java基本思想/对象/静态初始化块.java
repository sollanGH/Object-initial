package java基本思想.对象;

public class 静态初始化块 {
	//运行先后顺序:静态初始化块>初始化块>构造方法
	//在运行静态初始化块之前，会由上到下执行所有【父类】的静态初始化块。
	static {
		System.out.println("静态初始化块");
	}
	{
		System.out.println("普通初始化块");
	}

	public 静态初始化块() {
		System.out.println("无参数构造方法");
	}
}

class Mid extends 静态初始化块 {
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}

	public Mid() {
		System.out.println("Mid的无参构造方法");
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}

	public Leaf() {
		System.out.println("Leaf的无参数构造函数");
	}

	public static void main(String[] args) {
		new Leaf();
	}
}