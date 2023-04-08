package Methods_recursion;

import java.util.Scanner;

public class Factorial1 {
	public static int fact(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * fact(a - 1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		System.out.println(fact(a));
	}

}
