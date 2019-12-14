package 多线程;

import java.util.Timer;
import java.util.TimerTask;

//多线程方法3：继承TimerTask
public class TimerTest extends TimerTask {

	public static void main(String[] args) {
		// 创建Timer对象
		Timer ti = new Timer();
		// 创建本类的对象
		TimerTest tt = new TimerTest();
		// 启动线程,schedule必须继承TimerTask后才能用,0参数代表延迟响应0毫秒
		ti.schedule(tt, 0);
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("ti.schedule(tt,0):" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* ......................................................................... */

		// Timer t2=new Timer();
		TimerTest tt1 = new TimerTest();// 创建本类的另一个对象
		// 用ti启动另一个线程(同一个Timer启动多个TimerTask易阻塞)
		ti.schedule(tt1, 0);
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("ti.schedule(tt1,0):" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* ......主...........函..........数..........之............外.................... */

	@Override // 继承timertask类之后必须实现的方法，也是一个线程
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("Run:" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*
 * schedule (日程安排) 一个Timer可以启动任意多个TimerTask实现线程，但是多个线程之间会存在阻塞
 * 如果需要线程之间的独立运行，最好还是一个Timer启动一个TimerTask实现线程
 * 一个本类对象就是一个TimerTask
 * 
 * 
 */
