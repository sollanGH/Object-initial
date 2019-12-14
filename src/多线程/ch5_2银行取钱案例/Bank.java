package 多线程.ch5_2银行取钱案例;

public class Bank {
	private static double Money = 3500;

	public static void main(String[] args) {

	}

	// 设置银行账户里的金额
	public void setMoney(int money) {
		Money = money;
	}

	// 取多少钱？返回账户余额
	public static synchronized double getMoney(String name,double money) {

		if (Money - money < 0) {
			System.out.printf("%s尝试取钱，但余额不足\n",name);
		} else {
			Money = Money - money;
			System.out.printf("%s消费%f元，账户余额：%f \n",name,money,Money);
		}
		return Money;
	}

	// 查询余额
	public static double getBalance() {
		return Money;
	}
}
