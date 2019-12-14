package Java¼¯ºÏ.ch5_·ºÐÍ;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, List<String>> ma = new HashMap<>();
		List<String> lis = new ArrayList<>();
		lis.add("²ÝÂÄ³æ");
		lis.add("À×µç");
		lis.add("°åÑ¼");
		lis.add("¼§×Ó");

		ma.put("±À±À", lis);
		ma.forEach((key, value) -> System.out.println("key:"+key+"\n"+ "value:"+value));

	}

}
