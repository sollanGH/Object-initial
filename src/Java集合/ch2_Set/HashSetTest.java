package Java集合.ch2_Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	/**
	 * HashSet实现了Set接口
	 * 特点：
	 * 1.无法保证元素的排列顺序，存储顺序与添加顺序不同。
	 * 2.不是线程安全的，若有多个线程同时修改其内容，需要用代码保证其同步性。
	 * 3.插入的元素值可以为NULL。
	 * 
	 * 存入元素判断步骤：
	 * 1.判断两元素hashcode是否一致
	 * 2.用equals比较两元素值是否相同
	 * 3.equals返回true则不能存入
	 */
	
	public static void test() {
		Set set=new HashSet();
		set.add("A");
		set.add("op");
		set.add("zz");
		set.add("cc");
		set.add("As");
		set.add(2);
		set.add("C");
		System.out.println(set);
	}

	
	public static void main(String[] args) {
		test();
	}
}

