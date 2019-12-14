package Java集合.ch5_泛型.泛型类;

/**
 * 类型X是一个尚未确定的类型
 * 这个类型全类通用
 * 可以设置多个泛型
 * 在【创建类对象】时传入具体的参数类型
 */
public class Bird<X> {
	
	X x;
	
	{
		X x;
	}
	
	//传入参数的类型【待确定】
	public void add(X x) {
		System.out.println("传入的数据是：\n"+x);
	}
	
	public static void main(String[] args) {
		//泛型【入参】
		Bird<Double> b=new Bird<Double>();
		b.add(25.6);
	}

}
