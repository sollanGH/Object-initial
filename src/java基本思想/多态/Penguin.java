package java����˼��.��̬;

public class Penguin extends Animal {
	public Penguin(double wei) {
		super(wei);
	}

	public Penguin() {
	}

	@Override
	public void eat() {
		System.out.println("����ڳ��㡭��");
	}

	public void shout() {
		System.out.println("������۽С���");
	}

	public void youYong() {
		System.out.println("�������Ӿ����");
	}

	public double sell(double wei) {
		double money = 0;
		money = wei * 500;
		return money;
	}
}
