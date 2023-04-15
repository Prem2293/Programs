package Array_2D;

public class P3_largestInRow {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },{8,9,8,9} };
		for (int i = 0; i < a.length; i++) {
			int largest = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
				}
			}
			System.out.println(largest);
		}
	}

}
