package 网络编程.UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 数据接收方
 * 
 * DatagramSocket为收信人，收的是一个包裹
 * DatagramPacket是一个包裹
 *
 */
public class Receive {

	public static void main(String[] args) {
		Receive receive=new Receive();
		receive.testReceiv();

	}
	
	public void testReceiv(){
		
		try {
			//确定本地使用的端口
			DatagramSocket ds=new DatagramSocket(6898);
			System.out.println("接收方套接字已启动！");
			
			//数据接收缓冲区
			byte[] buff=new byte[1024];
			
			//用于接收数据包[接收缓存区]、[接收数量]
			DatagramPacket dp=new DatagramPacket(buff, 1024);
			
			System.out.println("等待对方发来数据.....");
			
			//收信人接受了数据包(接收到以前会一直【阻塞】)
			ds.receive(dp);
			//获取包内的数据
			dp.getData();
			
			//获取包内数据的长度
			int length=dp.getLength();
			
			String str=new String(buff, 0, length);
			
			System.out.println("【接收到的数据】："+str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
