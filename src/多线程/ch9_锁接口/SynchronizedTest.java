package 多线程.ch9_锁接口;

/**
 * 【可重入锁】
 * 概念： 【同一条】线程在获取了某锁资源后，能【再次】获取这个锁资源。 
 * 【synchronized】支持可重入
 *
 */
public class SynchronizedTest implements Runnable {

	@Override
	public void run() {

		String thName = Thread.currentThread().getName();
		synchronized ("1") {
			System.out.printf("%s:成功获取了1号资源\n", thName);
			//再次进入"1"锁则可重入
			synchronized ("1") {
				System.out.printf("%s:再次获取了1号资源*2\n", thName);
			}
		}

	}

	public static void main(String[] args) {
		SynchronizedTest task = new SynchronizedTest();
		Thread th = new Thread(task, "线程1");
		th.start();
	}
}
