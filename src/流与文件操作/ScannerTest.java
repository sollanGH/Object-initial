package 流与文件操作;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//next()方法可以唤起控制台输入,实质是读取
		System.out.println("请输入账户名：");
		String Name=input.next();		
		
		System.out.println("请输入密码：");
		String password=input.next();
		
		System.out.println("输入的用户名为："+Name);
		System.out.println("输入的密码为："+password);
	}
/*
 * next() 每次取到一个间隔符前面的数据    如： 输入 a b c 取值应该是a，因为a后面有空格;只读取一个字符串
 * nextLine() 每次取一个换行符前面的数据 如：输入 a b c 回车，取值 就是a b c;读取一行数据
 * nextInt() 是取next() 然后把字符串解析成一个int数字,同理nextDouble()、nextShort()。
 */
}
