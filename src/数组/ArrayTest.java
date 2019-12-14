package 数组;

import java.util.Arrays;

public class ArrayTest {
	String ar;

	public ArrayTest(String aar) {
		ar = aar;
	}
	public ArrayTest() {
		
	}

	public static void main(String[] args) {

		System.out.println("=====数====组====定==义==与====遍====历======");

		String[] sr = { "西游记", "红楼梦", "水浒传", "三国演义" };
		ArrayTest[] at = new ArrayTest[30];
		at[0] = new ArrayTest("一");
		at[1] = new ArrayTest("二");
		at[2] = new ArrayTest("三");
		at[3] = new ArrayTest("四");
		at[15] = new ArrayTest("十五");
		at[10] = new ArrayTest("十");
		at[15] = new ArrayTest("双·十五");

		// 未被赋值的元素默认值为null
		for (int i = 0; i < at.length; i++) {
			if (at[i] != null) {
				System.out.println("第" + i + "个位置的值为：\t" + at[i].ar);
			}
		}

		System.out.println("\n===========Arrays.sort()=====================");

		System.out.println("升序输出：");
		int[] scores = { 88, 69, 55, 87, 12, 36, 11 };
		Arrays.sort(scores);// 将数组从小到大排序
		for (int i : scores) {
			System.out.println(i);
		}
		System.out.println("降序输出：");
		for (int i = scores.length - 1; i >= 0; i--) {
			System.out.println(scores[i]);// 由高位到低位依次输出
		}

		System.out.println("\n=====Arrays.copyOf()=========================");

		int[] array = { 18, 25, 7, 36, 13, 2, 89, 63 };
		// 复制一个数组，并指定长度
		int[] copy = Arrays.copyOf(array, 8);
		System.out.println("array的地址：" + array);
		System.out.println("copy的地址：" + copy);

		int min;
		int index = 0;
		// 给array排序
		Arrays.sort(array);
		min = array[0];
		System.out.println("最小的数值为：" + min);

		for (int i = 0; i < copy.length; i++) {// 根据最小值找出copy中最小值的下标
			if (copy[i] == min) {
				index = i;
				System.out.println("最小值下标为：" + index);
			}
		}
		
		
	}
}
