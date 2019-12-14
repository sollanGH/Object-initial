package 多线程.h1_生产者与消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者与消费者
 * 
 *
 */
public class Practice1 implements Runnable {

	Lock lock = new ReentrantLock();
	// 仓库的最大容量
	private int capacity;
	// 当前面包的个数
	private static int count = 0;
	// 是否要生产？
	private boolean isProduce = true;

	// 创建两把锁【生产者】与【消费者】
	Condition produce = lock.newCondition();
	Condition sell = lock.newCondition();

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("王老板")) {
			while (true) {
				try {
					produceTask(thName);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} else {
			while (true) {
				try {
					sellTask(thName);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 用于生产的方法
	public void produceTask(String thName) throws Exception {
		lock.lock();
		if (isProduce) {
			Thread.sleep(100);
			count++;
			System.out.printf("[%s]生产中：面包数%d \n", thName, count);
			if (count == capacity) {
				// 如果生产满了，则进入销售状态
				this.isProduce = false;

				System.out.println("\n{面包生产完毕，可以叫大家来消费了}\n");
				// 唤醒其他线程
				sell.signalAll();
			}
		} else {
			// 暂停此条线程
			produce.await();

		}
		lock.unlock();
	}

	// 用于消费的方法
	public void sellTask(String thName) throws Exception {
		lock.lock();
		if (!isProduce) {
			Thread.sleep(100);
			count--;
			System.out.println(thName + "消费了一个面包，剩余面包：" + count + "个");
			if (count == 0) {
				isProduce = true;
				System.out.println("\n{面包消费卖完了，叫王老板来做面包}\n");
				produce.signalAll();
			}
		} else {
			System.out.printf("生产中%s正在等待\n", thName);
			// 若是生产状态，则暂停此线程
			sell.await();
		}

		lock.unlock();
	}

	// 规定面包的最大数值
	public Practice1(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		Practice1 p = new Practice1(10);
		Thread th1 = new Thread(p, "王老板");
		Thread th2 = new Thread(p, "【SOLLAN】");
		Thread th3 = new Thread(p, "【邵雨欣】");
		Thread th4 = new Thread(p, "【朱柳娟】");

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}
