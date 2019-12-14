package Java集合.ch1_List;

import java.util.*;

/**
 * 【ArrayList】实现了List接口 
 * 1.顺序表数据结构 
 * 2.非线程安全的 
 * 3.底层以数组实现，利于查询数据
 * 4.删除、插入元素时，如果需要移动的元素太多，会比较耗时。 
 * 5.因为实现了Iterable接口，所以能用forEach()循环
 * 
 */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		// 增加数据
		al.add("第0位");
		al.add("第1位");
		al.add("第2位");
		al.add("第3位");
		// 更改元素
		al.set(2, "02最高！");
		// 移除
		al.remove(3);
		// 获取元素
		al.get(2);
		// 将此 ArrayList 实例的容量调整为列表的当前大小
		al.trimToSize();
		// 遍历元素
		for (int i = 0; i < al.size(); i++) {
			String string = al.get(i);
			System.out.println(string);
		}

		/**
		 * 1.顺序表结构 
		 * 2.利于查询数据
		 */
		System.out.println("=====ArrayList==============");
		long timeNow = System.currentTimeMillis();// 自基准时间到现在的毫秒数
		for (int i = 0; i < 10000; i++) {
			al.add(3, "添加的元素");
		}
		long timeAfter = System.currentTimeMillis();
		long t = timeAfter - timeNow;
		System.out.println("ArrayList花费时间：" + t + "毫秒");

		/**
		 * 1.双链表结构 
		 * 2.利于增、删数据
		 */
		System.out.println("=====LinkedList=============");
		LinkedList<String> ld = new LinkedList<>();
		ld.add("第0位");
		ld.add("第1位");
		ld.add("第2位");
		ld.add("第3位");
		timeNow = System.currentTimeMillis();// 自基准时间到现在的毫秒数
		for (int i = 0; i < 10000; i++) {
			ld.add(1, "添加的元素");
		}
		timeAfter = System.currentTimeMillis();
		t = timeAfter - timeNow;
		System.out.println("LinkedList花费时间：" + t + "毫秒");

	}

}
