package ���ģʽ.����ģʽ;

public class OneTest {
	private String name;
	private int ID;

	//��1������һ��˽�еġ���̬�Ķ���
	private static OneTest one = new OneTest();

	//��2�����췽��˽�л�
	private OneTest() {
		
	}

	//��3������һ������������ȡ����
	public static OneTest getObject() {
		
		return one;
	}
	/**
	 * ֻ����һ��static������������ڻ�ȡ�������
	 * 
	 */
}
