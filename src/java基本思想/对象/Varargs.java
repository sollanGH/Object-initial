package java基本思想.对象;

//【形参长度可变方法】
public class Varargs {

	public static void outClassInfo(String className, String... studentNames) {
		// 输入班级名称
		System.out.println("班级名称：" + className);
		System.out.println("班级人员名单:");
		// studentNames被当做数组处理
		for (String student : studentNames) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		// 调用outClassInfo方法
		outClassInfo("计算机8班", "张三", "李四", "王麻子", "李二蛋");

	}

}
