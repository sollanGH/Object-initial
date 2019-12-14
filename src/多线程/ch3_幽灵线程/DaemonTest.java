package 多线程.ch3_幽灵线程;

import java.util.Scanner;

/**
 * 其他名称：守护线程、后台线程
 * 1.主要方法：th.setDaemon()
 * 2.将th线程设置为当前(调用者)线程的守护线程，当前线程结束，守护线程也会结束
 * 3.setDaemon(true);	//设置为守护线程
 * 	 isDaemon();		//判断是否为守护线程
 * 
 *
 */
public class DaemonTest {
	public static void main(String[] args) {
		MyTask2 task = new MyTask2();
		Thread th = new Thread(task);
		// 将th线程设置为【守护线程】
		th.setDaemon(true);
		th.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("按任意键+回车结束Main线程-----》");
		//Main线程在此阻塞
		sc.nextLine();
		//Main结束，th线程也会结束
		System.out.println("退出主程序");
	}
}

class MyTask2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("子线程i=:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}