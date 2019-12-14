package 多线程;

/**
 * 1.线程让步
 * 2.新的线程插入,并规定让步时间
 * 3.线程三插入main线程，main最多让它100毫秒，超过时间将同步运行
 * 4.使join()的线程优先执行
 *
 */
public class JoinTest extends Thread {

	// 【用于线程命名】创建一个传入name的构造方法,并调用Thread类的构造方法。
	public JoinTest(String name) {
		super(name);
	}

	public static void main(String[] args) throws InterruptedException {
		// 创建第1条线程,和main线程并发执行
		JoinTest sollan = new JoinTest("线程1");
		sollan.start();

		for (int x = 1; x <= 50; x++) {
			System.out.println(currentThread().getName() + "线程 " + x);//库伦特
			if (x == 20) {
				// 创建第3条线程
				JoinTest tj = new JoinTest("Join的新线程3");
				tj.start();
				// 第3条线程将插入main线程优先执行【main让步最长时间100毫秒，超过将3条线程一起并发执行】
				tj.join(100);
			}
		}

	}

	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
