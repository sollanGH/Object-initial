package 设计模式.工厂模式;

//单例设计模式测试
public class SingletonPatternTest {

	public static void main(String[] args) {
		
//		SingletonPattern s=new SingletonPattern(); //单例测试模式类不可创建对象
		
		//创建对象必须调用getInstance()方法
		SingletonPattern s=SingletonPattern.getInstance();
		System.out.println(s);
		
		SingletonPattern p=SingletonPattern.getInstance();
		System.out.println(p);//两次创建对象地址值相同，保证对象资源不泛滥
		
		System.out.println("=================两次创建的对象地址相同，没有造成资源浪费！==============\n");
		
		SingletonPatternTest spt1=new SingletonPatternTest();
		SingletonPatternTest spt2=new SingletonPatternTest();
		System.out.println(spt1);
		System.out.println(spt2);
		System.out.println("创建了两份对象，都是为了用对象的属性，造成了不必要的资源浪费！！");

	}

}
