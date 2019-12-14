package Java����; 
import java.util.Arrays;
import java.util.List;

/**
 *����Ļ��� 
 *
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] ages = { 1, 6, 8, 9, 20, 14, 87, 25, 44 };
		/**
		 * ���ֲ��ҷ�
		 */
		Arrays.sort(ages);// �������С��������
		System.out.println("����������Ϊ��" + Arrays.toString(ages));
		// �ö��ַ����������е�ֵ,��������������
		System.out.println("25������ֵΪ��" + Arrays.binarySearch(ages, 25));
		

		/**
		 * ���鸴�� 
		 * ��������Ҫ���Ƶ����顿��������������һ�����ȡ�
		 */
		int[] copyAges = Arrays.copyOf(ages, 10);
		System.out.println(Arrays.toString(copyAges));

		/**
		 * �������� 
		 * ��������Ҫ�������顿������Ҫ���ĵ�һ��Ԫ��(����)��������Ҫ�������һ��Ԫ��(������)��������Ҫ����ȥ����ֵ��
		 */
		Arrays.fill(ages, 1, 6, 100);
		System.out.println(Arrays.toString(ages));
		
		/**
		 * ����ָ�����ȵ�һ���µ�����
		 * ages:�����Ƶ�����
		 * 4���ӵ�4λ��ʼ��ȡ(����)
		 * 6������6λ����(������)
		 * 
		 */
		int[] rangeAges=Arrays.copyOfRange(ages, 4, 6);
		System.out.println(Arrays.toString(rangeAges));
		
		
		/**
		 * �������顿ת��Ϊ�����ϡ�
		 */
		int a[] = { 10, 11, 12, 13, 14, 15 };
		System.out.println(Arrays.toString(a));

		Integer[] array = { 2, 6, 4, 8, 7, 89 };
		// �������顿ת��Ϊ�����ϡ�
		List<Integer> alist = Arrays.asList(array);
		for (Integer integer : alist) {
			System.out.println(integer);
		}
	}

}
