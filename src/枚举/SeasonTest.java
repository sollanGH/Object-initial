package ö��;

public class SeasonTest {

	public static void main(String[] args) {
		SeasonTest et=new SeasonTest();
		/**
		 * 1.����һ��Seasonö�ٶ��������պ����ֵ
		 * 2.values()�������Է���ö��������ʵ��
		 * 3.ö�����ʵ������Ϊ��ö������,ֻ����ö�������������
		 */
		int i=1;
		for (Season s : Season.values()) {
			System.out.println(s+" "+i);
			et.judge(s);
			i++;
		}
		//����.variable������ö��ʵ��
		System.out.println("\n"+Season.SPRING);

	}
	
	//����Ϊö�����һ������
	public void judge(Season b) {
		switch(b) {
		case SPRING:
			System.out.println("��");
			break;
		case SUMMNER:
			System.out.println("��");
			break;
		case FALL:
			System.out.println("��");
			break;
		case WINTER:
			System.out.println("��");
			break;
		default:
			break;
		}
	}
}
