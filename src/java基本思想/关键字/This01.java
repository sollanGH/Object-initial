package java����˼��.�ؼ���;

public class This01 {// �������以�����á�
	public String name;// û�г�ʼ����ֵΪnull
	public int oil;// û�г�ʼ����ֵΪ0
	public int speed;

	// ���֡���Ա�������ͷ����еġ��ֲ�������
	public This01(String name, int oil, int speed) {
		this.name = name;
		this.oil = oil;
		this.speed = speed;
		System.out.println("��ʼ��:" + "\n" + "�������֣�" + name + "\n" + "����������" + oil + "\n" + "�����ٶȣ�" + speed+"\n");
	}

	// ������ñ��෽����������run����
	public void highrun(int speed) {
		int highspeed = 2 * speed;
		this.run(highspeed);
		System.out.println("�ֲ�����speed" + speed);// �ֲ���speed=120
		System.out.println("��Ա����speed" + this.speed);// ��Ա��speed=240
		System.out.println("���ٶ�Ϊ��" + this.speed);
	}

	// �����á����������췽����
	public This01() {// �˴���this���޲������췽���е��ñ����к����������Ĺ��췽��
		this("����", 300, 120);// �����������췽�������ڹ��췽���ĵ�һ��
		this.run(100);// Ҳ�����ڹ��췽������this������������
	}

	public void run(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
		This01 sollan = new This01("SOLLAN", 200, 100);
		sollan.highrun(120);

	}

}
