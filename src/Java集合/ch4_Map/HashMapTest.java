package Java����.ch4_Map;

import java.util.*;
import java.util.Map.Entry;
/**
 * ���ԣ�
 * 1.������
 * 2.��key��value�ļ�ֵ��
 * 3.key��value��Ϊnull
 * 4.����Iterator��������
 * 
 * ���÷�����
 * 1.map.put(key,value);  	//��������
 * 2.map.get(key);		  	//����key����valueֵ
 * 3.map.keySet();			//���ش�ӳ������������key�� Set ��ͼ
 * 4.map.values();			//���ش�ӳ����������value�� Collection ��ͼ
 * 5.map.size();			//���ؼ����м�ֵ�Ե�����ֵ
 * 6.map.entrySet();
 * 
 */
public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("1003", new Student("��3", 13));
		map.put("1904", new Student("��4", 12));
		map.put("1001", new Student("��1", 11));
		map.put("1005", new Student("��5", 15));
		map.put("1002", new Student("��2", 12));
		System.out.println(map);

		//��ɢKey��Value
		Set<Entry<String, Student>> entrySet = map.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}

	
}













