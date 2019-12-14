package ���߳�.h1_��������������;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��������������
 * 
 *
 */
public class Practice1 implements Runnable {

	Lock lock = new ReentrantLock();
	// �ֿ���������
	private int capacity;
	// ��ǰ����ĸ���
	private static int count = 0;
	// �Ƿ�Ҫ������
	private boolean isProduce = true;

	// �����������������ߡ��롾�����ߡ�
	Condition produce = lock.newCondition();
	Condition sell = lock.newCondition();

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if (thName.equals("���ϰ�")) {
			while (true) {
				try {
					produceTask(thName);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} else {
			while (true) {
				try {
					sellTask(thName);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// ���������ķ���
	public void produceTask(String thName) throws Exception {
		lock.lock();
		if (isProduce) {
			Thread.sleep(100);
			count++;
			System.out.printf("[%s]�����У������%d \n", thName, count);
			if (count == capacity) {
				// ����������ˣ����������״̬
				this.isProduce = false;

				System.out.println("\n{���������ϣ����Խд����������}\n");
				// ���������߳�
				sell.signalAll();
			}
		} else {
			// ��ͣ�����߳�
			produce.await();

		}
		lock.unlock();
	}

	// �������ѵķ���
	public void sellTask(String thName) throws Exception {
		lock.lock();
		if (!isProduce) {
			Thread.sleep(100);
			count--;
			System.out.println(thName + "������һ�������ʣ�������" + count + "��");
			if (count == 0) {
				isProduce = true;
				System.out.println("\n{������������ˣ������ϰ��������}\n");
				produce.signalAll();
			}
		} else {
			System.out.printf("������%s���ڵȴ�\n", thName);
			// ��������״̬������ͣ���߳�
			sell.await();
		}

		lock.unlock();
	}

	// �涨����������ֵ
	public Practice1(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		Practice1 p = new Practice1(10);
		Thread th1 = new Thread(p, "���ϰ�");
		Thread th2 = new Thread(p, "��SOLLAN��");
		Thread th3 = new Thread(p, "����������");
		Thread th4 = new Thread(p, "�������꡿");

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}
