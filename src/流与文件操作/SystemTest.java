package �����ļ�����;

import java.io.*;

public class SystemTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Please input a String:");
		// �������黺����
		byte[] b = new byte[512];//��¼�����ַ���ASC11ֵ
		// �ӱ�׼��������ȡ����
		int count = System.in.read(b);
		// ���ַ���ʽ���bԪ��ֵ
		System.out.println("your input String is:");
		for (int i = 0; i < count; i++)
			System.out.println(b[i]);
	}

}
