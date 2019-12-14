package 多线程.h1_生产者与消费者;

public class TestMain {
	public static void main(String[] args) {

		BreadTask task = new BreadTask(20);
		Thread wang = new Thread(task, "老王");

		Thread th1 = new Thread(task, "candy");
		Thread th2 = new Thread(task, "渣渣辉");
		Thread th3 = new Thread(task, "犀利哥");
		Thread th4 = new Thread(task, "古天乐");

		wang.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
