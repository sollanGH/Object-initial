package ���߳�.ch6_ͬ������;
/**
 * ��ͬ�������� 
 * 1.ʹ�á�������ö�����Ϊ���Ӷ��� (��)
 * 2.���˷���ִ������ͷ���
 * 3.���Ӷ���this
 * 	TicketTask task = new TicketTask();
 * 	Thread th=new Thread(task);	taskΪ���Ӷ���(��)
 * 4.��δ�ͷ�ʱֻ����һ���̷߳����ٽ���(�����ڴ���)��Դ
 */
public class TestMain {
	public static void main(String[] args) {
		//task��Ϊ�������̹߳�ͬ�ļ��Ӷ���
		MyTask task=new MyTask();
		Thread th1=new Thread(task,"�߳�1");
		Thread th2=new Thread(task,"�߳�2");
		
		th1.start();
		th2.start();
	}
}
