package looping_statement;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int count=1;
		for (int i = 2; i <=Math.sqrt(a); i++) {
			if (a%i==0) {
				count++;
			}
		}
		if (count==1) {
			System.out.println("it is prime");
		}else {
			System.out.println("it is not prime");
		}
		
		s.close();
		
	}

}
