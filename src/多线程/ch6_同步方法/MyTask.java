package ���߳�.ch6_ͬ������;

import java.util.Scanner;

public class MyTask implements Runnable {

	@Override
	public void run() {
		intoArea();

	}

	/**
	 * �����ڲ���Ϊ���ٽ�����
	 * 
	 * ͬ�����������ͷŵ������
	 * 1.�ٽ����Ĵ��뱻ִ����
	 * 2.����return��break��ת��ǩ
	 * 3.Error��Exception
	 * 4.����Object.wait();
	 * 
	 */
	public synchronized void intoArea() {
		//��ȡ���߳���
		String thName = Thread.currentThread().getName();
		System.out.println(thName + ":�����ٽ���");
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s:��������˳��ٽ���",thName);
		sc.nextLine();
	}
}
