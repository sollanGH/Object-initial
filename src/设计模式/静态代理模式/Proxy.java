package 设计模式.静态代理模式;

//代理者(中介)
public class Proxy {

	//中介能够拿到房源
	private Host host;
	
	
	//中介有【租房】的功能
	public void rent() {
		host.rent();
	}
	
	//中介有【看房】的功能
	public void seeHouse() {
		System.out.println("中介带你看房");
	}
	
	//中介有【收中介费】的功能
	public void fare() {
		System.out.println("收取中介费用");
	}
	
	//中介有【签租赁合同】的功能
	public void hetong() {
		System.out.println("签租赁合同");
	}
	
	

	public Proxy(Host host) {
		super();
		this.host = host;
	}

	public Proxy() {
		super();
	}

}
