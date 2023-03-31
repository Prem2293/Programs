package looping_statement;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		int b = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				b += i;
			}
		}

		if (a == b) {
			System.out.println("it is a perfect number");
		} else {
			System.out.println("it is not perfect number");
		}

		s.close();
	}

}
