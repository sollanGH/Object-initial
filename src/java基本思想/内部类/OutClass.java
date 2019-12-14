package java基本思想.内部类;

public class OutClass {

	private int x = 10;

	public class InClass {// 定义一个内部类
		public InClass(){}
		int y = 20;

		public int go(int i) {
			int result = i * i;
			return result;
		}
	}

	public static void main(String[] args) {
		OutClass oc = new OutClass();
		OutClass.InClass ic = oc.new InClass();// 为内部类创建对象

		System.out.println("OutClass:x=" + oc.x);// 输出外部类的x值
		System.out.println("InnerClass:y=" + ic.y);// 输出内部类y的值

		System.out.println("===========================================================");

//		InClass inc = new InClass();
//		int re = inc.go(19);
//		System.out.println(re);

	}
	/*	1.【非静态】内部类相当于外部类的成员变量
	 *	2.【静态】内部类相当于外部类本身
	 *  3.内部类可以访问外部类的私有方法及变量
	 *  4.外部类访问内部类需要创建对象
	 * 
	*/
}
