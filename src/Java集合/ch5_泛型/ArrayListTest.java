package Java集合.ch5_泛型;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("琪亚娜");
		li.add("芽衣");
		li.add("布诺妮亚");
		//forEach()方法可以遍历集合
		li.forEach(ele -> System.out.println(ele.length()));
		
		Map<String,List<String>> ma=new HashMap<>();

	}

}
