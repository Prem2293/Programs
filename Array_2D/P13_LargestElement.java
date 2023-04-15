package Array_2D;

public class P13_LargestElement {
	public static void main(String[] args) {
		int[][] a = { { 4, 5, 6 }, { 8, 9, 28 }, { 8, 5, 2 } };
		int large=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]>large) {
					large=a[i][j];
				}
			}
		}
		System.out.println(large);
	}
}
