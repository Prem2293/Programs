package Array_2D;

public class P18_Transpose_Array {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{5,6,7}};
		int[][] b=new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i]=a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	
	}
	

}
