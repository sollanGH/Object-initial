package java����˼��.������.Time;

import java.util.Calendar;
import java.util.Date;

public class ClassDate {

	public static void main(String[] args) {
		Date d1 = new Date(20000);// ��¼�����Ի�׼ʱ��1970.1.1 00:00:00 GTM ����20000����֮���ʱ��
		long time = d1.getTime();// ��ȡ�Ի�׼ʱ�䵽����ʱ���������ĺ�����
		System.out.println("��1970����20000�����ʱ�䣺 " + d1);
		System.out.println("�Ի�׼ʱ��󾭹��ĺ������� " + time);

		System.out.println();

		// ��ȡ��ǰϵͳʱ��ֵ
		Date d2 = new Date();
		System.out.println("��׼ʱ�䵽���ھ����ĺ������� " + d2.getTime());// ��ȡ�ӻ�׼ʱ�䵽�����������ĵĺ�����
		System.out.println("����ʱ�䣺 " + d2);// ��ӡ��ǰϵͳʱ��ֵ

		System.out.println(d2.compareTo(d1));// d2��d1���Ƚϣ���������ȣ�����0����d2��ǰ�򷵻ظ���-1��d2�ں��򷵻�����1
		System.out.println(d1.equals(new Date(20000)));// �Ƚ�����ʱ���Ƿ���ȣ���ȷ���true�����ȷ���false
		
		//Calendar��Ҳ��һ��ʱ����,�����ǳ����࣬���Բ���ֱnew������
		Calendar c=Calendar.getInstance();//��ȡ[������]��һ������
		int y=c.get(Calendar.YEAR) ;
		int m=c.get(Calendar.MONTH)+1;
		int r=c.get(Calendar.DAY_OF_MONTH);
		int w=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("������"+y+"��");
		System.out.println("���ǽ���ĵ�"+m+"����");
		System.out.println("����������µĵ�"+r+"��");
		System.out.println("����"+w);
	}

}
