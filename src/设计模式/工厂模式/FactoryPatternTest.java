package ���ģʽ.����ģʽ;

public class FactoryPatternTest {

	public static void main(String[] args) {
		//ֱ�Ӵӹ������ᳵ�����������Ĺ������������������ٴ���(new)����
		Car car=CarFactory.getCar();
		car.run();
	}

}
