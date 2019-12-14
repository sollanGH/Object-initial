package 网络编程.UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *信息发送方
 * 
 * DatagramSocket相当于快递员，拿着包裹
 * DatagramPacket相当于包裹，写着地址与数据
 * 
 * 
 * 
 */
public class Sending {

	//192.168.7.255
	public static void main(String[] args) {
		Sending send=new Sending();
		//确定发送到的哪
		send.testSend("127.0.0.1",6898);
	}

	//传入目标IP、端口
	private void testSend(String IP, int Port) {
		DatagramSocket ds=null;
		try {
			//确定发送端端口号
			ds=new DatagramSocket(5500);
			System.out.println("创建了套接字");
			
			byte[] buff=new byte[20];
//			buff="姬你太美".getBytes();
			buff[0]='A';
			buff[1]='W';
			buff[2]='S';
			buff[3]='L';
			buff[4]='!';
			
			
			InetAddress targeAddr=InetAddress.getByName(IP);
			
			//数据报报文包[缓冲区]、[报文长度]、[目标地址]、[目标端口]
			DatagramPacket dp=new DatagramPacket(buff, 10,targeAddr,Port);
			//将【包裹发送】
			ds.send(dp);
			System.out.println("数据已发送");
			
			Scanner sc=new Scanner(System.in);
			sc.nextLine();//阻塞一下
			
			System.out.println("数据已发送");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
