package ���߳�.h2_��������;

public class MainTest {
	public static void main(String[] args) {
		BlockingQueueTest bq=new BlockingQueueTest();
		Thread th1=new Thread(bq,"�߳�A");
		Thread th2=new Thread(bq,"�߳�B");
		
		th1.start();
		th2.start();
	}
}
