package 多线程;
/**
 * 传统程序只能【串行】执行 
 * 创建【多线程】可以【并行】运行程序
 * 1.继承Thread类
 * 2.重写Thread类的run()方法
 * 3.使用Thread.start()启动线程
 * 4.需要继承，导致不能够再继承其他类，拓展性较差。
 *
 */
public class ThreadTest extends Thread {

	// 主函数是一个必定会执行的线程
	public static void main(String[] args) {
		// 创建对象
		ThreadTest sollan = new ThreadTest();
		// 调用Start()方法启动自定义线程Run()
		sollan.start();
		// 主函数线程中的内容将与自定义线程中的内容并发(行)执行--单核并发、多核并行
		try {
			for (int i = 0; i < 10; i++) {
				// 延时1000毫秒=1秒
				Thread.sleep(1000);
				System.out.println("Main线程：" + i);
			}
		} catch (Exception w) {
			w.printStackTrace();
		}
	}

	// 启动Thread的自定义线程方法Run()
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(500);
				System.out.println("Run线程：" + i);
				System.out.println(getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*相关概念：
 * 1.一个程序可以包含多个进程，一个进程能包含多个线程，线程是cpu调度的最小单位。
 * 2.每个线程拥有自身的资源互不干扰。
 * 3.同进程的各线程能共享进程资源，如堆、方法区、常量池。
 * 4.并行--一起执行；并发--快速切换执行
 * 
 *  构造方法：
 * Thread(String name) //传入线程名
 * Thread(Runnable target, String name) //传入实现类和线程名
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
