package 多线程.ch5_2银行取钱案例;

public class Qizi implements Runnable {

	private static double Money = 715.52;
	private static double surplus;

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		if(thName.equals("张三")) {
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
			System.out.printf("%s尝试取钱，但余额不足\n",name);
		} else {
			Money = Money - money;
			System.out.printf("%s消费%f元，账户余额：%f \n",name,money,Money);
		}
		return Money;
	}

	public static void main(String[] args) {
		Qizi q = new Qizi();
		Thread th1 = new Thread(q, "张三");
		Thread th2 = new Thread(q, "妻子");
		th1.start();
		th2.start();

	}
}
