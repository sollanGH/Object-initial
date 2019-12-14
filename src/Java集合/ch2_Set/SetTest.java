package Java����.ch2_Set;

import java.util.*;


public class SetTest {
	/**
	 * ��Set���ӿ�
	 * ���ࣺ��HashSet������TreeSet������LinkedHashSet��
	 * ���򡢲��ظ�
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("\n======HashSet=======");
		/**
		 * 1.���򡢲����ظ� 
		 * 2.����Ԫ�ر��������ң������١�
		 * 3.���ܱ�֤Ԫ������˳�򣬴洢˳�������˳��ͬ
		 * 4.���̰߳�ȫ
		 * 5.���Բ���Null
		 */
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
/**
 * �̳й�ϵ��
 * *Collection-->*Set-->HashSet-->LinkedHashSet
 * 			  -->*ShortedSet-->TreeSet
 * 			  -->EnumSet
 * 
 */

















