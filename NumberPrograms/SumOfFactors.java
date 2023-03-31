package looping_statement;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		int sum=0;
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				sum +=i;
			}
		}
		System.out.println("sum is "+sum);
	}
}
