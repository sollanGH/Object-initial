package ���߳�.h2_��������;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * �������� �ص㣺
 *  1.������Ϊ��ʱ������������ ��
 *  2.��������ʱ��Ҳ������������
 * 
 *
 */
public class BlockingQueueTest implements Runnable {
	// �����̶�[����]��ArrayBlockingQueue
	BlockingQueue<String> queue = new ArrayBlockingQueue<>(20);

	public void produceTask(String thName) {
		int ran = (int) (Math.random()) * 10;
		String id = String.valueOf(ran);
		try {
			//����Ԫ��
			queue.put(id);
			printf("[%s]������һ������������������%d\n", thName, queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sellTask(String thName) {
		try {
			Thread.sleep(100);
			//��ȡ���Ƴ���Ԫ��
			String id = queue.take();
			printf("[%s]������һ������������������%d\n", thName, queue.size());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		//�߳����Ļ�ȡһ��Ҫ�ڡ�run()�������ڣ���
		String thName = Thread.currentThread().getName();
		if (thName.equals("�߳�A")) {
			produceTask(thName);
		} else {
			sellTask(thName);
		}

	}

	private void printf(String string, Object... orgs) {
		System.out.printf(string, orgs);

	}

}

/**
 * ���÷����� 
 * 1.boolean add(E e) //��ָ��Ԫ�ز���˶����У�������������Ҳ���Υ���������ƣ����ɹ�ʱ����true�������ǰû�п��õĿռ䣬���׳� IllegalStateException�� 
 * 2.void put(E e) //��ָ��Ԫ�ز���˶����У����ȴ����õĿռ䣨����б�Ҫ���� 
 * 3.E take() //��ȡ���Ƴ��˶��е�ͷ������Ԫ�ر�ÿ���֮ǰһֱ�ȴ�������б�Ҫ����
 * 4.boolean remove(Object o)  // �Ӵ˶������Ƴ�ָ��Ԫ�صĵ���ʵ����������ڣ���
 * 
 * 
 */
