package java����˼��.������;

public class Rectangle03 extends Shape01 {

	private float width;
	private float height;

	public Rectangle03(String name, float width, float height) {
		super(name);// ���ø����в����Ĺ��췽��
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Shape01 s1 = new Circle02("Բ��", 12.37f);// ǰ���shape01Ҳ���Ի���circle02����Ϊshape01�Ǹ��࣬��˴˴������ã����ø���Ķ����ܷ��������ʵ��
		Shape01 s2 = new Rectangle03("����", 12, 7);// ����rectangle��3�������Ĺ��췽��

		System.out.println("Բ�ε����Ϊ" + s1.calcArea());
		System.out.println("���ε����Ϊ" + s2.calcArea());

	}

}
