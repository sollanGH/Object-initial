package java����˼��.������;

public class ClassMath {

	public static void main(String[] args) {
		//���ɾ���ֵ
		int abs=Math.abs(-322);
		System.out.println(abs);
		
		System.out.println();
		
		//���������[0~1֮���С��,����0��1]
		double ran=Math.random();
		System.out.println(ran);
		
		System.out.println();
		
		//���������[0~100֮�������,��0��100]
		for(int i=0;i<10;i++) {
		int sjs=(int)(Math.random()*100)+1;
		System.out.println(sjs);
		}
	}

}
