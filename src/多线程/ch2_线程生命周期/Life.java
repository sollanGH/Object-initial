package 多线程.ch2_线程生命周期;

public class Life {
	/**
	 * 1.start()之后不能再start()
	 * 2.结束后可以再run()
	 * 3.主线程不会等到子线程执行完再结束
	 * 4.线程生命周期
	 * 	【新建态】-->再堆上创建一个对象，做相关初始化操作
	 * 	【就绪态】-->th.start();
	 * 	【运行态】-->调度器线程执行
	 * 	【阻塞态】-->Thread.sleep()、th.join()
	 * 	【死亡态】-->线程执行完、发生异常未处理、强行终止
	 * 
	 * 5.线程调度
	 * 	【1】抢占/抢夺式
	 * 		多任务的操作系统多数如此，谁抢到cpu就谁执行
	 * 	【2】协同式
	 * 		严格按照任务分派执行，一件做完再做另一件
	 * 
	 * 6.线程睡眠
	 * 	Thread.sleep(毫秒);
	 * 	TimeUnit.SECONDS.sleep(秒);
	 * 	TimeUnit.MINUTES.sleep(分);
	 * 	TimeUnit.HOURS.sleep(时);
	 * 	TimeUnit.DAYS.sleep(天);
	 * 
	 */
}
