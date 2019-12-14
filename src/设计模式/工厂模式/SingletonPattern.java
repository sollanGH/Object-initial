package 设计模式.工厂模式;

//单例设计模式
public class SingletonPattern {
	
	//私有的、唯一的、空的对象引用
	private static SingletonPattern sp=null;
	
	//私有构造方法，其他类无法调用
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		//保证只产生一个对象
		if(sp==null) {
			sp=new SingletonPattern();
		}
		
		return sp;
	}
	/*
	 * 原因：为了解决每次调用对象都重新new一个新的对象，新的对象都被分配一次地址，然而使用的对象的属性都是相同的，就造成了资源的浪费。
	 * 用法：
	 * 1.用private修饰构造方法，使其他类无法随便创建本类对象
	 * 2.创建getInstance()方法保证同时只存在一个对象
	 * 3.用static修饰getInstance()方法，以保证其他类能用类名调用到此方法
	 * 4.由于静态方法只能调用静态属性，所以创建的空对象引用也要用static修饰
	 * 5.同时也能采用enum枚举的形式来调用固定的属性来实现
	 * 
	 */


}
