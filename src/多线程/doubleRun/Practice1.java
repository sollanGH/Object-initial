package ∂‡œﬂ≥Ã.doubleRun;

public class Practice1 extends Thread{
	private static int a=10;
	private static int i = 1;
	
	
	public Practice1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		if(i<=a) {
			System.out.println(Thread.currentThread().getName()+":\t"+i);
		}
		i++;
	}


}
