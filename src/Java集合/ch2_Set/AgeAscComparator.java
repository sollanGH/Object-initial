package Java����.ch2_Set;

import java.util.Comparator;

public class AgeAscComparator implements Comparator<Student> {

	@Override
	//���併����������
	public int compare(Student s1, Student s2) {
		if(s1.getAge()==s2.getAge()) {
			//������s1��s2�ıȽ�ֵ���ڲ㽫�����ǽ�������
			return s1.getName().compareTo(s2.getName());
		}else {
			return s1.getAge()-s2.getAge();
//			return s2.getAge()-s1.getAge(); ����
		}
	}


}
