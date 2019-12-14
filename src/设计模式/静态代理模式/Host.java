package 设计模式.静态代理模式;

//房东
public class Host implements Rent{

	//房东只有租房的能力
	public void rent() {
		System.out.println("房东要出租房子！");
	}
}
