package Java集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.mysql.fabric.xmlrpc.base.Array;

/**
 * 摘自《疯狂java讲义》
 * @author 16190
 *
 */
public class CollectionFKJY {

	public static void main(String[] args) {
		// 添加一个新的ArrayList集合，集合里的元素即对象。Collection是集合的最高父类接口，与Map相同。
		Collection c = new ArrayList();
		// 向集合里面添加对象
		c.add("西游记");
		c.add("轻量级java EE企业应用实践");
		c.add(6);
		// 返回集合里的元素个数
		System.out.println("c集合的元素个数为：" + c.size());
		// 移除某对象元素
		c.remove(6);
		System.out.println("c集合的元素个数为：" + c.size());
		// 查看集合里是否包含此对象元素，返回值true\false
		System.out.println("c集合是否包含\"西游记\"字符串：" + c.contains("西游记"));
		// 显示集合里的所有元素
		System.out.println("c集合的元素：" + c + "\n");

		Collection books = new HashSet();
		books.add("轻量级java EE企业应用实践");
		books.add("疯狂java讲义");

		System.out.println("books集合里面的元素：" + books);
		// c集合里是否包含books里的所有元素 true\false
		System.out.println("c集合是否完全包含books集合？" + c.containsAll(books));
		// 在c集合里移除所有和books相同的元素
		c.removeAll(books);
		System.out.println("移除后的c集合：" + c + "\n");

		// 清空集合
		c.clear();
		System.out.println(c);
		// 只保留和c相同的元素
		books.retainAll(c);
		System.out.println(books);

	}
	//此类因为把两类集合都声明为了Collection,所以才能相互操作。
}
