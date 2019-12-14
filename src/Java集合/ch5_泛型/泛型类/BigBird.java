package Java集合.ch5_泛型.泛型类;
/**
 * 【继承】泛型类
 *  入参方式：
 *  1.在继承(extends)处声明
 *	2.给子类声明同样的泛型
 */

//【方法一】泛型被确定
public class BigBird extends Bird<Integer>{
		public static void main(String[] args) {
			BigBird bb=new BigBird();
			bb.add(56);
		}
}

//【方法二】泛型依旧不确定
class BigBird2<X> extends Bird<X>{
		public static void main(String[] args) {
			BigBird2<String> bb=new BigBird2<>();
			bb.add("你是什么鸟？");
		}
	
}
