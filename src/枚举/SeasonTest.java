package 枚举;

public class SeasonTest {

	public static void main(String[] args) {
		SeasonTest et=new SeasonTest();
		/**
		 * 1.创建一个Season枚举对象来接收后面的值
		 * 2.values()方法可以返回枚举类所有实例
		 * 3.枚举类的实例类型为：枚举类型,只能用枚举类对象来接收
		 */
		int i=1;
		for (Season s : Season.values()) {
			System.out.println(s+" "+i);
			et.judge(s);
			i++;
		}
		//可以.variable来调用枚举实例
		System.out.println("\n"+Season.SPRING);

	}
	
	//参数为枚举类的一个对象
	public void judge(Season b) {
		switch(b) {
		case SPRING:
			System.out.println("春");
			break;
		case SUMMNER:
			System.out.println("夏");
			break;
		case FALL:
			System.out.println("秋");
			break;
		case WINTER:
			System.out.println("冬");
			break;
		default:
			break;
		}
	}
}
