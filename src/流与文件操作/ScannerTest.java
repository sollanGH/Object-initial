package �����ļ�����;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//next()�������Ի������̨����,ʵ���Ƕ�ȡ
		System.out.println("�������˻�����");
		String Name=input.next();		
		
		System.out.println("���������룺");
		String password=input.next();
		
		System.out.println("������û���Ϊ��"+Name);
		System.out.println("���������Ϊ��"+password);
	}
/*
 * next() ÿ��ȡ��һ�������ǰ�������    �磺 ���� a b c ȡֵӦ����a����Ϊa�����пո�;ֻ��ȡһ���ַ���
 * nextLine() ÿ��ȡһ�����з�ǰ������� �磺���� a b c �س���ȡֵ ����a b c;��ȡһ������
 * nextInt() ��ȡnext() Ȼ����ַ���������һ��int����,ͬ��nextDouble()��nextShort()��
 */
}
