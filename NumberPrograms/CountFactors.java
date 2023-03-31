package looping_statement;

import java.util.Scanner;

public class CountFactors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int a = s.nextInt();
		s.close();
		int count = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		System.out.println("count of factors is " + count);
	}

}
