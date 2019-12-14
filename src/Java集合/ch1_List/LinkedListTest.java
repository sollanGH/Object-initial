package Java集合.ch1_List;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	/**
	 * 实现了【List】接口和【Deque】双向队列接口
	 * 1.双向链表数据结构
	 * 2.利于数据的【增加】、【删除】
	 * 3.它集合了【链式线性表】和【双端队列】的特性
	 */
	
	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<>();
		deque.push("A");
		deque.push("B");
		deque.push("C");
		deque.push("D");
		deque.push("E");
		System.out.println(deque+"\n");
		
		deque.pop();
		System.out.println(deque+"\n");
		List<Integer> linkedList=new LinkedList<>();
	}
}
/**
 *LinkedList与ArrayList比较：
 * -----------------------------------------------------------------------------
 * |			|线程安全性	|存储结构		|查询性能get()	|修改性能set()	|添加/插入/删除性能 	|
 * -----------------------------------------------------------------------------
 * |ArrayList	|非线程安全	|连续结构(数组)	|快			|快			|慢				|	
 * -----------------------------------------------------------------------------
 * |LinkedList	|线程安全		|链式结构(链表)	|慢			|慢			|快				|
 * -----------------------------------------------------------------------------
 * 
 * LinkedList与Stack比较：
 *  -------------------------------------------------
 * |			|线程安全性|存储结构	|逻辑结构				|
 * --------------------------------------------------
 * |LinkedList	|不安全	|链式		|顺序表、队列、栈		|
 * --------------------------------------------------
 * |Stack		|安全		|连续		|栈					|
 * --------------------------------------------------
 * 
 */