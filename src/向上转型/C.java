package 向上转型;

public class C extends B {

	public C() {
		super.out();
	}
	public static void main(String[] args) {
		A sollan = new C();// java的向上转型。sollan是指向C的，而非A
		sollan.aa();//这里将调用B的aa方法(由于A类中也有aa方法，所以这里才能用)
		/*sollan.bb();    这里C的sollan对象将失去所有和A类中不同命的方法。
		  sollan.cc();
		*/ 
		
		
		//sollan.aa(4);   在子类创建对象时，会进行初始化操作，所有父类的无参构造方法都会被运行
	}
}
