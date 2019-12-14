package java基本思想.多态;

public class Dog extends Animal {
	public Dog(double wei) {
		super(wei);
	}
	public Dog() {
		
	}

	@Override
	public void eat() {
		System.out.println("狗在吃骨头……");
	}
	
	public void shout() {
		System.out.println("小狗汪汪叫……");
	}
	
	public void ShouMen() {
		System.out.println("狗在看门……");
	}
	
	public double sell(double wei) {
		double money=0;
		money=wei*45;
		return money;
	}

}
