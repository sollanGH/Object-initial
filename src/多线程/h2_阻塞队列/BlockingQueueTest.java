package 多线程.h2_阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * 阻塞队列 特点：
 *  1.当容器为空时，会引起【阻塞 】
 *  2.当容器满时，也会引起【阻塞】
 * 
 *
 */
public class BlockingQueueTest implements Runnable {
	// 创建固定[容量]的ArrayBlockingQueue
	BlockingQueue<String> queue = new ArrayBlockingQueue<>(20);

	public void produceTask(String thName) {
		int ran = (int) (Math.random()) * 10;
		String id = String.valueOf(ran);
		try {
			//增加元素
			queue.put(id);
			printf("[%s]生产了一个面包，现有面包数：%d\n", thName, queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sellTask(String thName) {
		try {
			Thread.sleep(100);
			//获取并移除首元素
			String id = queue.take();
			printf("[%s]消费了一个面包，现有面包数：%d\n", thName, queue.size());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		//线程名的获取一定要在【run()方法】内！！
		String thName = Thread.currentThread().getName();
		if (thName.equals("线程A")) {
			produceTask(thName);
		} else {
			sellTask(thName);
		}

	}

	private void printf(String string, Object... orgs) {
		System.out.printf(string, orgs);

	}

}

/**
 * 常用方法： 
 * 1.boolean add(E e) //将指定元素插入此队列中（如果立即可行且不会违反容量限制），成功时返回true，如果当前没有可用的空间，则抛出 IllegalStateException。 
 * 2.void put(E e) //将指定元素插入此队列中，将等待可用的空间（如果有必要）。 
 * 3.E take() //获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
 * 4.boolean remove(Object o)  // 从此队列中移除指定元素的单个实例（如果存在）。
 * 
 * 
 */
