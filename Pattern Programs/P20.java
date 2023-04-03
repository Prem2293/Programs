package PATTERN;

import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		s.close();
		char a = 'z';
		for (int i = 1; i <= row - 1; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(a--);
			}

			System.out.println();
		}
	}

}
