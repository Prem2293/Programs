package looping_statement;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int temp=a;
		
		int product=1;
		int add=0;
		while (temp!=0) {
			add +=temp%10;
			product *= temp%10;
			temp=temp/10;
		} 
		if (add==product) {
			System.out.println("it is a spy number");
		}else {
			System.out.println("it is not a spy number");
		}
		
		s.close();
	}

}
