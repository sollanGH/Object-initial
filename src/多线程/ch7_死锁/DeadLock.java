package 多线程.ch7_死锁;

public class DeadLock {
	public static void main(String[] args) {
		DeadLockThread deadLock = new DeadLockThread();
		Thread wang = new Thread(deadLock, "老王");
		Thread li = new Thread(deadLock, "老李");

		wang.start();
		li.start();
	}

}

class DeadLockThread implements Runnable {
	static Object A = new Object();// 这里必须是静态变量，否则加锁就不是在同一个对象上加锁了
	static Object B = new Object();// 也可用其他能表示地址的值作为监视对象

	/**
	 * 两个监视区【嵌套】 
	 * 两个线程都在等待对方的释放 
	 * 若不sleep()则可能不会死锁
	 */
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("老王")) {
			// 执行路径：A密室-->B密室
			wangTask();

		} else {
			// 执行路径：B密室-->A密室
			liTask();
		}

	}

	private void wangTask() {
		print("老王准备进入A密室...");
		synchronized (A) {
			try {
				print("老王已进入A密室\n");
				Thread.sleep(100); // 保证老李进入B密室
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print("老王欲进入B密室..........等待老李释放资源");
			try {
				Thread.sleep(2000);
				System.out.println("【死锁】");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (B) {// 要放在A临界区内，因为要保持A的锁，申请B的锁
				print("老王已进入B密室！！！！！！");
			}
		}

	}

	private void liTask() {
		print("老李欲进入B密室...");
		synchronized (B) {
			try {
				print("老李已进入B密室\n");
				Thread.sleep(80);//保证老王已进入A密室
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print("老李欲进入A密室..........等待老王释放资源");
			synchronized (A) {// 此处类似，保持B的锁，申请A的锁
				print("老李已进入A密室！！！！！");
			}
		}
	}

	private void print(String content) {
		System.out.println(content);

	}

}
