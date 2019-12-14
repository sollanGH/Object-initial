package java基本思想.继承;

public class Ostrich02 extends Bird02 { // 【重写父类方法】
	
	public Ostrich02() {
		System.out.println("Ostrich02类的构造方法");
	}

	public void fly() { // 重写了父类的方法
		System.out.println("Ostrich02类中重写的flay方法");
	}

	public int jiafa(int c, int d) {// 重写父类的方法应 方法名相同 形参列表相同 返回值类型相同；
		a = c;						//子类异常抛出类应比父类小或相等；子类方法访问权限应比父类大。
		b = d;
		z = a - b;
		return z;
	}

	public static void main(String[] args) {
		Ostrich02 sollan = new Ostrich02();
		sollan.fly();
		// sollan.Bird02(); 不能直接调用父类的构造方法
//		System.out.println("修改后的算术结果为" + sollan.jiafa(6, 2));
	}

}
