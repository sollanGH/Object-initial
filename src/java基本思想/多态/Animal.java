package java基本思想.多态;

public class Animal {
	public double weight ;
	
	public Animal() {
		super();
	}

	public Animal(double weight) {
		super();
		this.weight = weight;
	}

	public void eat() {
		System.out.println("动物在吃东西……");
	}
	
	public void shout() {
		System.out.println("动物在狂叫……");
	}
	
	public void kong() {
		System.out.println("这是Animal类的kong方法！");
	}
	
	public double sell(double wei) {
		double money=0;
		
		return money;
	}
}
