package Method;

import java.util.Scanner;

public class Factorial_of_number {
	public static void factorial(int a) {
		int fact=1;
		for (int i = 1; i <=a; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		s.close();
		factorial(a);
		
	}

}
