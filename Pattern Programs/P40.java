package PATTERN;

import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows & col");
		int a = s.nextInt();
		s.close();

		for (int i = 1; i <= a; i++) {
			for (int j = i; j<=a; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
