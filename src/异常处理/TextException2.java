package 异常处理;

public class TextException2 {

	public static void main(String[] args) {

		try {// 检验其中的代码块是否有异常
			int d = 0;
			int a = 42 / d;

		} catch (ArithmeticException e) { // 除数为0异常产生后执行的方法

			System.out.println("division by zero");
		}
	}

}
