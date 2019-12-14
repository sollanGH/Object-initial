package ���߳�.ch4_�߳��ò�;

/**
 * 1.�����̵߳ġ����ȼ���
 * 2.���ȼ�[��]�Ľ���[����]������CPU
 * 
 * 3.Thread.yield();
 * 	 �ó���ǰCPUִ��Ȩ���ص�����̬�����ܿ�ͻᱻCPU�ٴε��Ȼ������ٴ����С�
 * 	 ����[�̵߳����ȼ�]�бȽϴ�Ĺ�ϵ
 *
 */
public class YieldTest {
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread th1 = new Thread(task, "�����ȼ�");
		Thread th2 = new Thread(task, "�����ȼ�");
		//�����ȼ�
		th1.setPriority(Thread.MIN_PRIORITY);
		//�����ȼ�
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();

	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();

		for (int i = 0; i < 50; i++) {
			if (thName.equals("�����ȼ�")) {
				//  ��ͣ��ǰ����ִ�е��̶߳���(�������̬)����ִ�������߳�
				Thread.yield();
			}
			System.out.println(thName + i);
			
		}

	}

}