package java基本思想.多态;

public class Manegger {
	
	private Animal animal;

	// 【使用方法的形参实现多态】传入一个子类的对象，并实现子类重写的方法
	public void feeled(Animal animal) {
		animal.eat();
	}

	// 【使用方法的返回值实现多态】
	public Animal getAnimal(String type) {
		Animal animal = null;
		// 如果传入"狗",就返回一个Dog对象
		if (type.equals("狗")) {
			animal = new Dog();
			// 如果传入"企鹅",就返回一个Penguin对象
		} else if (type.equals("企鹅")) {
			animal = new Penguin();
		}

		return animal;
	}

	// 【使用成员变量实现多态】
	public void setAnimal(Animal animal) {
		this.animal = animal;
		this.getShout();
	}
	public void getShout() {
		this.animal.shout();
		this.animal.kong();
//		this.animal.ShouMen  //这个Dog对象不能调用父类中没有的方法
	}
	
	//【使用数组实现多态】
	public double getSeller(Animal[] ai,double weight) {
		double money=0;
		for (int i = 0; i < ai.length; i++) {
			double a=ai[i].sell(weight);
			money+=a;
		}
		return money;
	}

	/*
	 * 1.向上转型
	 * 2.传进来的Dog已经转成animal了
	 * 3.被转成animal类型的Dog对象相当于animal对象，但在调用被子类重写的方法时会调用重写后的方法，而不是自己原本的方法
	 */
	public void play(Animal animal) {
		// 如果animal属于Dog对象
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.ShouMen();
			System.out.println("管理员和狗一起快乐玩耍……");
			
		} else if (animal instanceof Penguin) {
			Penguin penguin = (Penguin) animal;
			penguin.youYong();
			System.out.println("管理员在个企鹅游泳……");
		}
	}

	/*
	 * 多态的条件： 
	 * 1.继承 
	 * 2.父类的引用指向子类对象 
	 * 3.父类的引用可以用来装所有子类的对象
	 */
}
