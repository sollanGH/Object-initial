package 异常处理;

import java.util.Random;

public class TextException3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Random r = new Random();
		for (int i = 1; i < 5; i++) {
			try {
				b = r.nextInt(); // Random类中的方法，作用为随机得到一个整数
				c = r.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				a = 0;
				System.out.println("有除数为0异常");
			}
			System.out.println("a:" + a);
		}

	}

}
