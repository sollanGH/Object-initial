package ����;

public class TwoDimension {

	public static void main(String[] args) {
		//3�����飬ÿ����������Ϊ10
		int[][] array = new int[3][10];
		//����һ��������������Ϊ5
		array[0] = new int[9];
		//���ڶ�������ĵ�һ��λ�õ�ֵ��Ϊ8
		array[1][0]=8;
		
		//������ά����
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
