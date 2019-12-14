package 多线程.ch5_1订票案例;

public class TestMain {
	public static void main(String[] args) {
		//task为同步方法的【锁】监视对象
		TicketTask task = new TicketTask();
		Thread win1 = new Thread(task, "win1");	//售票员1
		Thread win2 = new Thread(task, "win2");	//售票员2
		Thread win3 = new Thread(task, "win3");	//售票员3
		Thread win4 = new Thread(task, "win4");	//售票员4

		// 若无同步锁，4个线程一起运行，会导致【共同资源】发生混乱
		win1.start();
		win2.start();
		win3.start();
		win4.start();
	}
}
