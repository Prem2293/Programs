package Array;

import java.util.Arrays;

public class P24_MergTwoArrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		int[] c = new int[a.length + b.length];

		int index = 0;
		int ind = 0;

		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[index++];
			} else {
				c[i] = b[ind++];
			}
		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
		System.out.println(Arrays.toString(c));

	}

}
