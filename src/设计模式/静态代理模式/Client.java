package 设计模式.静态代理模式;

//真正需要租房的人
public class Client {
	
	/**
	 * 	代理模式的好处：
	 * 	1.可以使真是角色（房东）的操作更加纯粹，不用去关注一些公共的业务。
	 * 	2.公共业务就交给代理角色，实现了业务的分工
	 * 	3.公共业务发生扩展时，方便集中管理
	 * 
	 * 	静态代理模式缺点：
	 * 	1.一个真是角色就会产生一个代理角色，代码两会范培，效率降低。
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Host host=new Host();
		 
		//通过中介来租房子，代理一般会有一些附属操作
		Proxy proxy=new Proxy(host);
		
		//不需要面对房东，直接找中介即可
		proxy.rent();
	}
}



