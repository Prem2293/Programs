package Array_2D;

public class P19_UpperTriangle {
	public static void main(String[] args) {
		int[][] a = { { 4, 5, 6 }, { 8, 9, 6 }, { 8, 5, 2 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j >= i) {
					System.out.print(a[i][j]);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();

		}
	}
}
