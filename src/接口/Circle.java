package �ӿ�;

public class Circle implements Figure {// �̳�Figure�ӿ�
	double redius; 

	public Circle(double r) {
		redius = r;
	}

	@Override
	public void area() {//ʵ�ֽӿ���ķ���
		System.out.println("Բ�����Ϊ��" + PI * redius * redius);

	}

}
