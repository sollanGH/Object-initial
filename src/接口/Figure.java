package 接口;

public interface Figure { // 创建一个接口
	public final static double PI = 3.14;// 定义一个静态常量(前面的public、final、static可以省略，接口中的变量默认为公有、最终、静态)

	abstract void area();// 创建一个抽象方法(默认为public修饰)

}

//接口、类、抽象类都可继承接口，接口可被多继承
//若使用接口的类没有实现接口内的全部方法，该类就必须声明为抽象类