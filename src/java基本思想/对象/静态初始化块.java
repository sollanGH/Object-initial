package java����˼��.����;

public class ��̬��ʼ���� {
	//�����Ⱥ�˳��:��̬��ʼ����>��ʼ����>���췽��
	//�����о�̬��ʼ����֮ǰ�������ϵ���ִ�����С����ࡿ�ľ�̬��ʼ���顣
	static {
		System.out.println("��̬��ʼ����");
	}
	{
		System.out.println("��ͨ��ʼ����");
	}

	public ��̬��ʼ����() {
		System.out.println("�޲������췽��");
	}
}

class Mid extends ��̬��ʼ���� {
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}

	public Mid() {
		System.out.println("Mid���޲ι��췽��");
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}

	public Leaf() {
		System.out.println("Leaf���޲������캯��");
	}

	public static void main(String[] args) {
		new Leaf();
	}
}