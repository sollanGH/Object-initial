package java����˼��.������.ClassObject;

public class ToString {
	private String name;
	private String sex;
	private String Address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ToString(String name, String sex, String address, int age) {
		super();
		this.name = name;
		this.sex = sex;
		Address = address;
		this.age = age;
	}
	public ToString() {
		super();
	}
	
	/**
	 * ���Զ����ɣ���дtoString����,��ʾ�������еĳ�Ա������ֵ
	 */
	@Override
	public String toString() {
		return "ToString [name=" + name + ", sex=" + sex + ", Address=" + Address + ", age=" + age + "]";
	}
	
	
	
}
