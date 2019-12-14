package java����˼��.������.String;


public class StringTest {

	// �ַ������
	public void toSplit() {
		String s = "17688877615-520ycbilibegen-sollan";
		// �ָ��������ַ����Ӵ˴��п�
		String a[] = s.split("-");
		// ���ָ���Ϊ �� \ . | ��ת���ַ�ʱ,split("\\.")
		System.out.println(a[0] + "\n" + a[1] + "\n" + a[2]);
	}

	// ���ַ�����ת���ַ���
	public void stringToChar() {
		String str = "abcdefghijklmn";
		char s[];
		s = str.toCharArray();
		System.out.println("�ַ�����\n" + str);
		System.out.println(s);
	}

	// ���ַ���ת���ַ�����
	public void charToString() {
		char ss[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		String zz = String.valueOf(ss);
		System.out.println(ss);
		System.out.println(zz);
	}

	// ���ַ��������͵�����תint���͵ġ�������
	public void stringToInt() {
		String ii = "123456";
		int i = Integer.parseInt(ii);
		System.out.println(i);
	}

	// ��������ת���ַ�����
	public void intToString() {
		int a = 2333;
		String aa = Integer.toString(a);
		System.out.println(aa);
	}

	/*******************������**���á�**������**������*****************************************************/

	// �ַ�����ȡ
	public void subString() {
		String line = "С��������The King of Fighters 95";
		// [��ȡ]�ӵ�1λ��ʼ,��8λǰ���ַ���
		String s1 = line.substring(1, 8);
		System.out.println("subString():" + s1);
	}

	// �ַ����滻
	public void replace() {
		String line = "����˹�հ���";
		// �����������滻Ϊ��ΰ��
		String newStr = line.replace("����", "ΰ");
		System.out.println("replace():" + newStr);
	}

	// �ַ�������
	public void indexOf() {
		// ��ʾ��һ�γ��ִ��ַ�ʱ������
		String line = "ambcdefghijklmn";
		int index1 = line.indexOf('z');// ����-1
		int index2 = line.indexOf('b');// ����1
		int index3 = line.indexOf("cd");// ����2
		System.out.println("indexOf():" + index3);

		// ��ʾ���һ�γ��ִ��ַ�ʱ������
		int lastIndex1 = line.lastIndexOf('m');
		System.out.println("lastIndexOf():" + lastIndex1);
	}

	/**
	 * 1.StringBuffer 
	 * 2.�����޸����� 
	 * 3.�̰߳�ȫ,�����ͬ����
	 */
	public void stringBuffer() {
		// ��ͨ��String�����޸�����
		String line = "ABC";
		line.replace('A', 'B');
		System.out.println("String���͵�lineû�з����ı䣺" + line);
		StringBuffer sb = new StringBuffer("AABC");

		// �����ġ��ַ�������,��[0,1)�е����ݸ���
		sb.replace(0, 1, "S");

		// ����ӡ����ݣ����ַ���ĩβ���
		sb.append("AWSL");

		// ��ɾ�������ݣ�ɾ��[0~1)�е�����
		sb.delete(0, 1);

		// �����롿�ַ���,�ڵ�1λǰ����ַ�
		sb.insert(1, "123");

		// �����ַ����ĳ���
		sb.setLength(10);

		System.out.println(sb);
	}

	/**
	 * 1.StringBuilder 
	 * 2.�����޸����� 
	 * 3.���̰߳�ȫ�ģ�û��ͬ����
	 */
	public void stringBuilder() {
		// StringBuilder

	}

	// String��50000��׷�Ӳ�����ʱ
	public static void testString() {
		String line = "Hello";
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line += "Hello";
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("String��ĺ�ʱ��" + resultTime);
	}

	// StringBuffer��50000��׷�Ӳ�����ʱ
	public static void testStringBuffer() {
		StringBuffer line = new StringBuffer("Hello");
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line.append("Hello");
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("StringBuffer��ĺ�ʱ��" + resultTime);
	}

	// StringBuilder��50000��׷�Ӳ�����ʱ
	public static void testStringBuilder() {
		StringBuilder line = new StringBuilder("Hello");
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line.append("Hello");
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("StringBuilder��ĺ�ʱ��" + resultTime);
	}

	/**
	 * 1.�Զ����ַ�������ʽ�� 
	 * 2.%d �����θ�ʽ���; %8d 8����λ��; %08d ����8λ��0���; 
	 * 3.%f �Ը����͸�ʽ���,Ĭ��6��С��λ;
	 * %.2fȡ����С��λ��� 
	 * 4.%x 16�������; %o 8�������; %s ���ַ�����ʽ���; %c ���ַ���ʽ���
	 */
	public void testFormat() {
		String date = String.format("%d-%d-%d", 2019, 7, 2);
		System.out.println(date);
	}

	public static void main(String[] args) {
		StringTest so = new StringTest();
		so.toSplit();
		so.subString();
		so.replace();
		so.indexOf();
		so.stringBuffer();
		so.stringBuilder();
		so.testFormat();
		testString();
		testStringBuffer();
		testStringBuilder();

	}
}
