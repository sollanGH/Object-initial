package ���߳�.ch5_2����ȡǮ����;

public class Qizi implements Runnable {

	private static double Money = 715.52;
	private static double surplus;

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if(thName.equals("����")) {
			for(int i=1;i<10;i++) {
				double m1=getMoney(thName,300);
				if(m1<300) {
					break;
				}
			}
		}else {
			for(int i=1;i<10;i++) {
				double m2=getMoney(thName,100);
				if(m2<100) {
					break;
				}
			}
		}

	}

	public synchronized double getMoney(String name,double money) {

		if (Money - money < 0) {
			System.out.printf("%s����ȡǮ��������\n",name);
		} else {
			Money = Money - money;
			System.out.printf("%s����%fԪ���˻���%f \n",name,money,Money);
		}
		return Money;
	}

	public static void main(String[] args) {
		Qizi q = new Qizi();
		Thread th1 = new Thread(q, "����");
		Thread th2 = new Thread(q, "����");
		th1.start();
		th2.start();

	}
}
