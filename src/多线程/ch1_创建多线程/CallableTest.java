package 多线程.ch1_创建多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {

	/**
	 * 增强型任务体
	 * 1.不使用run()方法，使用call()方法 
	 * 2.含【返回值】
	 * 3.需要引入【FutureTask】类
	 * 4.可以终止任务执行
	 * 5.可通过返回值探知线程执行状态
	 */
	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 100; i++) {
			System.out.println("i="+i);
			//睡眠10ms
			Thread.sleep(10);
		}
		return 999;
	}

	public static void main(String[] args) {
		//创建【任务类】对象
		CallableTest ct = new CallableTest();
		// 引入FutureTask类，传入任务类对象
		FutureTask<Integer> futask = new FutureTask<Integer>(ct);
		//创建Thread对象
		Thread th = new Thread(futask);
		th.start();
		try {
			//【打断】当前线程
			futask.cancel(true);
			// get()方法会产生阻塞，若该线程没执行完就会一直阻塞在这里不往下运行
			Integer in = futask.get();
			System.out.println("线程执行完毕，获得返回值：" + in);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("{线程运行完再做的事}");

	}
}
/**
 * task.get();	//获取返回值
 * task.isDone();//判断任务是否完成
 * task.cancel();//终止任务的执行
 * 
 */
