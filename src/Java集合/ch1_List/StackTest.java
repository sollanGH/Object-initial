package Java集合.ch1_List;

import java.util.Stack;
/**
 * 【栈】式存储结构
 * 1.实现了List接口，也是Vector的子类
 * 2.数据先进后出
 * 3.是线程安全的
 */
public class StackTest {

	public static void test() {
		Stack stack=new Stack();
		//【入栈】加入元素
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack+"\n");
		
		//【出栈】弹出顶端元素
		Object o=stack.pop();
		System.out.println("弹出的顶端元素："+o);
		
		Object o1=stack.pop();
		System.out.println("弹出的顶端元素："+o1+"\n");
		
		//取出顶端元素，但不弹出元素
		Object op=stack.peek();
		System.out.println(op);
		
	}
	public static void main(String[] args) {
		test();
	}
	
	/**
	 * 
	 * 
	 */
}
