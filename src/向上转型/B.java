package 向上转型;

public class B extends A {
	public B() {
		System.out.println("B的无参数构造方法");
	}

	public B(int b) {
		System.out.println("B的有参数构造方法");
	}
	
/*...............................................................................................................*/
	
	public void aa(int a) {// 将父类A中的aa方法覆盖
		System.out.println("B中的有参数aa方法");
	}

	public void aa() {// 将父类A中的aa方法覆盖
		System.out.println("B中的无参数aa方法");
	}

	public void bb() {
		System.out.println("B中的bb方法");
	}

	public void cc() {
		System.out.println("B中的cc方法");
	}
	public void out() {
		System.out.println("这里是B类的out方法");
	}
}
