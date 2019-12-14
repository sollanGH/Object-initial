package Java����.ch3_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * �ϼ��ӿڣ���Collection������Iterable�� 
 * �ӽӿڣ���Deque��˫����� 
 * ʵ���ࣺ��LinkedList������PriorityQueue��
 * 
 * �������ݽṹ���Ƚ��ȳ�
 *
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		// ���һ��Ԫ��
		q.add("01");
		q.add("02");
		q.add("03");
		q.add("04");
		// ��ȡ����Ԫ��
		q.element();
		// ��ָ��Ԫ�ز������
		q.offer("05");
		// ��ȡ�����Ƴ��˶��е�ͷ�����˶���Ϊ�գ��򷵻� null
		q.peek();
		// ��ȡ���Ƴ��˶��е�ͷ�����˶���Ϊ�գ��򷵻� null
		q.poll();
		// ��ȡ���Ƴ��˶��е�ͷ��
		q.remove();
	}
}
/**
 * �����������
 * --------------------------------------------------------------
 * |			|poll		|peek		|element	|remove		|
 * --------------------------------------------------------------
 * |�Ƿ����		|����			|������		|������		|����			|
 * --------------------------------------------------------------
 * |����Ϊ��ʱ		|����NULL		|����NULL		|���쳣		|���쳣		|
 * --------------------------------------------------------------
 * 
 */
