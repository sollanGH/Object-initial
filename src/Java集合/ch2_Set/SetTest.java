package Java集合.ch2_Set;

import java.util.*;


public class SetTest {
	/**
	 * 【Set】接口
	 * 子类：【HashSet】、【TreeSet】、【LinkedHashSet】
	 * 无序、不重复
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("\n======HashSet=======");
		/**
		 * 1.无序、不可重复 
		 * 2.根据元素本身来查找，更快速。
		 * 3.不能保证元素排列顺序，存储顺序与添加顺序不同
		 * 4.非线程安全
		 * 5.可以插入Null
		 */
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
/**
 * 继承关系：
 * *Collection-->*Set-->HashSet-->LinkedHashSet
 * 			  -->*ShortedSet-->TreeSet
 * 			  -->EnumSet
 * 
 */

















