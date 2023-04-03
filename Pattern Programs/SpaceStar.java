package PATTERN;

import java.util.Scanner;

public class SpaceStar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		s.close();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
