package 多线程.doubleRun;

/**
 * 1.【多Run()方法同时实现】
 * 2.在不同的类中创建不同的Run()方法，然后在同一个类中进行调用！
 *
 */
public class Test {
	private static int a=10;

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= a; i++) {
			Practice1 p1 = new Practice1("线程A");
			p1.start();
			Thread.sleep(1);
			Practice2 p2 = new Practice2("线程B");
			p2.start();
			Thread.sleep(1);
			System.out.println("==========");

		}

	}

}
