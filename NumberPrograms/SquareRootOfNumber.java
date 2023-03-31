package looping_statement;

import java.util.Scanner;

public class SquareRootOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();

		for (int i = 1; i <= a / 2; i++) {
			int square = 0;
			square = i * i;
			if (square == a) {
				System.out.println("square root of given number is " + i);
				break;
			}
		}

		s.close();
	}

}
