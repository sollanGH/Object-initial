package 流与文件操作.ch9_对象流;

import java.io.Serializable;
/**
 * 玩家基本信息
 * 1.需要实现【Serializable】几口实现序列化
 * 2.需要确定一个【版本号】以区分不同版本的对象
 * 3.需要实现get()、set()、toString()方法 
 * 
 */

public class Student implements Serializable{
	//【版本号】
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
