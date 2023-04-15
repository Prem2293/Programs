package Array_2D;

public class P1_Sum_Matrix {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 8, 8, 8 } };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + a[i + 1][j]);
			}
			System.out.println();
		}
	}

}
