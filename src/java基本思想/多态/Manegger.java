package java����˼��.��̬;

public class Manegger {
	
	private Animal animal;

	// ��ʹ�÷������β�ʵ�ֶ�̬������һ������Ķ��󣬲�ʵ��������д�ķ���
	public void feeled(Animal animal) {
		animal.eat();
	}

	// ��ʹ�÷����ķ���ֵʵ�ֶ�̬��
	public Animal getAnimal(String type) {
		Animal animal = null;
		// �������"��",�ͷ���һ��Dog����
		if (type.equals("��")) {
			animal = new Dog();
			// �������"���",�ͷ���һ��Penguin����
		} else if (type.equals("���")) {
			animal = new Penguin();
		}

		return animal;
	}

	// ��ʹ�ó�Ա����ʵ�ֶ�̬��
	public void setAnimal(Animal animal) {
		this.animal = animal;
		this.getShout();
	}
	public void getShout() {
		this.animal.shout();
		this.animal.kong();
//		this.animal.ShouMen  //���Dog�����ܵ��ø�����û�еķ���
	}
	
	//��ʹ������ʵ�ֶ�̬��
	public double getSeller(Animal[] ai,double weight) {
		double money=0;
		for (int i = 0; i < ai.length; i++) {
			double a=ai[i].sell(weight);
			money+=a;
		}
		return money;
	}

	/*
	 * 1.����ת��
	 * 2.��������Dog�Ѿ�ת��animal��
	 * 3.��ת��animal���͵�Dog�����൱��animal���󣬵��ڵ��ñ�������д�ķ���ʱ�������д��ķ������������Լ�ԭ���ķ���
	 */
	public void play(Animal animal) {
		// ���animal����Dog����
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.ShouMen();
			System.out.println("����Ա�͹�һ�������ˣ����");
			
		} else if (animal instanceof Penguin) {
			Penguin penguin = (Penguin) animal;
			penguin.youYong();
			System.out.println("����Ա�ڸ������Ӿ����");
		}
	}

	/*
	 * ��̬�������� 
	 * 1.�̳� 
	 * 2.���������ָ��������� 
	 * 3.��������ÿ�������װ��������Ķ���
	 */
}
