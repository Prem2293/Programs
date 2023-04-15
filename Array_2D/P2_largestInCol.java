package Array_2D;

import java.util.Arrays;

public class P2_largestInCol {

	public static void main(String[] args) {
		int[][] a = { { 1, 29, 3, 9 }, { 5, 56, 7, 8 }, { 88, 99, 88, 99 } };
		int[] res = new int[a[0].length];
		System.out.println(res.length);
		int len=a[0].length;
		
		for (int col = 0; col < len; col++) {
			
			for (int row = 0; row < a.length; row++) {
				if (res[col] < a[row][col]) {
					res[col] = a[row][col];
				}
			}
		}
		System.out.println(Arrays.toString(res));

	}
}
