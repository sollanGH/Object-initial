package ���߳�.ch1_�������߳�;

/**
 * 1.ʵ��Runnable�ӿ� 
 * 2.ʵ��run()���� 
 * 3.Thread(Runnable target)
 * 4.�ܹ��ټ̳������࣬��չ�Խϸ�
 * 
 */
public class RunnableTest implements Runnable {

	@Override
	public void run() {
		//��ȡ��ǰ�߳���
		String thName=Thread.currentThread().getName();
		for (char c = 'A'; c <= 'z'; c++) {
			System.out.println("��ǰ�߳���:"+thName+"---"+c);
		}

	}

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread th1 = new Thread(rt,"�߳�1");
		Thread th2 = new Thread(rt,"�߳�2");
		//���������߳�
		th1.start();
		th2.start();

		for (int i = 1; i < 50; i++) {
			System.out.println("Main�߳�i=" + i);
		}
	}
}
