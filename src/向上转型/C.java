package ����ת��;

public class C extends B {

	public C() {
		super.out();
	}
	public static void main(String[] args) {
		A sollan = new C();// java������ת�͡�sollan��ָ��C�ģ�����A
		sollan.aa();//���ｫ����B��aa����(����A����Ҳ��aa�������������������)
		/*sollan.bb();    ����C��sollan����ʧȥ���к�A���в�ͬ���ķ�����
		  sollan.cc();
		*/ 
		
		
		//sollan.aa(4);   �����ഴ������ʱ������г�ʼ�����������и�����޲ι��췽�����ᱻ����
	}
}
