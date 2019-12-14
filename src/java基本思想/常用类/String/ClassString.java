package java基本思想.常用类.String;

import java.util.UUID;

public class ClassString {

	public static void main(String[] args) {
		byte[] b = { 67, 68, 69, 70, 71, 72 };//字节数组
		System.out.println(new String(b));
		char[] c = { 'a', 'b', 'c', 'd' };//字符数组
		System.out.println(new String(c));
		System.out.println(new String("Hello world!"));
		System.out.println(new StringBuffer("abc"));
		
		System.out.println("============大==小==写==转==换==================");
		
		String str1="SOLLANhello";
		String str2="SOLLANHELLO";
		System.out.println(str1.toLowerCase());//转换为小写
		System.out.println(str1.toUpperCase());//转换为大写
		System.out.println(str1.equalsIgnoreCase(str2));//比较两个字符串，不区分大小写
		
		System.out.println("===========定==位==下==标==值============================");
		
		String s1="abcdefghijklman";
		int x1=s1.indexOf("f");//输出第一个f的下标值
		System.out.println(x1);
		int x2=s1.lastIndexOf("a");//输出最后一个a的下标值
		System.out.println(x2);
		
		String s2="  xxxxx  ";
		String x3=s2.trim();//去除前后空格
		System.out.println(x3);
		
		System.out.println("============生==成==唯==一==字==符==串==================");
		
		//图片命名
		String picName="4565asdfwxda-dsae.jpg";
		//获取后缀名
		String extendName=picName.substring(picName.lastIndexOf("."));
		System.out.println(extendName);
		
		//产生一个唯一字符串
		String onlyName=UUID.randomUUID().toString();
		System.out.println(onlyName);
		//拼接在一起
		String onlyID=onlyName+extendName;
		System.out.println(onlyID);
		
	}

}

/*
 * String是一个JAVA自带的类
 * 
 * 构造方法：
 * public String();
 * public String(byte[] bytes);
 * public String(char[] value);
 * public String(String original);
 * public String(StringBuffer StringBuffer);
 * 
 * 字节：编码数字
 * 字符：编码数字所对应的值
*/





