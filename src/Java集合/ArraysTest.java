package Java集合; 
import java.util.Arrays;
import java.util.List;

/**
 *数组的基类 
 *
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] ages = { 1, 6, 8, 9, 20, 14, 87, 25, 44 };
		/**
		 * 二分查找法
		 */
		Arrays.sort(ages);// 将数组从小到大排序
		System.out.println("排序后的数组为：" + Arrays.toString(ages));
		// 用二分法查找数组中的值,并返回它的索引
		System.out.println("25的索引值为：" + Arrays.binarySearch(ages, 25));
		

		/**
		 * 数组复制 
		 * 参数：【要复制的数组】、【给定新数组一个长度】
		 */
		int[] copyAges = Arrays.copyOf(ages, 10);
		System.out.println(Arrays.toString(copyAges));

		/**
		 * 数组的填充 
		 * 参数：【要填充的数组】、【需要填充的第一个元素(包含)】、【需要填充的最后一个元素(不包含)】、【需要填充进去的数值】
		 */
		Arrays.fill(ages, 1, 6, 100);
		System.out.println(Arrays.toString(ages));
		
		/**
		 * 复制指定长度到一个新的数组
		 * ages:被复制的数组
		 * 4：从第4位开始截取(包含)
		 * 6：到第6位结束(不包含)
		 * 
		 */
		int[] rangeAges=Arrays.copyOfRange(ages, 4, 6);
		System.out.println(Arrays.toString(rangeAges));
		
		
		/**
		 * 将【数组】转化为【集合】
		 */
		int a[] = { 10, 11, 12, 13, 14, 15 };
		System.out.println(Arrays.toString(a));

		Integer[] array = { 2, 6, 4, 8, 7, 89 };
		// 将【数组】转化为【集合】
		List<Integer> alist = Arrays.asList(array);
		for (Integer integer : alist) {
			System.out.println(integer);
		}
	}

}
