package PATTERN;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		s.close();
		int count=1;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(count+++" ");
			}
			System.out.println();
		}
	}

}
