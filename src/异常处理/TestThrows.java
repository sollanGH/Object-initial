package �쳣����;

import java.util.Scanner;

public class TestThrows {
	public static void main(String[] args) throws MyAgeException{
		
		while(true) {
			
		Scanner input=new Scanner(System.in);
		try {
			System.out.print("��������ǣ�");
			int age=input.nextInt();
			//��������������򷵻�һ�����Զ����쳣���󡿸�try,Ȼ��try�ٽ�����쳣���󴫵ݸ�catch��,������Ӧ��Ӧ��
			if(age<0||age>150) {
				throw new MyAgeException("���䷶Χ0~150������淶���룡");
			}
			System.out.println("�������Ϊ"+age+",�Ǽǳɹ�");		
		} catch (Exception e) {
			//getMessage()�����ݾ����Զ�����Ƕ�����
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	}
}
