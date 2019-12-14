package 多线程.ch5_2银行取钱案例;

public class ZhangSan implements Runnable {

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if(thName.equals("【张三】")) {
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
		Thread th1 = new Thread(z, "【张三】");
		Thread th2 = new Thread(z, "【妻子】");
		th1.start();
		th2.start();

	}

}
