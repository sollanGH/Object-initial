package ���ģʽ.����ģʽ;

//�������ģʽ����
public class SingletonPatternTest {

	public static void main(String[] args) {
		
//		SingletonPattern s=new SingletonPattern(); //��������ģʽ�಻�ɴ�������
		
		//��������������getInstance()����
		SingletonPattern s=SingletonPattern.getInstance();
		System.out.println(s);
		
		SingletonPattern p=SingletonPattern.getInstance();
		System.out.println(p);//���δ��������ֵַ��ͬ����֤������Դ������
		
		System.out.println("=================���δ����Ķ����ַ��ͬ��û�������Դ�˷ѣ�==============\n");
		
		SingletonPatternTest spt1=new SingletonPatternTest();
		SingletonPatternTest spt2=new SingletonPatternTest();
		System.out.println(spt1);
		System.out.println(spt2);
		System.out.println("���������ݶ��󣬶���Ϊ���ö�������ԣ�����˲���Ҫ����Դ�˷ѣ���");

	}

}
