package Java����.ch2_Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	/**
	 * HashSetʵ����Set�ӿ�
	 * �ص㣺
	 * 1.�޷���֤Ԫ�ص�����˳�򣬴洢˳�������˳��ͬ��
	 * 2.�����̰߳�ȫ�ģ����ж���߳�ͬʱ�޸������ݣ���Ҫ�ô��뱣֤��ͬ���ԡ�
	 * 3.�����Ԫ��ֵ����ΪNULL��
	 * 
	 * ����Ԫ���жϲ��裺
	 * 1.�ж���Ԫ��hashcode�Ƿ�һ��
	 * 2.��equals�Ƚ���Ԫ��ֵ�Ƿ���ͬ
	 * 3.equals����true���ܴ���
	 */
	
	public static void test() {
		Set set=new HashSet();
		set.add("A");
		set.add("op");
		set.add("zz");
		set.add("cc");
		set.add("As");
		set.add(2);
		set.add("C");
		System.out.println(set);
	}

	
	public static void main(String[] args) {
		test();
	}
}

