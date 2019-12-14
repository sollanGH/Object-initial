package 异常处理;

import java.util.Scanner;

public class TestThrows {
	public static void main(String[] args) throws MyAgeException{
		
		while(true) {
			
		Scanner input=new Scanner(System.in);
		try {
			System.out.print("你的年龄是：");
			int age=input.nextInt();
			//如果满足条件，则返回一个【自定义异常对象】给try,然后try再将这个异常对象传递给catch块,做出对应的应对
			if(age<0||age>150) {
				throw new MyAgeException("年龄范围0~150！！请规范输入！");
			}
			System.out.println("你的年龄为"+age+",登记成功");		
		} catch (Exception e) {
			//getMessage()的内容就是自定义的那段内容
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	}
}
