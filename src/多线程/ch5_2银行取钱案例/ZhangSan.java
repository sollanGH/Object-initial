package ���߳�.ch5_2����ȡǮ����;

public class ZhangSan implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if(thName.equals("��������")) {
			double count=100;
			for(int i=1;i<100;i++) {
				double m1=Bank.getMoney(thName,count);
				if(m1<count) {
					break;
				}
			}
		} else {
			double count=1200;
			for(int i=1;i<10;i++) {
				double m2=Bank.getMoney(thName,count);
				if(m2<count) {
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		ZhangSan z = new ZhangSan();
		Thread th1 = new Thread(z, "��������");
		Thread th2 = new Thread(z, "�����ӡ�");
		th1.start();
		th2.start();

	}

}
