package Java����.ch5_����;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, List<String>> ma = new HashMap<>();
		List<String> lis = new ArrayList<>();
		lis.add("���ĳ�");
		lis.add("�׵�");
		lis.add("��Ѽ");
		lis.add("����");

		ma.put("����", lis);
		ma.forEach((key, value) -> System.out.println("key:"+key+"\n"+ "value:"+value));

	}

}
