package java����˼��.������.String;

//��[�ַ���]����[����]Ч�ʱ�Sting����Ч
public class StringBufferTest {
	static String user = "SOLLAN";
	static String pwd = "520ycsqlbegen";

	public static void main(String[] args) {
		// ��������������Ϊ30���������Զ����ӣ�Ĭ��Ϊ16
		StringBuffer sb1 = new StringBuffer(30);
		// �����ݡ�׷�ӡ���StringBuffer�Ķ�β����������
		sb1.append("select * from userInfo where username=").append(user).append("and pwd=").append(pwd);

		
		StringBuffer sb2 = new StringBuffer("abccde");
		
		// ɾ������Ϊ2���ַ�
		sb2.deleteCharAt(2);
		System.out.println(sb2);
		
		// ʹStringBuffer�Ļ�����ѹ������string��ͬ
		sb2.trimToSize();
		// ��ʾ�������Ĵ�С
		System.out.println(sb2.capacity());
		
		// �ӵ�3λ��ʼ����ַ���ȥ
		sb2.insert(3, "fghijk");
		System.out.println(sb2);
		
		// ��תStringBuffer�ڵ�����
		sb2.reverse();
		System.out.println(sb2);
		
		// ���Ĺ̶����������ַ�
		sb2.setCharAt(0, 'A');
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
	}

}
