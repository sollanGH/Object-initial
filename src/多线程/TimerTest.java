package ���߳�;

import java.util.Timer;
import java.util.TimerTask;

//���̷߳���3���̳�TimerTask
public class TimerTest extends TimerTask {

	public static void main(String[] args) {
		// ����Timer����
		Timer ti = new Timer();
		// ��������Ķ���
		TimerTest tt = new TimerTest();
		// �����߳�,schedule����̳�TimerTask�������,0���������ӳ���Ӧ0����
		ti.schedule(tt, 0);
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("ti.schedule(tt,0):" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* ......................................................................... */

		// Timer t2=new Timer();
		TimerTest tt1 = new TimerTest();// �����������һ������
		// ��ti������һ���߳�(ͬһ��Timer�������TimerTask������)
		ti.schedule(tt1, 0);
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("ti.schedule(tt1,0):" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* ......��...........��..........��..........֮............��.................... */

	@Override // �̳�timertask��֮�����ʵ�ֵķ�����Ҳ��һ���߳�
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("Run:" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*
 * schedule (�ճ̰���) һ��Timer��������������TimerTaskʵ���̣߳����Ƕ���߳�֮����������
 * �����Ҫ�߳�֮��Ķ������У���û���һ��Timer����һ��TimerTaskʵ���߳�
 * һ������������һ��TimerTask
 * 
 * 
 */
