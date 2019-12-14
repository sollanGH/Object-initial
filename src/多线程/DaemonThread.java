package 多线程;

//守护线程[添加到另一个线程中,另一个线程结束此线程也会结束]
public class DaemonThread extends Thread {

	// 用于线程命名
	public DaemonThread(String name) {
		super(name);
	}

	public DaemonThread() {

	}

	public static void main(String[] args) {
		DaemonThread sollan = new DaemonThread("守护线程：");
		// 将此线程变为守护进程【当前线程结束守护线程也会结束】
		sollan.setDaemon(true);
		sollan.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(currentThread().getName() + "线程： " + i);
		}

	}

	// 守护线程的消亡不是立即发生的
	public void run() {
		for (int i = 1; i <= 10000; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
