package Array_2D;


public class P17_Subbtract {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = { { 1, 2, 3 }, { 1, 2, 3 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] - b[i][j]);
			}
			System.out.println();
		}
	}

}
