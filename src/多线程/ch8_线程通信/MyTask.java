package ���߳�.ch8_�߳�ͨ��;

import java.util.Scanner;
/**
 * �ˡ�wait�����ԡ�Object����
 * 
 * object.wait();
 * [����]���ã�[��]�߳̽���ȴ�״̬���ó�[��]��Դ���������[����]��
 * 
 * object.notify();
 * ���ѱ�wait���̣߳��ڱ��߳��ó�����Դ��[������]���̼߳���ִ��
 * 
 * ���������
 * 1.�����õ�"1"����Դ
 * 2."1".wait();
 * 3.�����õ�"1"����Դ
 * 4."1".notify();
 * 5.�����ͷ���
 * 6.�����ָ�����"1"���Ӷ���		
 * 
 * ���Ӷ���=��
 * �ڴ�����У�����ʹ��������Ķ����������������
 * ���ƣ�ֻ������ͬһ��synchronizedͬ��������������
 * ��synchronized��Χ�Ŀ�Ϊ���ٽ�����
 * 
 *
 */
public class MyTask implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("����")) {
			toSleep(thName);
		} else {
			toWakeUp(thName);
		}

	}

	Scanner sc = new Scanner(System.in);

	private void toSleep(String thName) {
		synchronized ("1") {
			System.out.println("[����]�����ٽ���...");
			System.out.println("�������+�س���[����]ȥ˯��...");
			// ��������
			sc.nextLine();
			System.out.println("[����]����˯��...");
			try {
				// �ڴ˴����������������ó�"1"������Դ
				"1".wait();

				System.out.println("[����]��������...�ػ��ٽ���");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void toWakeUp(String thName) {
		System.out.println("[����]׼�������ٽ���");
		synchronized ("1") {
			System.out.println("[����]�Ѿ������ٽ���");
			System.out.println("[����]ȥ����[����]");
			// ���ѱ�wait()���������������뿪�ٽ�������������������
			"1".notify();
			System.out.println("[����]�������+�س��뿪�ٽ���");
			sc.nextLine();
			System.out.println("[����]�뿪�ٽ���");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		MyTask task = new MyTask();
		Thread w = new Thread(task,"����");
		Thread l = new Thread(task,"����");

		// �����Ȼ�ȡ"1"����Դ
		w.start();
		Thread.sleep(90);
		// �����ó�����Դ������ɽ����ٽ���
		l.start();

	}

}
