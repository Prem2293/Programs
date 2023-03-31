package looping_statement;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		s.close();
		
		if (a%2==0) {
			System.out.println("given number is even number");
		}else {
			System.out.println("given number is odd number");
		}
	}

}
