package Java����.ch5_����.������;

/**
 * ����X��һ����δȷ��������
 * �������ȫ��ͨ��
 * �������ö������
 * �ڡ����������ʱ�������Ĳ�������
 */
public class Bird<X> {
	
	X x;
	
	{
		X x;
	}
	
	//������������͡���ȷ����
	public void add(X x) {
		System.out.println("����������ǣ�\n"+x);
	}
	
	public static void main(String[] args) {
		//���͡���Ρ�
		Bird<Double> b=new Bird<Double>();
		b.add(25.6);
	}

}
