package Array_2D;

import java.util.Scanner;

public class P16_AddTwoMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of row");
		int size = s.nextInt();
		System.out.println("enter size of col");
		int size1 = s.nextInt();
		int[][] a = new int[size][size1];
		int[][] b = new int[size][size1];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("enter number");
				int m = s.nextInt();
				a[i][j] = m;
				b[i][j] = m;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + a[i][j]);
			}
			System.out.println();
		}
		s.close();
	}
}
