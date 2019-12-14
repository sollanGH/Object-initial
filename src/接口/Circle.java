package 接口;

public class Circle implements Figure {// 继承Figure接口
	double redius; 

	public Circle(double r) {
		redius = r;
	}

	@Override
	public void area() {//实现接口里的方法
		System.out.println("圆的面积为：" + PI * redius * redius);

	}

}
