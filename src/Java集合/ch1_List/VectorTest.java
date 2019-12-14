package Java集合.ch1_List;

import java.util.Vector;

public class VectorTest {
	/**
	 * 【矢量】
	 * 1.List的实现类
	 * 2.数据结构与ArrayList相同，线性表
	 * 3.线程安全的，性能较低
	 */

	// vector类特有的方法
	public void test() {
		Vector vector = new Vector();
		// 添加元素
		vector.addElement("a");
		// 取出指定位置的元素
		vector.elementAt(0);
		// 在指定位置插入元素
		vector.insertElementAt("b", 0);
		// 在指定位置修改元素
		vector.setElementAt("c", 0);
		// 移除指定位置的元素
		vector.removeElement(0);
	}
	
	/**
	 * ArrayList与Vector的比较：
	 * --------------------------------------------------------------
	 * |			|线程安全性		|存储结构			|性能				|
	 * --------------------------------------------------------------
	 * |ArrayList	|非线程安全		|连续结构(数组)		|并发大时,性能较高	|
	 * --------------------------------------------------------------
	 * |Vector		|线程安全			|连续结构(数组)		|并发大时，性能较低	|
	 * --------------------------------------------------------------
	 */
}
