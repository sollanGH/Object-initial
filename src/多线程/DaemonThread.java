package ���߳�;

//�ػ��߳�[��ӵ���һ���߳���,��һ���߳̽������߳�Ҳ�����]
public class DaemonThread extends Thread {

	// �����߳�����
	public DaemonThread(String name) {
		super(name);
	}

	public DaemonThread() {

	}

	public static void main(String[] args) {
		DaemonThread sollan = new DaemonThread("�ػ��̣߳�");
		// �����̱߳�Ϊ�ػ����̡���ǰ�߳̽����ػ��߳�Ҳ�������
		sollan.setDaemon(true);
		sollan.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(currentThread().getName() + "�̣߳� " + i);
		}

	}

	// �ػ��̵߳�������������������
	public void run() {
		for (int i = 1; i <= 10000; i++) {
			System.out.println(getName() + " " + i);
		}
	}

}
