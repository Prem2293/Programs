package looping_statement;

import java.util.Scanner;

public class Nth_Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		s.close();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i <= num; i++) {
			if (num == i) {
				System.out.println(c);
			}
			
			a = b;
			b = c;
			c = a + b;

		}
	}

}
