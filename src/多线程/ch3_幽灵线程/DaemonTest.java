package ���߳�.ch3_�����߳�;

import java.util.Scanner;

/**
 * �������ƣ��ػ��̡߳���̨�߳�
 * 1.��Ҫ������th.setDaemon()
 * 2.��th�߳�����Ϊ��ǰ(������)�̵߳��ػ��̣߳���ǰ�߳̽������ػ��߳�Ҳ�����
 * 3.setDaemon(true);	//����Ϊ�ػ��߳�
 * 	 isDaemon();		//�ж��Ƿ�Ϊ�ػ��߳�
 * 
 *
 */
public class DaemonTest {
	public static void main(String[] args) {
		MyTask2 task = new MyTask2();
		Thread th = new Thread(task);
		// ��th�߳�����Ϊ���ػ��̡߳�
		th.setDaemon(true);
		th.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("�������+�س�����Main�߳�-----��");
		//Main�߳��ڴ�����
		sc.nextLine();
		//Main������th�߳�Ҳ�����
		System.out.println("�˳�������");
	}
}

class MyTask2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("���߳�i=:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}