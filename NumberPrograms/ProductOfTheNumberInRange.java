package looping_statement;

import java.util.Scanner;

public class ProductOfTheNumberInRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the start range");
		int a = s.nextInt();
		System.out.println("enter the end range");
		int b = s.nextInt();
		s.close();
		int product=1;
		for (int i = a; i <=b; i++) {
			product *= i;
		}
		System.out.println("proiduct is "+product);
	}
}
