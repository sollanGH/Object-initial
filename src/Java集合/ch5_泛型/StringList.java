package Java集合.ch5_泛型;

import java.util.*;

public class StringList {

	public static void main(String[] args) {
		/*
		 * 声明一个String类型的ArrayList集合。 
		 * 后面的ArrayList<String>里的String能省掉
		 */ 
		List<String> str = new ArrayList<String>();
		str.add("第一个元素");
		str.add("第二个元素");
		System.out.println(str);
	}

}
