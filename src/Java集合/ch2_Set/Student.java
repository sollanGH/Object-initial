package Java����.ch2_Set;

//ʹStudent��������
public class Student implements Comparable<Student> {
	private int age;
	private String name;

	public Student() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent [age=" + age + ", name=" + name + "]";
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student stu) {
//		System.out.println("�Զ�����compareTo()�������бȽϣ�");
		// ��������ͬ����������Unicode���������Ȼ����
		if (stu.age == this.age) {
			return this.name.compareTo(stu.name);

		} else {
			// �����䲻ͬ���������С��������(�����ǶԷ��ص�ֵ���бȽϡ�������)
			return this.age - stu.age;
			// return this.age;
		}

	}

}
