package Methods_recursion;

import java.util.Scanner;

public class Prime_numbers {
	static int count = 1;
	static int i = 2;

	public static void prime(int a) {
		if (a % i == 0) {
			count++;
		}
		if (i == a) {
			return;
		}
		i++;
		prime(a);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int a = s.nextInt();
		s.close();
		prime(a);
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
