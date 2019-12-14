package ���߳�.ch1_�������߳�;

/**
 * ��ͳ����ֻ�ܡ����С�ִ�� 
 * ���������̡߳����ԡ����С����г���
 * 1.�̳�Thread��
 * 2.��дThread���run()����
 * 3.ʹ��Thread.start()�����߳�
 * 4.��Ҫ�̳У����²��ܹ��ټ̳������࣬��չ�Խϲ
 *
 */
public class ThreadTest extends Thread{
	
	@Override
	public void run() {
		String thName=Thread.currentThread().getName();
		for(char c='A';c<='z';c++) {
			System.out.printf("%s:%d\n",thName,(int)c);
		}
	}
	
	public static void main(String[] args) {
		Thread th1=new ThreadTest("�߳�1");
		Thread th2=new ThreadTest("�߳�2");
		//���������߳�
		th1.start();
		th2.start();
		
		for(int i=1;i<50;i++) {
			System.out.printf("%s:%d\n",Thread.currentThread().getName(),i);
		}
	}
	
	//ʹ�á��̳С�Thread��ʱ���������췽�������̡߳�������
	public ThreadTest(String thName) {
		super.setName(thName);
	}
		
	public ThreadTest() {
			
	}
}
/**
 * ���췽����
 * Thread(String name) //�����߳���
 * Thread(Runnable target, String name) //����ʵ������߳���
 * 
 * ���У�����߳�һ��ִ��
 * ����������߳̿���л�ִ��
 */
