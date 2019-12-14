package �����ļ�����.ch9_������;

import java.io.Serializable;
/**
 * ��һ�����Ϣ
 * 1.��Ҫʵ�֡�Serializable������ʵ�����л�
 * 2.��Ҫȷ��һ�����汾�š������ֲ�ͬ�汾�Ķ���
 * 3.��Ҫʵ��get()��set()��toString()���� 
 * 
 */

public class Student implements Serializable{
	//���汾�š�
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String sex;
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
	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}
	
}
