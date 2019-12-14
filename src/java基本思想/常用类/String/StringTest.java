package java基本思想.常用类.String;


public class StringTest {

	// 字符串拆分
	public void toSplit() {
		String s = "17688877615-520ycbilibegen-sollan";
		// 分隔符，将字符串从此处切开
		String a[] = s.split("-");
		// 当分隔符为 ， \ . | 等转义字符时,split("\\.")
		System.out.println(a[0] + "\n" + a[1] + "\n" + a[2]);
	}

	// 【字符串】转【字符】
	public void stringToChar() {
		String str = "abcdefghijklmn";
		char s[];
		s = str.toCharArray();
		System.out.println("字符串：\n" + str);
		System.out.println(s);
	}

	// 【字符】转【字符串】
	public void charToString() {
		char ss[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		String zz = String.valueOf(ss);
		System.out.println(ss);
		System.out.println(zz);
	}

	// 【字符串】类型的整数转int类型的【整数】
	public void stringToInt() {
		String ii = "123456";
		int i = Integer.parseInt(ii);
		System.out.println(i);
	}

	// 【整数】转【字符串】
	public void intToString() {
		int a = 2333;
		String aa = Integer.toString(a);
		System.out.println(aa);
	}

	/*******************【常】**【用】**【方】**【法】*****************************************************/

	// 字符串截取
	public void subString() {
		String line = "小明上天了The King of Fighters 95";
		// [截取]从第1位开始,第8位前的字符。
		String s1 = line.substring(1, 8);
		System.out.println("subString():" + s1);
	}

	// 字符串替换
	public void replace() {
		String line = "奥威斯勒奥威";
		// 将“奥威”替换为“伟”
		String newStr = line.replace("奥威", "伟");
		System.out.println("replace():" + newStr);
	}

	// 字符串查找
	public void indexOf() {
		// 显示第一次出现此字符时的索引
		String line = "ambcdefghijklmn";
		int index1 = line.indexOf('z');// 返回-1
		int index2 = line.indexOf('b');// 返回1
		int index3 = line.indexOf("cd");// 返回2
		System.out.println("indexOf():" + index3);

		// 显示最后一次出现此字符时的索引
		int lastIndex1 = line.lastIndexOf('m');
		System.out.println("lastIndexOf():" + lastIndex1);
	}

	/**
	 * 1.StringBuffer 
	 * 2.可以修改自身 
	 * 3.线程安全,有添加同步锁
	 */
	public void stringBuffer() {
		// 普通的String不能修改自身
		String line = "ABC";
		line.replace('A', 'B');
		System.out.println("String类型的line没有发生改变：" + line);
		StringBuffer sb = new StringBuffer("AABC");

		// 【更改】字符串内容,将[0,1)中的内容更改
		sb.replace(0, 1, "S");

		// 【添加】内容，在字符串末尾添加
		sb.append("AWSL");

		// 【删除】内容，删除[0~1)中的内容
		sb.delete(0, 1);

		// 【插入】字符串,在第1位前添加字符
		sb.insert(1, "123");

		// 设置字符串的长度
		sb.setLength(10);

		System.out.println(sb);
	}

	/**
	 * 1.StringBuilder 
	 * 2.可以修改自身 
	 * 3.非线程安全的，没有同步锁
	 */
	public void stringBuilder() {
		// StringBuilder

	}

	// String做50000次追加操作耗时
	public static void testString() {
		String line = "Hello";
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line += "Hello";
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("String类的耗时：" + resultTime);
	}

	// StringBuffer做50000次追加操作耗时
	public static void testStringBuffer() {
		StringBuffer line = new StringBuffer("Hello");
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line.append("Hello");
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("StringBuffer类的耗时：" + resultTime);
	}

	// StringBuilder做50000次追加操作耗时
	public static void testStringBuilder() {
		StringBuilder line = new StringBuilder("Hello");
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			line.append("Hello");
		}
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("StringBuilder类的耗时：" + resultTime);
	}

	/**
	 * 1.自定义字符串【格式】 
	 * 2.%d 以整形格式输出; %8d 8代表位宽; %08d 不满8位用0填充; 
	 * 3.%f 以浮点型格式输出,默认6个小数位;
	 * %.2f取两个小数位输出 
	 * 4.%x 16进制输出; %o 8进制输出; %s 以字符串形式输出; %c 以字符形式输出
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
