package 多线程.线程同步;

/**
 * 同步代码块_继承Thread
 * 1.同步代码块里需要传入一个【具体对象】
 * 2.利用Run()方法运行含【同步代码块】的方法
 * 
 * @author SOLLAN
 *
 */
public class CodeBlock extends Thread {
	private static Object lock = new Object();
	private static int count = 100;
	private static int i = 1;

	public CodeBlock(String name) {
		super(name);
	}

	public void run() {
		tack();
	}

	public void tack() {
		synchronized(lock) {
			if (i < count) {
				System.out.println(Thread.currentThread().getName() + "第" + i + "张票");
				i++;
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				Thread.sleep(300);
			}
			CodeBlock tack = new CodeBlock("第" + i + "人出票：\t");
			System.out.println("第" + i + "人准备抢票：");
			tack.start();
			Thread.sleep(1);

		}
	}
}
