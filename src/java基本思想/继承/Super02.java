package java基本思想.继承;

public class Super02 extends Ostrich02 {// 【super的用法】

	public void fly() {
		System.out.println("Super03改写后的fly方法");// 改写了父(祖)类的fly方法
	}
	public Super02() {
		super();
	}
	public void CallFly() { // super的作用：调用父类被覆盖的实例方法 (及变量);
		super.fly(); // 调用父类的构造函数(方法)，此时super();需写在子类构造函数的第一条
	}

	public static void main(String[] args) {
		Super02 sollan = new Super02();
		sollan.CallFly();
		sollan.fly();
	}

}
