package 多线程.ch1_创建多线程;

/**
 * 传统程序只能【串行】执行 
 * 创建【多线程】可以【并行】运行程序
 * 1.继承Thread类
 * 2.重写Thread类的run()方法
 * 3.使用Thread.start()启动线程
 * 4.需要继承，导致不能够再继承其他类，拓展性较差。
 *
 */
public class ThreadTest extends Thread{
	
	@Override
	public void run() {
		String thName=Thread.currentThread().getName();
		for(char c='A';c<='z';c++) {
			System.out.printf("%s:%d\n",thName,(int)c);
		}
	}
	
	public static void main(String[] args) {
		Thread th1=new ThreadTest("线程1");
		Thread th2=new ThreadTest("线程2");
		//开启两条线程
		th1.start();
		th2.start();
		
		for(int i=1;i<50;i++) {
			System.out.printf("%s:%d\n",Thread.currentThread().getName(),i);
		}
	}
	
	//使用【继承】Thread类时，创建构造方法用于线程【命名】
	public ThreadTest(String thName) {
		super.setName(thName);
	}
		
	public ThreadTest() {
			
	}
}
/**
 * 构造方法：
 * Thread(String name) //传入线程名
 * Thread(Runnable target, String name) //传入实现类和线程名
 * 
 * 并行：多个线程一起执行
 * 并发：多个线程快读切换执行
 */
