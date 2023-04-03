package PATTERN;

import java.util.Scanner;

public class P19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		s.close();
		

		for (int i = 1; i <= row ; i++) {
			char a = 'Z';
			for (int j = 1; j <= i; j++) {
				System.out.print(a--);
			}

			System.out.println();
		}
	}

}
