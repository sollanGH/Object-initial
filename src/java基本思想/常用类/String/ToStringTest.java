package java基本思想.常用类.String;

public class ToStringTest {

	public static void main(String[] args) {
		ToString ts = new ToString("小樱", "女", "神户", 23);
		System.out.println(ts.getName() + "\t" + ts.getSex() + "\t" + ts.getAddress() + "\t" + ts.getAge());
		//显示类中所有的【成员变量】的值
		System.out.println(ts.toString());

	}

}
