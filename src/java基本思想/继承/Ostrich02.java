package java����˼��.�̳�;

public class Ostrich02 extends Bird02 { // ����д���෽����
	
	public Ostrich02() {
		System.out.println("Ostrich02��Ĺ��췽��");
	}

	public void fly() { // ��д�˸���ķ���
		System.out.println("Ostrich02������д��flay����");
	}

	public int jiafa(int c, int d) {// ��д����ķ���Ӧ ��������ͬ �β��б���ͬ ����ֵ������ͬ��
		a = c;						//�����쳣�׳���Ӧ�ȸ���С����ȣ����෽������Ȩ��Ӧ�ȸ����
		b = d;
		z = a - b;
		return z;
	}

	public static void main(String[] args) {
		Ostrich02 sollan = new Ostrich02();
		sollan.fly();
		// sollan.Bird02(); ����ֱ�ӵ��ø���Ĺ��췽��
//		System.out.println("�޸ĺ���������Ϊ" + sollan.jiafa(6, 2));
	}

}
