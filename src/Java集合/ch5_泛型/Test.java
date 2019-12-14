package Java����.ch5_����;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/**
	 * 1.<?>�ķ��ͱ��������޷�ȷ�������͵ģ�ȡ������ʱ��Ҫǿ������ת��
	 * 2.��̬�ķ���<?>ÿ�θ�ֵ���Ḳ��֮ǰ������
	 * @param args
	 */

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(100));
		intList.add(new Integer(200));

		// List<?>�ǲ�ȷ�����ͣ����Խ����������͵�List<>
		List<?> list = intList;

		System.out.println("�洢Integerʱ�Ĵ�С��" + list.size());

		// ����ʱ����ǿ������ת��
		for (Object obj : list) {
			System.out.println((Integer) obj);
		}

		List<Number> numList = new ArrayList<Number>();
		numList.add(new Double(6.66));
		numList.add(new Double(7.66));
		numList.add(new Double(8.66));
		// ��numList��ֵ��list,֮ǰ��Integer���ݱ�����ա�
		list = numList;

		System.out.println("�洢Numberʱ�Ĵ�С��" + list.size());
		for (Object obj : list) {
			System.out.println((Number) obj);
		}

	}

}
