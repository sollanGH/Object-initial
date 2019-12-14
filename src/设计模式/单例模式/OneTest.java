package 设计模式.单例模式;

public class OneTest {
	private String name;
	private int ID;

	//【1】创建一个私有的、静态的对象
	private static OneTest one = new OneTest();

	//【2】构造方法私有化
	private OneTest() {
		
	}

	//【3】开放一个方法让外界获取对象
	public static OneTest getObject() {
		
		return one;
	}
	/**
	 * 只保留一个static方法给外界用于获取本类对象
	 * 
	 */
}
