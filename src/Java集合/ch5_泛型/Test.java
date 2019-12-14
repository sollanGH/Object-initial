package Java集合.ch5_泛型;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/**
	 * 1.<?>的泛型编译器是无法确认它类型的，取出数据时需要强制类型转换
	 * 2.动态的泛型<?>每次赋值都会覆盖之前的数据
	 * @param args
	 */

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(100));
		intList.add(new Integer(200));

		// List<?>是不确定类型，可以接受所有类型的List<>
		List<?> list = intList;

		System.out.println("存储Integer时的大小：" + list.size());

		// 遍历时必须强制类型转换
		for (Object obj : list) {
			System.out.println((Integer) obj);
		}

		List<Number> numList = new ArrayList<Number>();
		numList.add(new Double(6.66));
		numList.add(new Double(7.66));
		numList.add(new Double(8.66));
		// 将numList赋值给list,之前的Integer数据被【清空】
		list = numList;

		System.out.println("存储Number时的大小：" + list.size());
		for (Object obj : list) {
			System.out.println((Number) obj);
		}

	}

}
