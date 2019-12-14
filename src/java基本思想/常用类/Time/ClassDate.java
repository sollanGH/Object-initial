package java基本思想.常用类.Time;

import java.util.Calendar;
import java.util.Date;

public class ClassDate {

	public static void main(String[] args) {
		Date d1 = new Date(20000);// 记录的是自基准时间1970.1.1 00:00:00 GTM 经过20000毫秒之后的时间
		long time = d1.getTime();// 获取自基准时间到现在时间所经历的毫秒数
		System.out.println("自1970经过20000毫秒的时间： " + d1);
		System.out.println("自基准时间后经过的毫秒数： " + time);

		System.out.println();

		// 获取当前系统时间值
		Date d2 = new Date();
		System.out.println("基准时间到现在经过的毫秒数： " + d2.getTime());// 获取从基准时间到现在所经历的的毫秒数
		System.out.println("现在时间： " + d2);// 打印当前系统时间值

		System.out.println(d2.compareTo(d1));// d2与d1作比较，若两者相等，返回0；若d2在前则返回负数-1；d2在后则返回正数1
		System.out.println(d1.equals(new Date(20000)));// 比较两个时间是否相等，相等返回true，不等返回false
		
		//Calendar类也是一个时间类,由于是抽象类，所以不能直new出对象
		Calendar c=Calendar.getInstance();//获取[抽象类]的一个对象
		int y=c.get(Calendar.YEAR) ;
		int m=c.get(Calendar.MONTH)+1;
		int r=c.get(Calendar.DAY_OF_MONTH);
		int w=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("今年是"+y+"年");
		System.out.println("这是今年的第"+m+"个月");
		System.out.println("今天是这个月的第"+r+"天");
		System.out.println("星期"+w);
	}

}
