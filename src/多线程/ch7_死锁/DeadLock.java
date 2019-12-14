package ���߳�.ch7_����;

public class DeadLock {
	public static void main(String[] args) {
		DeadLockThread deadLock = new DeadLockThread();
		Thread wang = new Thread(deadLock, "����");
		Thread li = new Thread(deadLock, "����");

		wang.start();
		li.start();
	}

}

class DeadLockThread implements Runnable {
	static Object A = new Object();// ��������Ǿ�̬��������������Ͳ�����ͬһ�������ϼ�����
	static Object B = new Object();// Ҳ���������ܱ�ʾ��ַ��ֵ��Ϊ���Ӷ���

	/**
	 * ������������Ƕ�ס� 
	 * �����̶߳��ڵȴ��Է����ͷ� 
	 * ����sleep()����ܲ�������
	 */
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("����")) {
			// ִ��·����A����-->B����
			wangTask();

		} else {
			// ִ��·����B����-->A����
			liTask();
		}

	}

	private void wangTask() {
		print("����׼������A����...");
		synchronized (A) {
			try {
				print("�����ѽ���A����\n");
				Thread.sleep(100); // ��֤�������B����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print("����������B����..........�ȴ������ͷ���Դ");
			try {
				Thread.sleep(2000);
				System.out.println("��������");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (B) {// Ҫ����A�ٽ����ڣ���ΪҪ����A����������B����
				print("�����ѽ���B���ң�����������");
			}
		}

	}

	private void liTask() {
		print("����������B����...");
		synchronized (B) {
			try {
				print("�����ѽ���B����\n");
				Thread.sleep(80);//��֤�����ѽ���A����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print("����������A����..........�ȴ������ͷ���Դ");
			synchronized (A) {// �˴����ƣ�����B����������A����
				print("�����ѽ���A���ң���������");
			}
		}
	}

	private void print(String content) {
		System.out.println(content);

	}

}
