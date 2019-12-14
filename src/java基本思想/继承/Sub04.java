package java基本思想.继承;

public class Sub04 extends Base04 { // 【如何调用父类的构造方法】
	public String color;

	public Sub04(double size, String name, String color) {
		super(size, name);
		this.color = color;

	}

	public static void main(String[] args) {

		Sub04 sollan = new Sub04(5.0, "同构Bug", "blue");// 由于构造函数含有参数，所以这里也要带参数

		System.out.println("版本" + sollan.size + "\n" + 
		"对象" + sollan.name + "\n" + "颜色:" + sollan.color);//name和size是父类中的变量
	}

}
