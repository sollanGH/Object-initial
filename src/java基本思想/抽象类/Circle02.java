package java����˼��.������;

public class Circle02 extends Shape01 {// ���̳��˳�����ͱ���ʵ�ֳ����������еĳ��󷽷���

	public float r;
	private final float PI = 3.14f;// ����һ�����ɸ��ĵ�(final����)��Ա����

	public Circle02(String name, float r) {
		super(name);// ����Ĺ��췽������nameֵ
		this.r = r;// ��Ա����r��ֵ��Ϊ�;ֲ�����r��ֵ���
	}

	public double calcArea() {// ��д�˸���ĳ��󷽷�
		return PI * r * r; 
	}
}
