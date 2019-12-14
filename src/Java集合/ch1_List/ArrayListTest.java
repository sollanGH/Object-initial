package Java����.ch1_List;

import java.util.*;

/**
 * ��ArrayList��ʵ����List�ӿ� 
 * 1.˳������ݽṹ 
 * 2.���̰߳�ȫ�� 
 * 3.�ײ�������ʵ�֣����ڲ�ѯ����
 * 4.ɾ��������Ԫ��ʱ�������Ҫ�ƶ���Ԫ��̫�࣬��ȽϺ�ʱ�� 
 * 5.��Ϊʵ����Iterable�ӿڣ���������forEach()ѭ��
 * 
 */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		// ��������
		al.add("��0λ");
		al.add("��1λ");
		al.add("��2λ");
		al.add("��3λ");
		// ����Ԫ��
		al.set(2, "02��ߣ�");
		// �Ƴ�
		al.remove(3);
		// ��ȡԪ��
		al.get(2);
		// ���� ArrayList ʵ������������Ϊ�б�ĵ�ǰ��С
		al.trimToSize();
		// ����Ԫ��
		for (int i = 0; i < al.size(); i++) {
			String string = al.get(i);
			System.out.println(string);
		}

		/**
		 * 1.˳���ṹ 
		 * 2.���ڲ�ѯ����
		 */
		System.out.println("=====ArrayList==============");
		long timeNow = System.currentTimeMillis();// �Ի�׼ʱ�䵽���ڵĺ�����
		for (int i = 0; i < 10000; i++) {
			al.add(3, "��ӵ�Ԫ��");
		}
		long timeAfter = System.currentTimeMillis();
		long t = timeAfter - timeNow;
		System.out.println("ArrayList����ʱ�䣺" + t + "����");

		/**
		 * 1.˫����ṹ 
		 * 2.��������ɾ����
		 */
		System.out.println("=====LinkedList=============");
		LinkedList<String> ld = new LinkedList<>();
		ld.add("��0λ");
		ld.add("��1λ");
		ld.add("��2λ");
		ld.add("��3λ");
		timeNow = System.currentTimeMillis();// �Ի�׼ʱ�䵽���ڵĺ�����
		for (int i = 0; i < 10000; i++) {
			ld.add(1, "��ӵ�Ԫ��");
		}
		timeAfter = System.currentTimeMillis();
		t = timeAfter - timeNow;
		System.out.println("LinkedList����ʱ�䣺" + t + "����");

	}

}
