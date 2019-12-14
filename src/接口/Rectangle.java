package 接口;

public class Rectangle implements Figure {
	double width, heigh;

	public Rectangle(double width, double heigh) {
		this.width = width;
		this.heigh = heigh;
	}

	@Override
	public void area() {
		System.out.println("矩形的面积为：" + width * heigh);

	}

}
