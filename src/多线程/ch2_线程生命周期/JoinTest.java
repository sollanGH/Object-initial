package ���߳�.ch2_�߳���������;

/**
 *���̺߳ϲ�������
 * th.join(); �ȴ����߳���ֹ��
 * join(long millis) ;	�ȴ����߳���ֹ��ʱ���Ϊ millis ���롣
 * join(long millis, int nanos) �ȴ����߳���ֹ��ʱ���Ϊ millis ���� + nanos ���롣
 *
 */
public class JoinTest implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("ѧ�������Գţ���"+i+"��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinTest task=new JoinTest();
		Thread th=new Thread(task);
		System.out.println("��ʦ��ѧ�������Գ�--->");
		th.start();
		
		try {
			//Main�ȴ�th�߳���ֹ
			th.join();
			System.out.println("��ʦ����ѧ��������---");
			
			//Main���ȴ�5000����
			th.join(5000);
			System.out.println("��ʦ����5�룬�м�������----");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
