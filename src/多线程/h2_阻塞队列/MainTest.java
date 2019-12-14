package 多线程.h2_阻塞队列;

public class MainTest {
	public static void main(String[] args) {
		BlockingQueueTest bq=new BlockingQueueTest();
		Thread th1=new Thread(bq,"线程A");
		Thread th2=new Thread(bq,"线程B");
		
		th1.start();
		th2.start();
	}
}
