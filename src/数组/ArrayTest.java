package ����;

import java.util.Arrays;

public class ArrayTest {
	String ar;

	public ArrayTest(String aar) {
		ar = aar;
	}
	public ArrayTest() {
		
	}

	public static void main(String[] args) {

		System.out.println("=====��====��====��==��==��====��====��======");

		String[] sr = { "���μ�", "��¥��", "ˮ䰴�", "��������" };
		ArrayTest[] at = new ArrayTest[30];
		at[0] = new ArrayTest("һ");
		at[1] = new ArrayTest("��");
		at[2] = new ArrayTest("��");
		at[3] = new ArrayTest("��");
		at[15] = new ArrayTest("ʮ��");
		at[10] = new ArrayTest("ʮ");
		at[15] = new ArrayTest("˫��ʮ��");

		// δ����ֵ��Ԫ��Ĭ��ֵΪnull
		for (int i = 0; i < at.length; i++) {
			if (at[i] != null) {
				System.out.println("��" + i + "��λ�õ�ֵΪ��\t" + at[i].ar);
			}
		}

		System.out.println("\n===========Arrays.sort()=====================");

		System.out.println("���������");
		int[] scores = { 88, 69, 55, 87, 12, 36, 11 };
		Arrays.sort(scores);// �������С��������
		for (int i : scores) {
			System.out.println(i);
		}
		System.out.println("���������");
		for (int i = scores.length - 1; i >= 0; i--) {
			System.out.println(scores[i]);// �ɸ�λ����λ�������
		}

		System.out.println("\n=====Arrays.copyOf()=========================");

		int[] array = { 18, 25, 7, 36, 13, 2, 89, 63 };
		// ����һ�����飬��ָ������
		int[] copy = Arrays.copyOf(array, 8);
		System.out.println("array�ĵ�ַ��" + array);
		System.out.println("copy�ĵ�ַ��" + copy);

		int min;
		int index = 0;
		// ��array����
		Arrays.sort(array);
		min = array[0];
		System.out.println("��С����ֵΪ��" + min);

		for (int i = 0; i < copy.length; i++) {// ������Сֵ�ҳ�copy����Сֵ���±�
			if (copy[i] == min) {
				index = i;
				System.out.println("��Сֵ�±�Ϊ��" + index);
			}
		}
		
		
	}
}
