package Java集合.ch2_Set;

//使Student可以排序
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
//		System.out.println("自动调用compareTo()方法进行比较！");
		// 若年龄相同，则按姓名的Unicode编码进行自然排序
		if (stu.age == this.age) {
			return this.name.compareTo(stu.name);

		} else {
			// 若年龄不同，则按年龄大小升序排序(这里是对返回的值进行比较、排序了)
			return this.age - stu.age;
			// return this.age;
		}

	}

}
