package ���߳�.ch5_1��Ʊ����;

public class TestMain {
	public static void main(String[] args) {
		//taskΪͬ�������ġ��������Ӷ���
		TicketTask task = new TicketTask();
		Thread win1 = new Thread(task, "win1");	//��ƱԱ1
		Thread win2 = new Thread(task, "win2");	//��ƱԱ2
		Thread win3 = new Thread(task, "win3");	//��ƱԱ3
		Thread win4 = new Thread(task, "win4");	//��ƱԱ4

		// ����ͬ������4���߳�һ�����У��ᵼ�¡���ͬ��Դ����������
		win1.start();
		win2.start();
		win3.start();
		win4.start();
	}
}
