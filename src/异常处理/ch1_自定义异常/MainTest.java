package �쳣����.ch1_�Զ����쳣;

public class MainTest {

	public static void main(String[] args) {

		try {
			//�׳��Զ�����쳣
			throw new DefinedException("�Զ�����쳣��Ϣ");
		} catch (DefinedException e) {
			e.printStackTrace();
		}

	}

}
