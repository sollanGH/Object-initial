package Java����.ch5_����.������;
/**
 * ���̳С�������
 *  ��η�ʽ��
 *  1.�ڼ̳�(extends)������
 *	2.����������ͬ���ķ���
 */

//������һ�����ͱ�ȷ��
public class BigBird extends Bird<Integer>{
		public static void main(String[] args) {
			BigBird bb=new BigBird();
			bb.add(56);
		}
}

//�����������������ɲ�ȷ��
class BigBird2<X> extends Bird<X>{
		public static void main(String[] args) {
			BigBird2<String> bb=new BigBird2<>();
			bb.add("����ʲô��");
		}
	
}
