package �쳣����;

import java.util.Random;

public class TextException3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Random r = new Random();
		for (int i = 1; i < 5; i++) {
			try {
				b = r.nextInt(); // Random���еķ���������Ϊ����õ�һ������
				c = r.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				a = 0;
				System.out.println("�г���Ϊ0�쳣");
			}
			System.out.println("a:" + a);
		}

	}

}
