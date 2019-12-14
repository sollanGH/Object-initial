package ���ģʽ.����ģʽ;

//�������ģʽ
public class SingletonPattern {
	
	//˽�еġ�Ψһ�ġ��յĶ�������
	private static SingletonPattern sp=null;
	
	//˽�й��췽�����������޷�����
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		//��ֻ֤����һ������
		if(sp==null) {
			sp=new SingletonPattern();
		}
		
		return sp;
	}
	/*
	 * ԭ��Ϊ�˽��ÿ�ε��ö�������newһ���µĶ����µĶ��󶼱�����һ�ε�ַ��Ȼ��ʹ�õĶ�������Զ�����ͬ�ģ����������Դ���˷ѡ�
	 * �÷���
	 * 1.��private���ι��췽����ʹ�������޷���㴴���������
	 * 2.����getInstance()������֤ͬʱֻ����һ������
	 * 3.��static����getInstance()�������Ա�֤�����������������õ��˷���
	 * 4.���ھ�̬����ֻ�ܵ��þ�̬���ԣ����Դ����Ŀն�������ҲҪ��static����
	 * 5.ͬʱҲ�ܲ���enumö�ٵ���ʽ�����ù̶���������ʵ��
	 * 
	 */


}
