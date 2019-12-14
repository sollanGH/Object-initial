package Java����.ch1_List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/**
	 * List�ӿڣ���Collection���ӽӿ�
	 * 1.Ԫ������ÿһ��Ԫ�ض�����һ������
	 * 2.Ԫ�ؿ��ظ�
	 * 3.����Ԫ�����˳����������
	 * 4.ʵ���ࣺ��ArrayList������LinkedList������Vector������Stack��
	 * 5.ʵ����Iterable�ӿڣ�ʹ��ʵ������ʹ��forEach()����
	 * 
	 */
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//���һ��Ԫ��
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("5");
		//�Ƴ�һ��Ԫ��
		list.remove(5);
		//��ָ������λ����һ��Ԫ��
		list.add(1, "1");
		//��ȡָ����������Ԫ��
		list.get(3);
		//����ָ��λ�õ�Ԫ��
		list.set(0, "0");
		//�����б�Ĺ�ϣ��ֵ
		int hash=list.hashCode();
		//���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1��
		list.indexOf("4");
		// �����б��е�Ԫ������
		list.size();
		
		System.out.println(hash);
		System.out.println(list);
	}
	
}
/**
 * �̳й�ϵ��
 * *Collection-->*List-->Vector-->Stack
 * 			  -->ArrayList
 * 			  -->LinkedList
 * 
 * 
 */









