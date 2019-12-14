package java基本思想.抽象类;

public abstract class Shape01 {// 【抽象类、抽象方法的使用及作用】
	
	public abstract double calcArea();// 抽象方法后不能接方法体
	
	public Shape01() {}//抽象类中的构造方法不用于创建shape01类对象，而是被子类调用
	
	public Shape01(String name) {
		System.out.println(name+"Shape Created");
	}
	
	public String toString() {
		return "this is shape01";
	} 
}
/* 抽象类中不一定有抽象方法，但有抽象方法的类一定是抽象类
 * 抽象类无法使用new来调用构造方法而创建实例
 * 唯一价值就是被继承，然后由子类实现所有的抽象放法
*/