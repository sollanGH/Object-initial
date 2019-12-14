package 多线程.ch9_锁接口;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [ReentrantLock]可重入锁
 * 
 * 1.一个可重入的互斥锁 Lock(仅有一种锁)
 * 2.它具有与使用 synchronized方法和语句所访问的隐式监视器锁相同的一些基本行为和语义，但功能【更强大】。
 * 3.利用	lock.lock();	lock.unlock();	包围代码。
 * 4.含锁计数器，上几次锁，就需要解几次锁。
 * 
 * 5.boolean tryLock();
 * 	 仅在调用时锁未被另一个线程保持的情况下，才获取该锁。
 */
public class ReentrantLockTest implements Runnable {
	Lock lock = new ReentrantLock();

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("线程A")) {
			try {
				
				methodA(thName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			methodB(thName);
		}

	}

	private void methodA(String thName) throws Exception {
		System.out.printf("%s尝试获取锁资源....\n",thName);
		//获取锁，未获取锁的线程不许执行
		lock.lock();
		System.out.printf("%s【成功】获取锁\n",thName);
		
		Thread.sleep(3000);
		//获取第二重锁
		lock.lock();
		
		/**
		 * 释放锁，其他线程可以执行了
		 * 若不释放锁，其他线程将不能执行
		 * 锁几次，解几次
		 */
		lock.unlock();
		System.out.printf("%s执行解锁第1重锁\n",thName);
		
		Thread.sleep(3000);
		//解锁第二重锁
		lock.unlock();
		System.out.printf("%s执行解锁第2重锁\n",thName);
		
		
		
	}
	
	private void methodB(String thName) {
		System.out.printf("%s尝试获取锁资源....\n",thName);
		
		lock.lock();
		System.out.printf("%s【成功】获取锁\n",thName);
		lock.unlock();
		System.out.printf("%s执行解锁\n",thName);
	}


	public static void main(String[] args) throws Exception {
		ReentrantLockTest task=new ReentrantLockTest();
		Thread th1=new Thread(task,"线程A");
		Thread th2=new Thread(task,"线程B");
		
		th1.start();
		//保证线程A优先执行
		Thread.sleep(50);
		th2.start();
	}
}
/**
 * 继承关系： 
 * 	*Lock-->ReentrantLock
 * 
 * Lock接口方法：
 * 	1.[void] lock()  //获取锁。
 * 	2.[Condition] newCondition()  //返回绑定到此 Lock 实例的新 Condition 实例。
 * 	3.[boolean] tryLock()  //仅在调用时锁为空闲状态才获取该锁。
 * 	4.[boolean] tryLock(long time, TimeUnit unit)  //如果锁在给定的等待时间内空闲，并且当前线程未被中断，则获取锁。
 * 	5.[void] unlock()  //释放锁。
 * 
 * 
 * 
 */
