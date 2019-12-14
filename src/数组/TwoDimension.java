package 数组;

public class TwoDimension {

	public static void main(String[] args) {
		//3个数组，每个数组容量为10
		int[][] array = new int[3][10];
		//将第一个数组容量设置为5
		array[0] = new int[9];
		//将第二个数组的第一个位置的值设为8
		array[1][0]=8;
		
		//遍历二维数组
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
