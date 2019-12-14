package 多线程.ch1_创建多线程;

/**
 * 1.实现Runnable接口 
 * 2.实现run()方法 
 * 3.Thread(Runnable target)
 * 4.能够再继承其他类，拓展性较高
 * 
 */
public class RunnableTest implements Runnable {

	@Override
	public void run() {
		//获取当前线程名
		String thName=Thread.currentThread().getName();
		for (char c = 'A'; c <= 'z'; c++) {
			System.out.println("当前线程名:"+thName+"---"+c);
		}

	}

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread th1 = new Thread(rt,"线程1");
		Thread th2 = new Thread(rt,"线程2");
		//创建两条线程
		th1.start();
		th2.start();

		for (int i = 1; i < 50; i++) {
			System.out.println("Main线程i=" + i);
		}
	}
}
