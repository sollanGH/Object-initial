package java����˼��.������;

public abstract class Shape01 {// �������ࡢ���󷽷���ʹ�ü����á�
	
	public abstract double calcArea();// ���󷽷����ܽӷ�����
	
	public Shape01() {}//�������еĹ��췽�������ڴ���shape01����󣬶��Ǳ��������
	
	public Shape01(String name) {
		System.out.println(name+"Shape Created");
	}
	
	public String toString() {
		return "this is shape01";
	} 
}
/* �������в�һ���г��󷽷������г��󷽷�����һ���ǳ�����
 * �������޷�ʹ��new�����ù��췽��������ʵ��
 * Ψһ��ֵ���Ǳ��̳У�Ȼ��������ʵ�����еĳ���ŷ�
*/