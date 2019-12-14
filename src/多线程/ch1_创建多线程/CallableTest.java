package ���߳�.ch1_�������߳�;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {

	/**
	 * ��ǿ��������
	 * 1.��ʹ��run()������ʹ��call()���� 
	 * 2.��������ֵ��
	 * 3.��Ҫ���롾FutureTask����
	 * 4.������ֹ����ִ��
	 * 5.��ͨ������ֵ֪̽�߳�ִ��״̬
	 */
	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 100; i++) {
			System.out.println("i="+i);
			//˯��10ms
			Thread.sleep(10);
		}
		return 999;
	}

	public static void main(String[] args) {
		//�����������ࡿ����
		CallableTest ct = new CallableTest();
		// ����FutureTask�࣬�������������
		FutureTask<Integer> futask = new FutureTask<Integer>(ct);
		//����Thread����
		Thread th = new Thread(futask);
		th.start();
		try {
			//����ϡ���ǰ�߳�
			futask.cancel(true);
			// get()��������������������߳�ûִ����ͻ�һֱ���������ﲻ��������
			Integer in = futask.get();
			System.out.println("�߳�ִ����ϣ���÷���ֵ��" + in);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("{�߳���������������}");

	}
}
/**
 * task.get();	//��ȡ����ֵ
 * task.isDone();//�ж������Ƿ����
 * task.cancel();//��ֹ�����ִ��
 * 
 */
