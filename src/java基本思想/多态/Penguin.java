package java基本思想.多态;

public class Penguin extends Animal {
	public Penguin(double wei) {
		super(wei);
	}

	public Penguin() {
	}

	@Override
	public void eat() {
		System.out.println("企鹅在吃鱼……");
	}

	public void shout() {
		System.out.println("企鹅噗噗叫……");
	}

	public void youYong() {
		System.out.println("企鹅在游泳……");
	}

	public double sell(double wei) {
		double money = 0;
		money = wei * 500;
		return money;
	}
}
