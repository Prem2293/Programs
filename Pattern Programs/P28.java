package PATTERN;

import java.util.Scanner;

public class P28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows&cols");
		int a = s.nextInt();
		s.close();
		int p = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				if (p % 2 == 0) {
					System.out.print(0);
					p--;
				} else {
					System.out.print(p++);
				}
			}
			System.out.println();
		}
	}
}
