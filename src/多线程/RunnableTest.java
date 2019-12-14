package ���߳�;
/**
 * 1.ʵ��Runnable�ӿ� ��ʵ��run()���� 
 * 2.������ֱ��start()��Ҫ����Thread����
 * 3.Thread(Runnable target, String name) 
 * 4.�ܹ��ټ̳������࣬��չ�Խϸ�
 * 5.ʵ�����������߳�����룬����ά��
 * 
 */
public class RunnableTest implements Runnable {

	// ��������һ�������е��߳�
	public static void main(String[] args) {

		// �������������
		Runnable sollan = new RunnableTest();

		// ����Thread�����߳�
		Thread t = new Thread(sollan);
		Thread h = new Thread(sollan);
		// �߳�����
		t.setName("�߳�t");
		h.setName("�߳�h");
		
//		threadName = Thread.currentThread().getName();
		// �����Զ�����߳�
		t.start();
		h.start();

	}

	@Override
	public void run() {
		try {
			for (int q = 0; q < 10; q++) {
				// �߳�����0.5��
				Thread.sleep(500);
				// ��ȡ�߳���
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + "\t" + q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*
 * ������ͬʱ���ж�������ͬ�������߳�
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
