package ���߳�.h3_�̳߳�;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳ص��ŵ㣺
 * 1.�������߳̿������ã�����Ƶ������/�����̡߳�
 * 2.������̵߳Ĺ�������߳�������
 * 3.����JVM����Ч��(�����µ��߳�Ҫ����һ��������Դ)
 * 
 * �̳߳��ڲ��ܿ��������߳���������������Щ�̶߳����ܸ��õġ�
 *
 */
public class ThreadPoolExecutorTest {

	public static void main(String[] args) {
		// ������������
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
		// �̳߳ز�����[���ĳش�С]��[���ش�С]��[���ʱ��]��[ʱ�䵥λ]��[�������]
		ExecutorService pool = new ThreadPoolExecutor(2, 4, 5, TimeUnit.SECONDS, queue);

		// �ύһ�������̳߳�
		pool.submit(new FindDog());
		pool.submit(new SendLunch());
		pool.submit(new TakeGoods());

	}

}
/**
 * 1.Future<?> submit(Runnable task)  //�ύһ�� Runnable ��������ִ�У�������һ����ʾ������� Future��
 * 
 * 
 *
 */

class FindDog implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "ȥ��һ����ëȮ...");
//		delay(2);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class SendLunch implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "��һ�����....");
//		delay(10);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class TakeGoods implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + "ȥ��һ������.....");
//		delay(50);

	}

	private void delay(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}



/**
 * �̳й�ϵ��
 * 	*Executor-->*ExecutorService-->ThreadPoolExecutor
 * 
 * 
 * 
 * 
 */



































