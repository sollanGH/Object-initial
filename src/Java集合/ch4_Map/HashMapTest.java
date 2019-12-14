package Java集合.ch4_Map;

import java.util.*;
import java.util.Map.Entry;
/**
 * 特性：
 * 1.无序存放
 * 2.含key与value的键值对
 * 3.key与value可为null
 * 4.可用Iterator遍历集合
 * 
 * 常用方法：
 * 1.map.put(key,value);  	//插入数据
 * 2.map.get(key);		  	//根据key查找value值
 * 3.map.keySet();			//返回此映射中所包含的key的 Set 视图
 * 4.map.values();			//返回此映射所包含的value的 Collection 视图
 * 5.map.size();			//返回集合中键值对的数量值
 * 6.map.entrySet();
 * 
 */
public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("1003", new Student("零3", 13));
		map.put("1904", new Student("零4", 12));
		map.put("1001", new Student("零1", 11));
		map.put("1005", new Student("零5", 15));
		map.put("1002", new Student("零2", 12));
		System.out.println(map);

		//拆散Key与Value
		Set<Entry<String, Student>> entrySet = map.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}

	
}













