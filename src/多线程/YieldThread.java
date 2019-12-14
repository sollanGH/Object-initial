package 多线程;

//线程让步
public class YieldThread extends Thread {
	// 用于线程命名
	public YieldThread(String name) {
		super(name);
	}

	public static void main(String[] args) {
		YieldThread sollan1 = new YieldThread("高级");
		YieldThread sollan2 = new YieldThread("低级");

		// 将1优先级调高
		sollan1.setPriority(MAX_PRIORITY);
		sollan1.start();

		// 将2优先级调低
		sollan2.setPriority(MIN_PRIORITY);
		sollan2.start();

	}
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(getName() + ": " + i);
			if (i == 20) {
				// [当前线程让步]让【同优先级】或【高优先级】的线程先走
				Thread.yield();
			}
		}
	}
	/* 	优先级高的进程将获得更多的执行机会。
	 * 	优先级：	MAX_PRIORITY 其值为10
	 * 			NORM_PRIORITY 其值为5
	 * 			MIN_PRIORITY 其值为1
	 * 			Main线程的优先级为中
	 * 
	 * 
	 * 
	 */
}
