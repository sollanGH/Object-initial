package ������;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
	public static void main(String[] args) {
		InetAddress ip; // ����InetAddress����
		try {
			ip = InetAddress.getLocalHost();// ʵ��������
			String localname = ip.getHostName();// ��ȡ������
			String localip = ip.getHostAddress();// ��ȡ����IP��ַ

			System.out.println("��������" + localname);
			System.out.println("����IP��" + localip);
		} catch (UnknownHostException w) {
			w.printStackTrace();
		}
	}
}
