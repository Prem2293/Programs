package looping_statement;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int b=s.nextInt();
		int a=b*b;
		s.close();
		int sum=0;
		
		for (int i = a; i>0; i=i/10) {
			int digit=i%10;
			sum+=digit;
		}
		if (sum==b) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not A Neon Number");
		}
	}
}
