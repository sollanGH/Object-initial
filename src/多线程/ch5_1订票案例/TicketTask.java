package 多线程.ch5_1订票案例;

/**
 *案例说明：
 *	有4个窗口买票，共100张票
 *	记录每个窗口的卖票数、剩余票数
 */
public class TicketTask implements Runnable {

	private int tickets = 100; // 代表总共100张票
	private int[] wins = new int[5]; // 代表4个人(索引1-4)

	@Override
	public void run() {
//		noSynchronized();
//		havaSynchronized();
		
		while(tickets>0) {
		Goto();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

		synchronized ("Object") {
			/*【票数变负数的原因】
			 * 避免了多个线程【同时访问】资源导致的错误 例如一个线程开始时的判断条件为i=1;执行完做i--操作，
			 * 但4个线程同时开始，判断时i都等于1,于是都进行了--操作，结果 i就直接变-3了。
			 */
		}
	}
	
	/**
	 * 没有同步代码块的方案
	 * 会导致余票为【负数】
	 */
	public void noSynchronized() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
		while (tickets > 0) {
			try {
				Thread.sleep(2);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wins[index]++;
			tickets--;
			System.out.printf("[%s]已售出：%d张票，剩余：%d张票\n", thName, wins[index], tickets);

		}
	}
	
	/**
	 * 格式：
	 * synchronized(Object o){}
	 * 
	 */
	public void havaSynchronized() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
		while (tickets > 0) {
			try {
				Thread.sleep(2);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/**
			 * 同步代码块 
			 * 1.代码块内的资源同时仅供一个线程使用 (同监视对象)
			 * 2.Object为【监视对象】
			 * 3.同一个监视对象下的资源一次仅能被一个线程访问。
			 * 4.一切能够表示地址的东西都可用于作为监视对象
			 */
			synchronized ("Object") {
				if(tickets > 0) {
			wins[index]++;
			tickets--;
			System.out.printf("[%s]已售出：%d张票，剩余：%d张票\n", thName, wins[index], tickets);
				}
			}
		}
	}
	
	

	/**
	 * 【同步方法】 
	 * 1.使用【类的引用对象】作为监视对象 (锁)
	 * 2.当此方法执行完就释放锁
	 * 3.监视对象：this
	 * 	TicketTask task = new TicketTask();
	 * 	Thread th=new Thread(task);	task为监视对象(锁)
	 * 4.锁未释放时只能有一个线程访问临界区(方法内代码)资源
	 */
	public synchronized void Goto() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
			wins[index]++;
			tickets--;
			System.out.printf("[%s]已售出：%d张票，剩余：%d张票\n", thName, wins[index], tickets);
			
	}

}
