package PATTERN;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows*col");
		int row = s.nextInt();
		s.close();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
