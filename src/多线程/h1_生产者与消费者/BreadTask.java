package ���߳�.h1_��������������;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BreadTask implements Runnable {

	
	private static final int PRODUCE = 1;
	private static final int SELL = 2;
	
	private ReentrantLock lock = new ReentrantLock(); //{ps} ͬ����
	private int LIMIT;          //{ps} ����ֵ
	private int count;          //{ps} ���������
	
	//{ps} ��������������
	private Condition produceCondition = lock.newCondition();  //����������ʦ��
	private Condition sellCondition = lock.newCondition();     //�������������� "��"
	
	//{ps} ����״̬����
	private int status = PRODUCE; //{Ĭ��Ϊ: ����}
	
	public BreadTask( int limit ){
		this.LIMIT = limit;   //{ps} �趨�ֿ������
	}
	
	@Override
	public void run() {
		//{1} �õ��߳���: ����, A, B...
		String thName = Thread.currentThread().getName();
		//{2} �ж�һ��: ��Ϊ�����߳�: ���� / ����
		if( thName.equals("����") ){
			while( true ){
				produceTask( thName );
			} 
		}else{
			while( true ){
				sellTask( thName );
				delay(20);
			} 
		}
	}
	
	//{ps} ���ķ��� -------------------------------------------
	private void produceTask(String thName){
		lock.lock();
		if( status==PRODUCE ){    //{ps} �̵����� ---> �Ҿ�ȥ����
			if( count==LIMIT ){   //{ps} �������..
				//{ps} �л� "ָʾ��" ״̬
				status = SELL;
				//{ps} �������е� "������"
				sellCondition.signalAll();
			}else{      //{ps} ���δ��..
				//{ps} ��������
				count ++;
				printf( "{%s} ������ %d �������\n", thName, count );
				
			}
		}else{
			//{ps} �̵Ʋ���  ---> �Ҿ�ȥ��Ϣ
			try {
				printf("{%s} �������, ȥ��Ϣ�ˡ���\n", thName);
				produceCondition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
	}
	
	private void sellTask(String thName){
		lock.lock();
		if( status==SELL ){        //{ps} ��ɫָʾ���� ---> �Ҿ�ȥ����
			if( count > 0 ){       //{ps} ����������
				//delay(500);
				count --;   //{ps} ��������
				printf( "{%s} ������ 1 �����, ���������: %d��\n", thName, count );
			}else{      //{ps} ��� == 0
				//{ps} �л� "ָʾ��" ״̬  --> �̵�
				status = PRODUCE;
				//{ps} ���� "������" (����)
				produceCondition.signal();
			}
		}else{
			//{ps} ��ɫָʾ�Ʋ���  ---> �����߾�ȥ��Ϣ
			try {
				printf("{%s} �򲻵����, �ȵȴ�����\n", thName);
				sellCondition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
	}
	
	//{ps} ������ʱ ------------------------------------------
	private void delay(int ms){
		try { Thread.sleep( ms ); }
		catch (InterruptedException e) { }
	}
	private void printf(String format,Object...args){
		System.out.printf(format,args);
	}
}
