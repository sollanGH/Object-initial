package 多线程.ch9_锁接口;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [Condition]接口
 * 
 * Condition newCondition(); 
 * 1.此方法在Lock接口中被定义 
 * 2.返回Condition实例
 *
 */
public class ConditionTest implements Runnable {

	Lock lock = new ReentrantLock();
	// 创建锁条件(每一个对象都是一种锁?)
	Condition cond1 = lock.newCondition();
	Condition cond2 = lock.newCondition();

	public static void main(String[] args) {
		ConditionTest task = new ConditionTest();
		Thread th1 = new Thread(task, "A");
		Thread th2 = new Thread(task, "B");
		th1.start();
		th2.start();
	}

	@Override
	public void run() {

	}

	public void test1() {
		// 上锁
		lock.lock();
		try {
			System.out.println("test1准备等待....");
			// 使当前线程【释放】锁资源,并在此处暂停
			cond1.await();
			System.out.println("test2释放了锁资源，test1继续执行");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 释放锁
		lock.unlock();
	}

	public void test2() {
		// 上锁
		lock.lock();
		// 唤醒【等待】中的线程cond1，使其在锁被释放后继续执行
		cond1.signal();
		// 释放锁
		lock.unlock();
	}

}
/**
 * 继承关系： 
 * 	*Condition 
 * 	*Lock-->ReentrantLock
 * 
 * Condition接口方法：
 * 1.void await()  //造成当前线程在接到信号或被中断之前一直处于等待状态。
 * 2.boolean await(long time, TimeUnit unit) //造成当前线程在接到信号、被中断或到达指定等待时间之前一直处于等待状态。
 * 3.void signal()  //唤醒一个等待线程。
 * 4.void signalAll() //唤醒所有等待线程。
 * 
 * await()
 * 效果与Object中的类似，不过能在lock块中使用
 * 
 */
