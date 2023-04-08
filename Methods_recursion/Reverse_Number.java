package Methods_recursion;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int a = s.nextInt();
		s.close();
		reverse(a);
		System.out.println(rev);
	}

	static int rev = 0;

	public static void reverse(int a) {
		if (a == 0) {
			return;
		}
		rev = rev * 10 + (a % 10);
		a = a / 10;
		reverse(a);

	}

}
