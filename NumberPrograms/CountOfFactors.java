package looping_statement;

import java.util.Scanner;

public class CountOfFactors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int count=0;
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				count++;
			}
		}
		System.out.println("count of factors are "+count);
		s.close();
	}

}
