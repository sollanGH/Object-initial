package �ӿ�;

public class Rectangle implements Figure {
	double width, heigh;

	public Rectangle(double width, double heigh) {
		this.width = width;
		this.heigh = heigh;
	}

	@Override
	public void area() {
		System.out.println("���ε����Ϊ��" + width * heigh);

	}

}
