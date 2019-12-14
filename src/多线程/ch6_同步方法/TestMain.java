package 多线程.ch6_同步方法;
/**
 * 【同步方法】 
 * 1.使用【类的引用对象】作为监视对象 (锁)
 * 2.当此方法执行完就释放锁
 * 3.监视对象：this
 * 	TicketTask task = new TicketTask();
 * 	Thread th=new Thread(task);	task为监视对象(锁)
 * 4.锁未释放时只能有一个线程访问临界区(方法内代码)资源
 */
public class TestMain {
	public static void main(String[] args) {
		//task作为这两个线程共同的监视对象
		MyTask task=new MyTask();
		Thread th1=new Thread(task,"线程1");
		Thread th2=new Thread(task,"线程2");
		
		th1.start();
		th2.start();
	}
}
