package java����˼��.�ڲ���;

public class OutClass {

	private int x = 10;

	public class InClass {// ����һ���ڲ���
		public InClass(){}
		int y = 20;

		public int go(int i) {
			int result = i * i;
			return result;
		}
	}

	public static void main(String[] args) {
		OutClass oc = new OutClass();
		OutClass.InClass ic = oc.new InClass();// Ϊ�ڲ��ഴ������

		System.out.println("OutClass:x=" + oc.x);// ����ⲿ���xֵ
		System.out.println("InnerClass:y=" + ic.y);// ����ڲ���y��ֵ

		System.out.println("===========================================================");

//		InClass inc = new InClass();
//		int re = inc.go(19);
//		System.out.println(re);

	}
	/*	1.���Ǿ�̬���ڲ����൱���ⲿ��ĳ�Ա����
	 *	2.����̬���ڲ����൱���ⲿ�౾��
	 *  3.�ڲ�����Է����ⲿ���˽�з���������
	 *  4.�ⲿ������ڲ�����Ҫ��������
	 * 
	*/
}
