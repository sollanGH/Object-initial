package java基本思想.对象;

public class 初始化块 {
	{//创建一个初始化块
		int a=6;
		if(a>4) {
			System.out.println("person的初始化块：局部变量a>4");
		}
		System.out.println("person的初始化块");
	}
	
	{//创建第二个初始化块
		System.out.println("person的第二个初始化块");
	}
	public 初始化块() {//创建无参数构造方法
		System.out.println("person的无参数构造方法");
	}
	public static void main(String[] args) {
		new 初始化块();
	}

}
//初始化块将在构造方法之前运行，而初始化块之间写在前面的代码将先运行
//执行初始化块时会由上到下先执行所有父类的初始化块，然后执行所有父类的构造方法，最后再执行本类的初始化块和构造方法。