package java基本思想.常用类;

public class ClassMath {

	public static void main(String[] args) {
		//生成绝对值
		int abs=Math.abs(-322);
		System.out.println(abs);
		
		System.out.println();
		
		//产生随机数[0~1之间的小数,不含0、1]
		double ran=Math.random();
		System.out.println(ran);
		
		System.out.println();
		
		//产生随机数[0~100之间的整数,含0、100]
		for(int i=0;i<10;i++) {
		int sjs=(int)(Math.random()*100)+1;
		System.out.println(sjs);
		}
	}

}
