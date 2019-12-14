package ¶àÏß³Ì.doubleRun;

public class Practice2 extends Thread{
	private static int a=10;
	private static int i =1;
	
	
	public Practice2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		if(a>=i) {
			System.out.println(Thread.currentThread().getName()+":\t"+a);
		}
		a--;
	}


}
