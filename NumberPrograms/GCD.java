package looping_statement;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		int a = s.nextInt();
		System.out.println("enter second number");
		int b = s.nextInt();
		s.close();
		if (a > b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					System.out.println("GCD is " + i);
					break;
				}
			}
		} else {
			for (int i = b; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					System.out.println("GCD is " + i);
					break;
				}
			}
		}

	}
}
