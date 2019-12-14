package ������.UDPЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ���ݽ��շ�
 * 
 * DatagramSocketΪ�����ˣ��յ���һ������
 * DatagramPacket��һ������
 *
 */
public class Receive {

	public static void main(String[] args) {
		Receive receive=new Receive();
		receive.testReceiv();

	}
	
	public void testReceiv(){
		
		try {
			//ȷ������ʹ�õĶ˿�
			DatagramSocket ds=new DatagramSocket(6898);
			System.out.println("���շ��׽�����������");
			
			//���ݽ��ջ�����
			byte[] buff=new byte[1024];
			
			//���ڽ������ݰ�[���ջ�����]��[��������]
			DatagramPacket dp=new DatagramPacket(buff, 1024);
			
			System.out.println("�ȴ��Է���������.....");
			
			//�����˽��������ݰ�(���յ���ǰ��һֱ��������)
			ds.receive(dp);
			//��ȡ���ڵ�����
			dp.getData();
			
			//��ȡ�������ݵĳ���
			int length=dp.getLength();
			
			String str=new String(buff, 0, length);
			
			System.out.println("�����յ������ݡ���"+str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
