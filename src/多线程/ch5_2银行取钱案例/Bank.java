package ���߳�.ch5_2����ȡǮ����;

public class Bank {
	private static double Money = 3500;

	public static void main(String[] args) {

	}

	// ���������˻���Ľ��
	public void setMoney(int money) {
		Money = money;
	}

	// ȡ����Ǯ�������˻����
	public static synchronized double getMoney(String name,double money) {

		if (Money - money < 0) {
			System.out.printf("%s����ȡǮ��������\n",name);
		} else {
			Money = Money - money;
			System.out.printf("%s����%fԪ���˻���%f \n",name,money,Money);
		}
		return Money;
	}

	// ��ѯ���
	public static double getBalance() {
		return Money;
	}
}
