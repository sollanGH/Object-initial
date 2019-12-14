package Java集合;

import java.util.*;

//ArrayList与LinkedList

public class ListAndSetTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("=========数据的增删改查=========");
		// 增加数据
		al.add("第0位");
		al.add("第1位");
		al.add("第2位");
		al.add("第3位");
		// 查询数据
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}
		// 更改数据
		al.set(2, "02赛高！");
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}
		// 移除
		al.remove(3);
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}

		System.out.println();

		/**
		 * 1.顺序表结构 
		 * 2.利于查询数据
		 */
		System.out.println("=====ArrayList==============");
		long timeNow = System.currentTimeMillis();// 自基准时间到现在的毫秒数
		for (int i = 0; i < 10000; i++) {
			al.add(2, "插入的数据");
		}
		long timeAfter = System.currentTimeMillis();
		long t = timeAfter - timeNow;
		System.out.println("ArrayList花费时间：" + t + "毫秒");

		/**
		 * 1.双链表结构 
		 * 2.利于增、删数据
		 */
		System.out.println("=====LinkedList=============");
		LinkedList ld = new LinkedList();
		ld.add("第0位");
		ld.add("第1位");
		ld.add("第2位");
		ld.add("第3位");
		timeNow = System.currentTimeMillis();// 自基准时间到现在的毫秒数
		for (int i = 0; i < 10000; i++) {
			ld.add(2, "插入的数据");
		}
		timeAfter = System.currentTimeMillis();
		t = timeAfter - timeNow;
		System.out.println("LinkedList花费时间：" + t + "毫秒");

		/**
		 * 1.无序、不可重复 
		 * 2.根据元素本身来查找，更快速。
		 */
		System.out.println("\n======HashSet=======");
		HashSet hs = new HashSet();
		hs.add("第0条数据");
		hs.add("第1条数据");
		hs.add("第2条数据");
		hs.add("第3条数据");
		hs.add("第3条数据");
		
		//forEach()循环遍历
		for (Object object : hs) {
			String str = (String) object;
			System.out.println("foreach循环：" + str);
		}
		System.out.println();
		
		
		//Iterator遍历
		Iterator iter = hs.iterator();// 获取迭代器
		// 判断是否存在下一个元素
		while (iter.hasNext()) {
			// 利用next()迭代数据,返回值为Object,强转为String[]
			String s = (String) iter.next();
			System.out.println("Iterator迭代：" + s);
		}

	}

}
