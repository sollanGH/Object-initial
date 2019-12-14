package ���߳�.ch9_���ӿ�;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [ReentrantLock]��������
 * 
 * 1.һ��������Ļ����� Lock(����һ����)
 * 2.��������ʹ�� synchronized��������������ʵ���ʽ����������ͬ��һЩ������Ϊ�����壬�����ܡ���ǿ�󡿡�
 * 3.����	lock.lock();	lock.unlock();	��Χ���롣
 * 4.�������������ϼ�����������Ҫ�⼸������
 * 
 * 5.boolean tryLock();
 * 	 ���ڵ���ʱ��δ����һ���̱߳��ֵ�����£��Ż�ȡ������
 */
public class ReentrantLockTest implements Runnable {
	Lock lock = new ReentrantLock();

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("�߳�A")) {
			try {
				
				methodA(thName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			methodB(thName);
		}

	}

	private void methodA(String thName) throws Exception {
		System.out.printf("%s���Ի�ȡ����Դ....\n",thName);
		//��ȡ����δ��ȡ�����̲߳���ִ��
		lock.lock();
		System.out.printf("%s���ɹ�����ȡ��\n",thName);
		
		Thread.sleep(3000);
		//��ȡ�ڶ�����
		lock.lock();
		
		/**
		 * �ͷ����������߳̿���ִ����
		 * �����ͷ����������߳̽�����ִ��
		 * �����Σ��⼸��
		 */
		lock.unlock();
		System.out.printf("%sִ�н�����1����\n",thName);
		
		Thread.sleep(3000);
		//�����ڶ�����
		lock.unlock();
		System.out.printf("%sִ�н�����2����\n",thName);
		
		
		
	}
	
	private void methodB(String thName) {
		System.out.printf("%s���Ի�ȡ����Դ....\n",thName);
		
		lock.lock();
		System.out.printf("%s���ɹ�����ȡ��\n",thName);
		lock.unlock();
		System.out.printf("%sִ�н���\n",thName);
	}


	public static void main(String[] args) throws Exception {
		ReentrantLockTest task=new ReentrantLockTest();
		Thread th1=new Thread(task,"�߳�A");
		Thread th2=new Thread(task,"�߳�B");
		
		th1.start();
		//��֤�߳�A����ִ��
		Thread.sleep(50);
		th2.start();
	}
}
/**
 * �̳й�ϵ�� 
 * 	*Lock-->ReentrantLock
 * 
 * Lock�ӿڷ�����
 * 	1.[void] lock()  //��ȡ����
 * 	2.[Condition] newCondition()  //���ذ󶨵��� Lock ʵ������ Condition ʵ����
 * 	3.[boolean] tryLock()  //���ڵ���ʱ��Ϊ����״̬�Ż�ȡ������
 * 	4.[boolean] tryLock(long time, TimeUnit unit)  //������ڸ����ĵȴ�ʱ���ڿ��У����ҵ�ǰ�߳�δ���жϣ����ȡ����
 * 	5.[void] unlock()  //�ͷ�����
 * 
 * 
 * 
 */
