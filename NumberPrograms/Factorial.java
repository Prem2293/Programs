package looping_statement;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int fact=1;
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		System.out.println("factorial is "+fact);
		s.close();
	}
}
