package Methods_recursion;

import java.util.Scanner;

public class Fibonacci2 {
	public static int fib(int a) {
		if (a == 1 || a == 0) {
			return a;
		} else {
			return fib(a - 1) + fib(a - 2);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number ");
		int a = s.nextInt();
		s.close();
		System.out.println(fib(a));
	}

}
