package 接口.接口回调;

public class Employee {

	JieKou jiekou;
	
	//Boss对象是JieKou的多态
	public Employee zhuce(JieKou jk, Employee e) {
		this.jiekou = jk;
		return e;
	}
	
	public void dosomething() {
		System.out.println("员工：拼命做好事情。");
		jiekou.shou();
	}

}
