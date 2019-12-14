package Java集合.ch2_Set;

import java.util.Comparator;

public class AgeAscComparator implements Comparator<Student> {

	@Override
	//年龄降序，姓名升序
	public int compare(Student s1, Student s2) {
		if(s1.getAge()==s2.getAge()) {
			//返回了s1和s2的比较值，内层将对它们进行排序
			return s1.getName().compareTo(s2.getName());
		}else {
			return s1.getAge()-s2.getAge();
//			return s2.getAge()-s1.getAge(); 降序
		}
	}


}
