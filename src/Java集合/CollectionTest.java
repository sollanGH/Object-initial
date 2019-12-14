package Java����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
	/**
	 * ��Collection�ӿڡ� 
	 * 1.�̳С�Iterable���ӿ�
	 * 2.��List��Set��Queue�ĸ��ӿ�
	 * 
	 */

	public static void main(String[] args) {

		Collection<Number> co1 = new ArrayList<>();
		Collection<Double> co2 = new ArrayList<>();
		// ���һ��Ԫ��
		co1.add(1);
		co1.add(1.1);
		co1.add(1.2);
		co2.add(23.2);
		co2.add(66.3);
		// ���һ������(co2Double��co1Number��������)
		co1.addAll(co2);
		// �Ƴ�ĳһԪ��
		co1.remove(66.3);
		// ���ذ����� collection ������Ԫ�ص����顣
		Object ob = co1.toArray();
		// ������Ϊ�գ��򷵻� true
		co1.isEmpty();
		// �Ƴ�����Ԫ��
		co1.clear();
		// ���ش� collection�е�Ԫ����
		co1.size();

		// ForEach����
		for (Object object : co2) {
			System.out.print(object + "\t");
		}

		System.out.println();

		// Iterator����
		Iterator it = co2.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.print(next + "\t");
		}

	}

	/**
	 * Collections��һ��������
	 * ������ȫ���� collection �Ͻ��в����򷵻� collection �ľ�̬�������
	 */
	public static void collections() {
		List<Integer> list = new LinkedList<>();
		list.add(87);
		list.add(7);
		list.add(74);
		list.add(17);
		list.add(47);

		// ��list���Ͻ�������
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("====��ת====");
		// ��list����ߵ�����
		Collections.reverse(list);
		for (Integer ages : list) {
			System.out.println(ages);
		}

		System.out.println("====����====");
		// �������list����
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
