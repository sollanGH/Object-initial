package java基本思想.常用类.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

//简单的时间格式
public class SimpleDateFormatTest {

	public static void main(String[] args) {
		//获取当前时间
		Date day=new Date();
		System.out.println(day);
		
		//创建自己的时间格式
		SimpleDateFormat gs1=new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss E");
		//将时间传入自己创建的格式中
		String time=gs1.format(day);
		System.out.println(time);
		
		SimpleDateFormat gs2=new SimpleDateFormat("yyy/MM/dd h:m:s a SS毫秒 星期u");
		time =gs2.format(day);
		System.out.println(time);
		
		/*SimpleDateFormat gs3=new SimpleDateFormat("yyy-MM-dd h:m a 星期u");
		time =gs3.format(day);
		System.out.println(time);*/
		
		
	}

	/**
	 * 	字母   日期或时间元素  表示  示例  
		G  Era 标志符  Text  AD  
		y  年  Year  1996; 96  
		M  年中的月份  Month  July; Jul; 07  
		w  年中的周数  Number  27  
		W  月份中的周数  Number  2  
		D  年中的天数  Number  189  
		d  月份中的天数  Number  10  
		F  月份中的星期  Number  2  
		E  星期中的天数  Text  Tuesday; Tue  
		a  Am/pm 标记  Text  PM  
		H  一天中的小时数（0-23）  Number  0  
		k  一天中的小时数（1-24）  Number  24  
		K  am/pm 中的小时数（0-11）  Number  0  
		h  am/pm 中的小时数（1-12）  Number  12  
		m  小时中的分钟数  Number  30  
		s  分钟中的秒数  Number  55  
		S  毫秒数  Number  978  
		z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00  
		Z  时区  RFC 822 time zone  -0800  

	 */
}
