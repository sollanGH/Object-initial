package java����˼��.�̳�;

public class Super02 extends Ostrich02 {// ��super���÷���

	public void fly() {
		System.out.println("Super03��д���fly����");// ��д�˸�(��)���fly����
	}
	public Super02() {
		super();
	}
	public void CallFly() { // super�����ã����ø��౻���ǵ�ʵ������ (������);
		super.fly(); // ���ø���Ĺ��캯��(����)����ʱsuper();��д�����๹�캯���ĵ�һ��
	}

	public static void main(String[] args) {
		Super02 sollan = new Super02();
		sollan.CallFly();
		sollan.fly();
	}

}
