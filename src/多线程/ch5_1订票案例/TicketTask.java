package ���߳�.ch5_1��Ʊ����;

/**
 *����˵����
 *	��4��������Ʊ����100��Ʊ
 *	��¼ÿ�����ڵ���Ʊ����ʣ��Ʊ��
 */
public class TicketTask implements Runnable {

	private int tickets = 100; // �����ܹ�100��Ʊ
	private int[] wins = new int[5]; // ����4����(����1-4)

	@Override
	public void run() {
//		noSynchronized();
//		havaSynchronized();
		
		while(tickets>0) {
		Goto();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

		synchronized ("Object") {
			/*��Ʊ���为����ԭ��
			 * �����˶���̡߳�ͬʱ���ʡ���Դ���µĴ��� ����һ���߳̿�ʼʱ���ж�����Ϊi=1;ִ������i--������
			 * ��4���߳�ͬʱ��ʼ���ж�ʱi������1,���Ƕ�������--��������� i��ֱ�ӱ�-3�ˡ�
			 */
		}
	}
	
	/**
	 * û��ͬ�������ķ���
	 * �ᵼ����ƱΪ��������
	 */
	public void noSynchronized() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
		while (tickets > 0) {
			try {
				Thread.sleep(2);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wins[index]++;
			tickets--;
			System.out.printf("[%s]���۳���%d��Ʊ��ʣ�ࣺ%d��Ʊ\n", thName, wins[index], tickets);

		}
	}
	
	/**
	 * ��ʽ��
	 * synchronized(Object o){}
	 * 
	 */
	public void havaSynchronized() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
		while (tickets > 0) {
			try {
				Thread.sleep(2);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/**
			 * ͬ������� 
			 * 1.������ڵ���Դͬʱ����һ���߳�ʹ�� (ͬ���Ӷ���)
			 * 2.ObjectΪ�����Ӷ���
			 * 3.ͬһ�����Ӷ����µ���Դһ�ν��ܱ�һ���̷߳��ʡ�
			 * 4.һ���ܹ���ʾ��ַ�Ķ�������������Ϊ���Ӷ���
			 */
			synchronized ("Object") {
				if(tickets > 0) {
			wins[index]++;
			tickets--;
			System.out.printf("[%s]���۳���%d��Ʊ��ʣ�ࣺ%d��Ʊ\n", thName, wins[index], tickets);
				}
			}
		}
	}
	
	

	/**
	 * ��ͬ�������� 
	 * 1.ʹ�á�������ö�����Ϊ���Ӷ��� (��)
	 * 2.���˷���ִ������ͷ���
	 * 3.���Ӷ���this
	 * 	TicketTask task = new TicketTask();
	 * 	Thread th=new Thread(task);	taskΪ���Ӷ���(��)
	 * 4.��δ�ͷ�ʱֻ����һ���̷߳����ٽ���(�����ڴ���)��Դ
	 */
	public synchronized void Goto() {
		String thName = Thread.currentThread().getName();
		int index = Integer.valueOf(thName.substring(3, 4));
			wins[index]++;
			tickets--;
			System.out.printf("[%s]���۳���%d��Ʊ��ʣ�ࣺ%d��Ʊ\n", thName, wins[index], tickets);
			
	}

}
