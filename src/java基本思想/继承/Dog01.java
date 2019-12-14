package java基本思想.继承;

public class Dog01 extends Animal01 { // 【类的继承的基本作用】继承后可以把父类中的方法及变量当做自己的(public修饰)

	public void say() {
		System.out.println("狗叫：汪汪汪");
	}

	public static void main(String[] args) {
		Dog01 d = new Dog01();
		d.weight = 150;// Dog类本身没有weight属性，但因为父类有，所以能使用
		d.eat();// 使用父类的eat方法
		d.say();// 使用自己的say方法
		System.out.println("狗的长度为:" + d.weight);
	}
	/*
	 * 注意：子类调用父类的成员变量
	 * 1.父类变量需要public修饰
	 * 2.子类用super.name调用
	 * 3.super不能出现在static修饰的方法中。
	 * 4. 子类静态方法(main)中只能用子类对象调用
	 * 
	 * 
	 * 
	*/
}
