package ���߳�;

//�߳��ò�
public class YieldThread extends Thread {
	// �����߳�����
	public YieldThread(String name) {
		super(name);
	}

	public static void main(String[] args) {
		YieldThread sollan1 = new YieldThread("�߼�");
		YieldThread sollan2 = new YieldThread("�ͼ�");

		// ��1���ȼ�����
		sollan1.setPriority(MAX_PRIORITY);
		sollan1.start();

		// ��2���ȼ�����
		sollan2.setPriority(MIN_PRIORITY);
		sollan2.start();

	}
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(getName() + ": " + i);
			if (i == 20) {
				// [��ǰ�߳��ò�]�á�ͬ���ȼ����򡾸����ȼ������߳�����
				Thread.yield();
			}
		}
	}
	/* 	���ȼ��ߵĽ��̽���ø����ִ�л��ᡣ
	 * 	���ȼ���	MAX_PRIORITY ��ֵΪ10
	 * 			NORM_PRIORITY ��ֵΪ5
	 * 			MIN_PRIORITY ��ֵΪ1
	 * 			Main�̵߳����ȼ�Ϊ��
	 * 
	 * 
	 * 
	 */
}
