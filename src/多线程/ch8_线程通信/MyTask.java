package 多线程.ch8_线程通信;

import java.util.Scanner;
/**
 * 此【wait】来自【Object】类
 * 
 * object.wait();
 * [主动]调用，[此]线程进入等待状态。让出[锁]资源，自身进行[阻塞]。
 * 
 * object.notify();
 * 唤醒被wait的线程，在本线程让出锁资源后[被阻塞]的线程继续执行
 * 
 * 步骤分析：
 * 1.老王拿到"1"锁资源
 * 2."1".wait();
 * 3.老李拿到"1"锁资源
 * 4."1".notify();
 * 5.老李释放锁
 * 6.老王恢复运行"1"监视对象		
 * 
 * 监视对象=锁
 * 在代码块中，必须使用括号里的对象调用这三个方法
 * 限制：只能用在同一个synchronized同步方法或代码块中
 * 被synchronized包围的块为【临界区】
 * 
 *
 */
public class MyTask implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("老王")) {
			toSleep(thName);
		} else {
			toWakeUp(thName);
		}

	}

	Scanner sc = new Scanner(System.in);

	private void toSleep(String thName) {
		synchronized ("1") {
			System.out.println("[老王]进入临界区...");
			System.out.println("按任意键+回车：[老王]去睡觉...");
			// 进行阻塞
			sc.nextLine();
			System.out.println("[老王]正在睡觉...");
			try {
				// 在此处阻塞，【老王】让出"1"的锁资源
				"1".wait();

				System.out.println("[老王]被叫醒了...重回临界区");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void toWakeUp(String thName) {
		System.out.println("[老李]准备进入临界区");
		synchronized ("1") {
			System.out.println("[老李]已经进入临界区");
			System.out.println("[老李]去叫醒[老王]");
			// 唤醒被wait()的老王，在老李离开临界区后老王的阻塞结束
			"1".notify();
			System.out.println("[老李]按任意键+回车离开临界区");
			sc.nextLine();
			System.out.println("[老李]离开临界区");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		MyTask task = new MyTask();
		Thread w = new Thread(task,"老王");
		Thread l = new Thread(task,"老李");

		// 老王先获取"1"锁资源
		w.start();
		Thread.sleep(90);
		// 老王让出锁资源后，老李可进入临界区
		l.start();

	}

}
