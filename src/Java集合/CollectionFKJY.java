package Java����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.mysql.fabric.xmlrpc.base.Array;

/**
 * ժ�ԡ����java���塷
 * @author 16190
 *
 */
public class CollectionFKJY {

	public static void main(String[] args) {
		// ���һ���µ�ArrayList���ϣ��������Ԫ�ؼ�����Collection�Ǽ��ϵ���߸���ӿڣ���Map��ͬ��
		Collection c = new ArrayList();
		// �򼯺�������Ӷ���
		c.add("���μ�");
		c.add("������java EE��ҵӦ��ʵ��");
		c.add(6);
		// ���ؼ������Ԫ�ظ���
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		// �Ƴ�ĳ����Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		// �鿴�������Ƿ�����˶���Ԫ�أ�����ֵtrue\false
		System.out.println("c�����Ƿ����\"���μ�\"�ַ�����" + c.contains("���μ�"));
		// ��ʾ�����������Ԫ��
		System.out.println("c���ϵ�Ԫ�أ�" + c + "\n");

		Collection books = new HashSet();
		books.add("������java EE��ҵӦ��ʵ��");
		books.add("���java����");

		System.out.println("books���������Ԫ�أ�" + books);
		// c�������Ƿ����books�������Ԫ�� true\false
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));
		// ��c�������Ƴ����к�books��ͬ��Ԫ��
		c.removeAll(books);
		System.out.println("�Ƴ����c���ϣ�" + c + "\n");

		// ��ռ���
		c.clear();
		System.out.println(c);
		// ֻ������c��ͬ��Ԫ��
		books.retainAll(c);
		System.out.println(books);

	}
	//������Ϊ�����༯�϶�����Ϊ��Collection,���Բ����໥������
}
