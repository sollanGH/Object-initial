package Java����.ch1_List;

import java.util.Stack;
/**
 * ��ջ��ʽ�洢�ṹ
 * 1.ʵ����List�ӿڣ�Ҳ��Vector������
 * 2.�����Ƚ����
 * 3.���̰߳�ȫ��
 */
public class StackTest {

	public static void test() {
		Stack stack=new Stack();
		//����ջ������Ԫ��
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack+"\n");
		
		//����ջ����������Ԫ��
		Object o=stack.pop();
		System.out.println("�����Ķ���Ԫ�أ�"+o);
		
		Object o1=stack.pop();
		System.out.println("�����Ķ���Ԫ�أ�"+o1+"\n");
		
		//ȡ������Ԫ�أ���������Ԫ��
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
