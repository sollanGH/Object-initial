package Java����.ch3_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
	/**
	 * ˫�˶���
	 * ���׶�β���ܽ��н�������
	 */
	
	public static void test() {
		Deque deque=new LinkedList();
		//���Ԫ�ص�����
		deque.add("A");
		deque.add("B");
		deque.add("C");
		System.out.println(deque+"\n");
		//���Ԫ�ص���β
		deque.addLast("1");
		deque.addLast("2");
		System.out.println(deque+"\n");
		
		//�Ƴ�����Ԫ��
		deque.remove();
		System.out.println(deque+"\n");
		//�Ƴ���βԪ��
		deque.removeLast();
		System.out.println(deque+"\n");
	}
	
	
	public static void main(String[] args) {
		test();
	}
}
