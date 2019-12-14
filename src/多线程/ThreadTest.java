package ���߳�;
/**
 * ��ͳ����ֻ�ܡ����С�ִ�� 
 * ���������̡߳����ԡ����С����г���
 * 1.�̳�Thread��
 * 2.��дThread���run()����
 * 3.ʹ��Thread.start()�����߳�
 * 4.��Ҫ�̳У����²��ܹ��ټ̳������࣬��չ�Խϲ
 *
 */
public class ThreadTest extends Thread {

	// ��������һ���ض���ִ�е��߳�
	public static void main(String[] args) {
		// ��������
		ThreadTest sollan = new ThreadTest();
		// ����Start()���������Զ����߳�Run()
		sollan.start();
		// �������߳��е����ݽ����Զ����߳��е����ݲ���(��)ִ��--���˲�������˲���
		try {
			for (int i = 0; i < 10; i++) {
				// ��ʱ1000����=1��
				Thread.sleep(1000);
				System.out.println("Main�̣߳�" + i);
			}
		} catch (Exception w) {
			w.printStackTrace();
		}
	}

	// ����Thread���Զ����̷߳���Run()
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(500);
				System.out.println("Run�̣߳�" + i);
				System.out.println(getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*��ظ��
 * 1.һ��������԰���������̣�һ�������ܰ�������̣߳��߳���cpu���ȵ���С��λ��
 * 2.ÿ���߳�ӵ���������Դ�������š�
 * 3.ͬ���̵ĸ��߳��ܹ��������Դ����ѡ��������������ء�
 * 4.����--һ��ִ�У�����--�����л�ִ��
 * 
 *  ���췽����
 * Thread(String name) //�����߳���
 * Thread(Runnable target, String name) //����ʵ������߳���
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
