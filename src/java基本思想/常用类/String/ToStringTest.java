package java����˼��.������.String;

public class ToStringTest {

	public static void main(String[] args) {
		ToString ts = new ToString("Сӣ", "Ů", "��", 23);
		System.out.println(ts.getName() + "\t" + ts.getSex() + "\t" + ts.getAddress() + "\t" + ts.getAge());
		//��ʾ�������еġ���Ա��������ֵ
		System.out.println(ts.toString());

	}

}
