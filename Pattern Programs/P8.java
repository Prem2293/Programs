package PATTERN;

import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		System.out.println("enter columns");
		int col = s.nextInt();
		s.close();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j%2==0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}

}
