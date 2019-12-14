package Java集合.ch1_List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/**
	 * List接口，是Collection的子接口
	 * 1.元素有序，每一个元素都存在一个索引
	 * 2.元素可重复
	 * 3.按照元素添加顺序设置索引
	 * 4.实现类：【ArrayList】、【LinkedList】、【Vector】、【Stack】
	 * 5.实现了Iterable接口，使其实现类能使用forEach()遍历
	 * 
	 */
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//添加一个元素
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("5");
		//移除一个元素
		list.remove(5);
		//在指定索引位插入一个元素
		list.add(1, "1");
		//获取指定索引处的元素
		list.get(3);
		//更改指定位置的元素
		list.set(0, "0");
		//返回列表的哈希码值
		int hash=list.hashCode();
		//返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
		list.indexOf("4");
		// 返回列表中的元素数。
		list.size();
		
		System.out.println(hash);
		System.out.println(list);
	}
	
}
/**
 * 继承关系：
 * *Collection-->*List-->Vector-->Stack
 * 			  -->ArrayList
 * 			  -->LinkedList
 * 
 * 
 */









