package ���߳�;

/**
 * 1.�߳��ò�
 * 2.�µ��̲߳���,���涨�ò�ʱ��
 * 3.�߳�������main�̣߳�main�������100���룬����ʱ�佫ͬ������
 * 4.ʹjoin()���߳�����ִ��
 *
 */
public class JoinTest extends Thread {

	// �������߳�����������һ������name�Ĺ��췽��,������Thread��Ĺ��췽����
	public JoinTest(String name) {
		super(name);
	}

	public static void main(String[] args) throws InterruptedException {
		// ������1���߳�,��main�̲߳���ִ��
		JoinTest sollan = new JoinTest("�߳�1");
		sollan.start();

		for (int x = 1; x <= 50; x++) {
			System.out.println(currentThread().getName() + "�߳� " + x);//������
			if (x == 20) {
				// ������3���߳�
				JoinTest tj = new JoinTest("Join�����߳�3");
				tj.start();
				// ��3���߳̽�����main�߳�����ִ�С�main�ò��ʱ��100���룬������3���߳�һ�𲢷�ִ�С�
				tj.join(100);
			}
		}

	}

	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
