package java����˼��.�̳�;

public class Sub04 extends Base04 { // ����ε��ø���Ĺ��췽����
	public String color;

	public Sub04(double size, String name, String color) {
		super(size, name);
		this.color = color;

	}

	public static void main(String[] args) {

		Sub04 sollan = new Sub04(5.0, "ͬ��Bug", "blue");// ���ڹ��캯�����в�������������ҲҪ������

		System.out.println("�汾" + sollan.size + "\n" + 
		"����" + sollan.name + "\n" + "��ɫ:" + sollan.color);//name��size�Ǹ����еı���
	}

}
