package �ӿ�.�ӿڻص�;

public class Employee {

	JieKou jiekou;
	
	//Boss������JieKou�Ķ�̬
	public Employee zhuce(JieKou jk, Employee e) {
		this.jiekou = jk;
		return e;
	}
	
	public void dosomething() {
		System.out.println("Ա����ƴ���������顣");
		jiekou.shou();
	}

}
