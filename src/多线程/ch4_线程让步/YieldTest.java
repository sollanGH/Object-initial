package 多线程.ch4_线程让步;

/**
 * 1.设置线程的【优先级】
 * 2.优先级[高]的将有[更多]机会获得CPU
 * 
 * 3.Thread.yield();
 * 	 让出当前CPU执行权，回到就绪态，但很快就会被CPU再次调度回来，再次运行。
 * 	 这与[线程的优先级]有比较大的关系
 *
 */
public class YieldTest {
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread th1 = new Thread(task, "低优先级");
		Thread th2 = new Thread(task, "高优先级");
		//低优先级
		th1.setPriority(Thread.MIN_PRIORITY);
		//高优先级
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();

	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();

		for (int i = 0; i < 50; i++) {
			if (thName.equals("高优先级")) {
				//  暂停当前正在执行的线程对象(重入就绪态)，并执行其他线程
				Thread.yield();
			}
			System.out.println(thName + i);
			
		}

	}

}