package 多线程.线程同步;

/**
 * 同步方法_实现Runnable
 * 1.在方法里加入synchronized关键字，且此方法会在Run()方法里运行
 * 2.只能同步 不同Thread对象的线程
 * 3.不能同步 多个本类对象的线程
 * 4.只能同步【同一个本类对象】的【不同Thread对象】的线程
 * 
 * @author SOLLAN
 *
 */
public class Method implements Runnable {
	private static int count = 100;
	private static int i = 1;

	public void run() {
		tack();
	}

	public synchronized void tack() {
		if (i < count) {
			System.out.println(Thread.currentThread().getName() + "第" + i + "张票");
			i++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		//只能用同一个tt对象
		Method tt=new Method ();
		for (int i = 1; i <= 10; i++) {
			Thread th=new Thread(tt,"线程"+i+"\t");
			th.start();
		}
	}
}
