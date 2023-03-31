package looping_statement;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		
		int temp=a;
		int rem=0;
		int rev=0;
		
		while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if (a==rev) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
		
		s.close();
	}
}
