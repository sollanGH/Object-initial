package �쳣����;

public class TextException2 {

	public static void main(String[] args) {

		try {// �������еĴ�����Ƿ����쳣
			int d = 0;
			int a = 42 / d;

		} catch (ArithmeticException e) { // ����Ϊ0�쳣������ִ�еķ���

			System.out.println("division by zero");
		}
	}

}
