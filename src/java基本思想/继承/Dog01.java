package java����˼��.�̳�;

public class Dog01 extends Animal01 { // ����ļ̳еĻ������á��̳к���԰Ѹ����еķ��������������Լ���(public����)

	public void say() {
		System.out.println("���У�������");
	}

	public static void main(String[] args) {
		Dog01 d = new Dog01();
		d.weight = 150;// Dog�౾��û��weight���ԣ�����Ϊ�����У�������ʹ��
		d.eat();// ʹ�ø����eat����
		d.say();// ʹ���Լ���say����
		System.out.println("���ĳ���Ϊ:" + d.weight);
	}
	/*
	 * ע�⣺������ø���ĳ�Ա����
	 * 1.���������Ҫpublic����
	 * 2.������super.name����
	 * 3.super���ܳ�����static���εķ����С�
	 * 4. ���ྲ̬����(main)��ֻ��������������
	 * 
	 * 
	 * 
	*/
}
