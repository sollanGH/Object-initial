package ���߳�.�߳�ͬ��;

/**
 * ͬ������_ʵ��Runnable
 * 1.�ڷ��������synchronized�ؼ��֣��Ҵ˷�������Run()����������
 * 2.ֻ��ͬ�� ��ͬThread������߳�
 * 3.����ͬ�� ������������߳�
 * 4.ֻ��ͬ����ͬһ��������󡿵ġ���ͬThread���󡿵��߳�
 * 
 * @author SOLLAN
 *
 */
public class Method implements Runnable {
	private static int count = 100;
	private static int i = 1;

	public void run() {
		tack();
	}

	public synchronized void tack() {
		if (i < count) {
			System.out.println(Thread.currentThread().getName() + "��" + i + "��Ʊ");
			i++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		//ֻ����ͬһ��tt����
		Method tt=new Method ();
		for (int i = 1; i <= 10; i++) {
			Thread th=new Thread(tt,"�߳�"+i+"\t");
			th.start();
		}
	}
}
