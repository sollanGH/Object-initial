package 多线程;
/**
 * 1.实现Runnable接口 ，实现run()方法 
 * 2.不可以直接start()，要借助Thread对象
 * 3.Thread(Runnable target, String name) 
 * 4.能够再继承其他类，拓展性较高
 * 5.实现任务体与线程类分离，方便维护
 * 
 */
public class RunnableTest implements Runnable {

	// 主函数是一个必运行的线程
	public static void main(String[] args) {

		// 创建任务体对象
		Runnable sollan = new RunnableTest();

		// 借助Thread创建线程
		Thread t = new Thread(sollan);
		Thread h = new Thread(sollan);
		// 线程命名
		t.setName("线程t");
		h.setName("线程h");
		
//		threadName = Thread.currentThread().getName();
		// 启动自定义的线程
		t.start();
		h.start();

	}

	@Override
	public void run() {
		try {
			for (int q = 0; q < 10; q++) {
				// 线程休眠0.5秒
				Thread.sleep(500);
				// 获取线程名
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + "\t" + q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*
 * 可用于同时运行多条做相同工作的线程
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
