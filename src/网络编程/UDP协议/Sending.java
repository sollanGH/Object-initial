package ������.UDPЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *��Ϣ���ͷ�
 * 
 * DatagramSocket�൱�ڿ��Ա�����Ű���
 * DatagramPacket�൱�ڰ�����д�ŵ�ַ������
 * 
 * 
 * 
 */
public class Sending {

	//192.168.7.255
	public static void main(String[] args) {
		Sending send=new Sending();
		//ȷ�����͵�����
		send.testSend("127.0.0.1",6898);
	}

	//����Ŀ��IP���˿�
	private void testSend(String IP, int Port) {
		DatagramSocket ds=null;
		try {
			//ȷ�����Ͷ˶˿ں�
			ds=new DatagramSocket(5500);
			System.out.println("�������׽���");
			
			byte[] buff=new byte[20];
//			buff="����̫��".getBytes();
			buff[0]='A';
			buff[1]='W';
			buff[2]='S';
			buff[3]='L';
			buff[4]='!';
			
			
			InetAddress targeAddr=InetAddress.getByName(IP);
			
			//���ݱ����İ�[������]��[���ĳ���]��[Ŀ���ַ]��[Ŀ��˿�]
			DatagramPacket dp=new DatagramPacket(buff, 10,targeAddr,Port);
			//�����������͡�
			ds.send(dp);
			System.out.println("�����ѷ���");
			
			Scanner sc=new Scanner(System.in);
			sc.nextLine();//����һ��
			
			System.out.println("�����ѷ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
