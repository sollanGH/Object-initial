package Java集合.ch5_泛型.泛型方法;

/**
 * 可以先不确定【方法中】形参类型
 * 能够任意选择方法的形参类型，不必重载方法
 */
public class Apple {
	
	//泛型构造方法
	public <K>Apple(K k){
		System.out.println("构造方法砸死了谁："+k);
	}
	
	//泛型方法
	public <T> void fall(T t) {
		System.out.println("你砸到谁了:" + t);
	}

	public static void main(String[] args) {
		//普通泛型方法
		Apple apple = new Apple();
		//【入参】传入形参类型
		apple.<String>fall("牛顿");
		//【入参】
		apple.<Integer>fall(484);
		
		//泛型构造方法
		Apple a=new <String>Apple("阿波罗");
	}
	
	
	
	
	//无参构造方法
	public Apple() {
		
	}
}
