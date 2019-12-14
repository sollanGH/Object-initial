package Java集合.ch3_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
	/**
	 * 双端队列
	 * 队首队尾都能进行进出操作
	 */
	
	public static void test() {
		Deque deque=new LinkedList();
		//添加元素到队首
		deque.add("A");
		deque.add("B");
		deque.add("C");
		System.out.println(deque+"\n");
		//添加元素到队尾
		deque.addLast("1");
		deque.addLast("2");
		System.out.println(deque+"\n");
		
		//移除队首元素
		deque.remove();
		System.out.println(deque+"\n");
		//移除队尾元素
		deque.removeLast();
		System.out.println(deque+"\n");
	}
	
	
	public static void main(String[] args) {
		test();
	}
}
