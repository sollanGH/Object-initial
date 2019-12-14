package java基本思想.抽象类;

public class Rectangle03 extends Shape01 {

	private float width;
	private float height;

	public Rectangle03(String name, float width, float height) {
		super(name);// 调用父类有参数的构造方法
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Shape01 s1 = new Circle02("圆形", 12.37f);// 前面的shape01也可以换成circle02，因为shape01是父类，因此此处可以用；但用父类的对象不能访问子类的实例
		Shape01 s2 = new Rectangle03("矩形", 12, 7);// 调用rectangle含3个参数的构造方法

		System.out.println("圆形的面积为" + s1.calcArea());
		System.out.println("矩形的面积为" + s2.calcArea());

	}

}
