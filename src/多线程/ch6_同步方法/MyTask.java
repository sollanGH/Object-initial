package 多线程.ch6_同步方法;

import java.util.Scanner;

public class MyTask implements Runnable {

	@Override
	public void run() {
		intoArea();

	}

	/**
	 * 方法内部称为【临界区】
	 * 
	 * 同步监视器被释放的情况：
	 * 1.临界区的代码被执行完
	 * 2.遇到return、break跳转标签
	 * 3.Error、Exception
	 * 4.遇到Object.wait();
	 * 
	 */
	public synchronized void intoArea() {
		//获取了线程名
		String thName = Thread.currentThread().getName();
		System.out.println(thName + ":进入临界区");
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s:按任意键退出临界区",thName);
		sc.nextLine();
	}
}
