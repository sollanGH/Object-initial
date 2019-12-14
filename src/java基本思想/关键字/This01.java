package java基本思想.关键字;

public class This01 {// 【方法间互相引用】
	public String name;// 没有初始化，值为null
	public int oil;// 没有初始化，值为0
	public int speed;

	// 区分【成员变量】和方法中的【局部变量】
	public This01(String name, int oil, int speed) {
		this.name = name;
		this.oil = oil;
		this.speed = speed;
		System.out.println("初始化:" + "\n" + "车的名字：" + name + "\n" + "车的油量：" + oil + "\n" + "车的速度：" + speed+"\n");
	}

	// 这里【调用本类方法】，调用run方法
	public void highrun(int speed) {
		int highspeed = 2 * speed;
		this.run(highspeed);
		System.out.println("局部变量speed" + speed);// 局部的speed=120
		System.out.println("成员变量speed" + this.speed);// 成员的speed=240
		System.out.println("高速度为：" + this.speed);
	}

	// 【调用】其他【构造方法】
	public This01() {// 此处用this在无参数构造方法中调用本类中含两个参数的构造方法
		this("白马", 300, 120);// 调用其他构造方法必须在构造方法的第一句
		this.run(100);// 也可以在构造方法中用this调用其他方法
	}

	public void run(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
		This01 sollan = new This01("SOLLAN", 200, 100);
		sollan.highrun(120);

	}

}
