package java基本思想.常用类.String;

//对[字符串]进行[操作]效率比Sting更高效
public class StringBufferTest {
	static String user = "SOLLAN";
	static String pwd = "520ycsqlbegen";

	public static void main(String[] args) {
		// 将缓冲区容量设为30，不够能自动增加，默认为16
		StringBuffer sb1 = new StringBuffer(30);
		// 将内容【追加】到StringBuffer的队尾，方便连接
		sb1.append("select * from userInfo where username=").append(user).append("and pwd=").append(pwd);

		
		StringBuffer sb2 = new StringBuffer("abccde");
		
		// 删除索引为2的字符
		sb2.deleteCharAt(2);
		System.out.println(sb2);
		
		// 使StringBuffer的缓冲区压缩到和string相同
		sb2.trimToSize();
		// 显示缓存区的大小
		System.out.println(sb2.capacity());
		
		// 从第3位开始添加字符进去
		sb2.insert(3, "fghijk");
		System.out.println(sb2);
		
		// 反转StringBuffer内的内容
		sb2.reverse();
		System.out.println(sb2);
		
		// 更改固定索引处的字符
		sb2.setCharAt(0, 'A');
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
	}

}
