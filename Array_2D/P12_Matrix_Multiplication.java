package Array_2D;

public class P12_Matrix_Multiplication {
	public static void main(String[] args) {
		int[][] a={{1,2,3},{1,2,3}}; 
		int[][] b={{1,2},{1,2},{1,2}}; 
		int[][] c=new int[2][2];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k <a[i].length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for (int[] is : c) {
			for (int is2 : is) {
			System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
}