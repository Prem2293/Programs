package PATTERN;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		s.close();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
			if (i%2==0) {
				if (i==2) {
					System.out.print(2);
				} else {
					System.out.print(4);
				}
			} else {
				System.out.print(5);
			}
			}
			System.out.println();
		}
	}

}
