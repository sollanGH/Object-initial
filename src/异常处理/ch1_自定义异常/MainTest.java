package 异常处理.ch1_自定义异常;

public class MainTest {

	public static void main(String[] args) {

		try {
			//抛出自定义的异常
			throw new DefinedException("自定义的异常信息");
		} catch (DefinedException e) {
			e.printStackTrace();
		}

	}

}
