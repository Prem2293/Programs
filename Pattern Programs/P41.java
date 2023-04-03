package PATTERN;

import java.util.Scanner;

public class P41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows & col");
		int a = s.nextInt();
		s.close();

		for (int i = 1; i <=a; i++) {
			for (int j = a; j >=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
