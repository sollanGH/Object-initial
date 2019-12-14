package 设计模式.工厂模式;

public class FactoryPatternTest {

	public static void main(String[] args) {
		//直接从工厂中提车，将创建车的工作交给工厂，不比再创建(new)车。
		Car car=CarFactory.getCar();
		car.run();
	}

}
