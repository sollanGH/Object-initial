package Java����.ch5_����;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("������");
		li.add("ѿ��");
		li.add("��ŵ����");
		//forEach()�������Ա�������
		li.forEach(ele -> System.out.println(ele.length()));
		
		Map<String,List<String>> ma=new HashMap<>();

	}

}
