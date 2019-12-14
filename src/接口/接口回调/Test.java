package 接口.接口回调;

public class Test {

	public static void main(String[] args) {
		Employee em1=new Employee();
		Employee em2=em1.zhuce(new Boss(), em1);
		em2.dosomething();

	}

}
