package ���߳�.ch9_���ӿ�;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [Condition]�ӿ�
 * 
 * Condition newCondition(); 
 * 1.�˷�����Lock�ӿ��б����� 
 * 2.����Conditionʵ��
 *
 */
public class ConditionTest implements Runnable {

	Lock lock = new ReentrantLock();
	// ����������(ÿһ��������һ����?)
	Condition cond1 = lock.newCondition();
	Condition cond2 = lock.newCondition();

	public static void main(String[] args) {
		ConditionTest task = new ConditionTest();
		Thread th1 = new Thread(task, "A");
		Thread th2 = new Thread(task, "B");
		th1.start();
		th2.start();
	}

	@Override
	public void run() {

	}

	public void test1() {
		// ����
		lock.lock();
		try {
			System.out.println("test1׼���ȴ�....");
			// ʹ��ǰ�̡߳��ͷš�����Դ,���ڴ˴���ͣ
			cond1.await();
			System.out.println("test2�ͷ�������Դ��test1����ִ��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// �ͷ���
		lock.unlock();
	}

	public void test2() {
		// ����
		lock.lock();
		// ���ѡ��ȴ����е��߳�cond1��ʹ���������ͷź����ִ��
		cond1.signal();
		// �ͷ���
		lock.unlock();
	}

}
/**
 * �̳й�ϵ�� 
 * 	*Condition 
 * 	*Lock-->ReentrantLock
 * 
 * Condition�ӿڷ�����
 * 1.void await()  //��ɵ�ǰ�߳��ڽӵ��źŻ��ж�֮ǰһֱ���ڵȴ�״̬��
 * 2.boolean await(long time, TimeUnit unit) //��ɵ�ǰ�߳��ڽӵ��źš����жϻ򵽴�ָ���ȴ�ʱ��֮ǰһֱ���ڵȴ�״̬��
 * 3.void signal()  //����һ���ȴ��̡߳�
 * 4.void signalAll() //�������еȴ��̡߳�
 * 
 * await()
 * Ч����Object�е����ƣ���������lock����ʹ��
 * 
 */
