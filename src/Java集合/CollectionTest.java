package Java集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
	/**
	 * 【Collection接口】 
	 * 1.继承【Iterable】接口
	 * 2.是List、Set、Queue的父接口
	 * 
	 */

	public static void main(String[] args) {

		Collection<Number> co1 = new ArrayList<>();
		Collection<Double> co2 = new ArrayList<>();
		// 添加一个元素
		co1.add(1);
		co1.add(1.1);
		co1.add(1.2);
		co2.add(23.2);
		co2.add(66.3);
		// 添加一个集合(co2Double是co1Number的子类型)
		co1.addAll(co2);
		// 移除某一元素
		co1.remove(66.3);
		// 返回包含此 collection 中所有元素的数组。
		Object ob = co1.toArray();
		// 若集合为空，则返回 true
		co1.isEmpty();
		// 移除所有元素
		co1.clear();
		// 返回此 collection中的元素数
		co1.size();

		// ForEach遍历
		for (Object object : co2) {
			System.out.print(object + "\t");
		}

		System.out.println();

		// Iterator遍历
		Iterator it = co2.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.print(next + "\t");
		}

	}

	/**
	 * Collections是一个基本类
	 * 此类完全由在 collection 上进行操作或返回 collection 的静态方法组成
	 */
	public static void collections() {
		List<Integer> list = new LinkedList<>();
		list.add(87);
		list.add(7);
		list.add(74);
		list.add(17);
		list.add(47);

		// 将list集合进行排序
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("====反转====");
		// 将list数组颠倒排序
		Collections.reverse(list);
		for (Integer ages : list) {
			System.out.println(ages);
		}

		System.out.println("====打乱====");
		// 随机打乱list集合
		Collections.shuffle(list);
		for (Integer ages : list) {
			System.out.println(ages);
		}

	}

}
/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
