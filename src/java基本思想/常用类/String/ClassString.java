package java����˼��.������.String;

import java.util.UUID;

public class ClassString {

	public static void main(String[] args) {
		byte[] b = { 67, 68, 69, 70, 71, 72 };//�ֽ�����
		System.out.println(new String(b));
		char[] c = { 'a', 'b', 'c', 'd' };//�ַ�����
		System.out.println(new String(c));
		System.out.println(new String("Hello world!"));
		System.out.println(new StringBuffer("abc"));
		
		System.out.println("============��==С==д==ת==��==================");
		
		String str1="SOLLANhello";
		String str2="SOLLANHELLO";
		System.out.println(str1.toLowerCase());//ת��ΪСд
		System.out.println(str1.toUpperCase());//ת��Ϊ��д
		System.out.println(str1.equalsIgnoreCase(str2));//�Ƚ������ַ����������ִ�Сд
		
		System.out.println("===========��==λ==��==��==ֵ============================");
		
		String s1="abcdefghijklman";
		int x1=s1.indexOf("f");//�����һ��f���±�ֵ
		System.out.println(x1);
		int x2=s1.lastIndexOf("a");//������һ��a���±�ֵ
		System.out.println(x2);
		
		String s2="  xxxxx  ";
		String x3=s2.trim();//ȥ��ǰ��ո�
		System.out.println(x3);
		
		System.out.println("============��==��==Ψ==һ==��==��==��==================");
		
		//ͼƬ����
		String picName="4565asdfwxda-dsae.jpg";
		//��ȡ��׺��
		String extendName=picName.substring(picName.lastIndexOf("."));
		System.out.println(extendName);
		
		//����һ��Ψһ�ַ���
		String onlyName=UUID.randomUUID().toString();
		System.out.println(onlyName);
		//ƴ����һ��
		String onlyID=onlyName+extendName;
		System.out.println(onlyID);
		
	}

}

/*
 * String��һ��JAVA�Դ�����
 * 
 * ���췽����
 * public String();
 * public String(byte[] bytes);
 * public String(char[] value);
 * public String(String original);
 * public String(StringBuffer StringBuffer);
 * 
 * �ֽڣ���������
 * �ַ���������������Ӧ��ֵ
*/





