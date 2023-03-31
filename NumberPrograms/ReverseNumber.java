package looping_statement;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int a=s.nextInt();
		int rem=0;
		int rev=0;
		
		while (a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		
		
		s.close();
	}

}
