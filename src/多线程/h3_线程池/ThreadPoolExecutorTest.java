package 多线程.h3_线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的优点：
 * 1.开过的线程可以重用，不用频繁开启/销毁线程。
 * 2.方便对线程的管理，提高线程利用率
 * 3.增加JVM运行效率(创建新的线程要消耗一定量的资源)
 * 
 * 线程池内部能开启多条线程来处理任务，且这些线程都是能复用的。
 *
 */
public class ThreadPoolExecutorTest {

	public static void main(String[] args) {
		// 创建阻塞队列
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
		// 线程池参数：[核心池大小]、[最大池大小]、[存活时间]、[时间单位]、[任务队列]
		ExecutorService pool = new ThreadPoolExecutor(2, 4, 5, TimeUnit.SECONDS, queue);

		// 提交一个任务到线程池
		pool.submit(new FindDog());
		pool.submit(new SendLunch());
		pool.submit(new TakeGoods());

	}

}
/**
 * 1.Future<?> submit(Runnable task)  //提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
 * 
 * 
 *
 */

class FindDog implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "去找一条金毛犬...");
//		delay(2);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class SendLunch implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "送一个午餐....");
//		delay(10);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class TakeGoods implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "去送一个货物.....");
//		delay(50);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}



/**
 * 继承关系：
 * 	*Executor-->*ExecutorService-->ThreadPoolExecutor
 * 
 * 
 * 
 * 
 */



































