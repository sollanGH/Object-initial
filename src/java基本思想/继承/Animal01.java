package java基本思想.继承;

public class Animal01 { //【类的继承的基本作用】
	
	public double weight;
	private double lang; // 用private修饰的成员变量对子类不可视

	public void eat() {
		System.out.println("动物在吃东西");
	}

	private void dark() {
		System.out.println("动物在咆哮！");// 用private修饰的方法对子类不可视
	}
}
