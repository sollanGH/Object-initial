package ���߳�.doubleRun;

/**
 * 1.����Run()����ͬʱʵ�֡�
 * 2.�ڲ�ͬ�����д�����ͬ��Run()������Ȼ����ͬһ�����н��е��ã�
 *
 */
public class Test {
	private static int a=10;

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= a; i++) {
			Practice1 p1 = new Practice1("�߳�A");
			p1.start();
			Thread.sleep(1);
			Practice2 p2 = new Practice2("�߳�B");
			p2.start();
			Thread.sleep(1);
			System.out.println("==========");

		}

	}

}
