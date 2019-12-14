package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
	public static void main(String[] args) {
		InetAddress ip; // 创建InetAddress对象
		try {
			ip = InetAddress.getLocalHost();// 实例化对象
			String localname = ip.getHostName();// 获取本机名
			String localip = ip.getHostAddress();// 获取本机IP地址

			System.out.println("本机名：" + localname);
			System.out.println("本机IP：" + localip);
		} catch (UnknownHostException w) {
			w.printStackTrace();
		}
	}
}
