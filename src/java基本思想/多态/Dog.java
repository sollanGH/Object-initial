package java����˼��.��̬;

public class Dog extends Animal {
	public Dog(double wei) {
		super(wei);
	}
	public Dog() {
		
	}

	@Override
	public void eat() {
		System.out.println("���ڳԹ�ͷ����");
	}
	
	public void shout() {
		System.out.println("С�������С���");
	}
	
	public void ShouMen() {
		System.out.println("���ڿ��š���");
	}
	
	public double sell(double wei) {
		double money=0;
		money=wei*45;
		return money;
	}

}
