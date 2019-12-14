package ���߳�.ch9_���ӿ�;

/**
 * ������������
 * ��� ��ͬһ�����߳��ڻ�ȡ��ĳ����Դ���ܡ��ٴΡ���ȡ�������Դ�� 
 * ��synchronized��֧�ֿ�����
 *
 */
public class SynchronizedTest implements Runnable {

	@Override
	public void run() {

		String thName = Thread.currentThread().getName();
		synchronized ("1") {
			System.out.printf("%s:�ɹ���ȡ��1����Դ\n", thName);
			//�ٴν���"1"���������
			synchronized ("1") {
				System.out.printf("%s:�ٴλ�ȡ��1����Դ*2\n", thName);
			}
		}

	}

	public static void main(String[] args) {
		SynchronizedTest task = new SynchronizedTest();
		Thread th = new Thread(task, "�߳�1");
		th.start();
	}
}
