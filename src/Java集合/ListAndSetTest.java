package Java����;

import java.util.*;

//ArrayList��LinkedList

public class ListAndSetTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("=========���ݵ���ɾ�Ĳ�=========");
		// ��������
		al.add("��0λ");
		al.add("��1λ");
		al.add("��2λ");
		al.add("��3λ");
		// ��ѯ����
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}
		// ��������
		al.set(2, "02���ߣ�");
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}
		// �Ƴ�
		al.remove(3);
		for (int i = 0; i < al.size(); i++) {
			String string = (String) al.get(i);
			System.out.println(string);
		}

		System.out.println();

		/**
		 * 1.˳���ṹ 
		 * 2.���ڲ�ѯ����
		 */
		System.out.println("=====ArrayList==============");
		long timeNow = System.currentTimeMillis();// �Ի�׼ʱ�䵽���ڵĺ�����
		for (int i = 0; i < 10000; i++) {
			al.add(2, "���������");
		}
		long timeAfter = System.currentTimeMillis();
		long t = timeAfter - timeNow;
		System.out.println("ArrayList����ʱ�䣺" + t + "����");

		/**
		 * 1.˫����ṹ 
		 * 2.��������ɾ����
		 */
		System.out.println("=====LinkedList=============");
		LinkedList ld = new LinkedList();
		ld.add("��0λ");
		ld.add("��1λ");
		ld.add("��2λ");
		ld.add("��3λ");
		timeNow = System.currentTimeMillis();// �Ի�׼ʱ�䵽���ڵĺ�����
		for (int i = 0; i < 10000; i++) {
			ld.add(2, "���������");
		}
		timeAfter = System.currentTimeMillis();
		t = timeAfter - timeNow;
		System.out.println("LinkedList����ʱ�䣺" + t + "����");

		/**
		 * 1.���򡢲����ظ� 
		 * 2.����Ԫ�ر��������ң������١�
		 */
		System.out.println("\n======HashSet=======");
		HashSet hs = new HashSet();
		hs.add("��0������");
		hs.add("��1������");
		hs.add("��2������");
		hs.add("��3������");
		hs.add("��3������");
		
		//forEach()ѭ������
		for (Object object : hs) {
			String str = (String) object;
			System.out.println("foreachѭ����" + str);
		}
		System.out.println();
		
		
		//Iterator����
		Iterator iter = hs.iterator();// ��ȡ������
		// �ж��Ƿ������һ��Ԫ��
		while (iter.hasNext()) {
			// ����next()��������,����ֵΪObject,ǿתΪString[]
			String s = (String) iter.next();
			System.out.println("Iterator������" + s);
		}

	}

}
