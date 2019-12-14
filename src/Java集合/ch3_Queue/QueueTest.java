package Java集合.ch3_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 上级接口：【Collection】、【Iterable】 
 * 子接口：【Deque】双向队列 
 * 实现类：【LinkedList】、【PriorityQueue】
 * 
 * 队列数据结构：先进先出
 *
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		// 添加一个元素
		q.add("01");
		q.add("02");
		q.add("03");
		q.add("04");
		// 获取队首元素
		q.element();
		// 将指定元素插入队列
		q.offer("05");
		// 获取但不移除此队列的头，若此队列为空，则返回 null
		q.peek();
		// 获取并移除此队列的头，若此队列为空，则返回 null
		q.poll();
		// 获取并移除此队列的头。
		q.remove();
	}
}
/**
 * 方法间的区别
 * --------------------------------------------------------------
 * |			|poll		|peek		|element	|remove		|
 * --------------------------------------------------------------
 * |是否出队		|出队			|不出队		|不出队		|出队			|
 * --------------------------------------------------------------
 * |队列为空时		|返回NULL		|返回NULL		|报异常		|报异常		|
 * --------------------------------------------------------------
 * 
 */
