package Methods_recursion;

import java.util.Scanner;

public class Even_odd2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number upto ou want even odd numbers");
		int a=s.nextInt();
		System.out.println("enter number upto ou want even odd numbers");
		int b=s.nextInt();
		s.close();
		even(a,b);
	}

	public static int even(int a,int b) {
		if (a == b) {
			return 0;
		}
		if (a % 2 == 0) {
			System.out.println("even " + a);
			return even(++a,b);
		} else {
			System.out.println("odd " + a);
			return even(++a,b);
		}
	}

}
