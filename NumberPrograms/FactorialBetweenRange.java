package looping_statement;

import java.util.Scanner;

public class FactorialBetweenRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number (start range)");
		int a = s.nextInt();
		System.out.println("enter a number (end range)");
		int b = s.nextInt();
		s.close();

		for (int i = a; i <= b; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;
			}
			System.out.println(i + " factorial of number is " + fact);
		}
	}

}
