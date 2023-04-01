package PATTERN;

import java.util.Scanner;

public class P27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows&cols");
		int a = s.nextInt();
		s.close();
		int v = a;
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
			}
			v--;
			System.out.println();
		}
	}

}
