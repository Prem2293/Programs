package looping_statement;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int temp=a;
		int power=0;
		while (temp!=0) {
			power++;
			temp=temp/10;
		}
		int sum=0;
		int compare=a;
		while (a!=0) {
			int digit=a%10;
			sum += power(power, digit);
			a=a/10;
		}
		if (sum==compare) {
			System.out.println("it is Armstrong number");
		}else {
			System.out.println("it is not armstrong number"); 
		}
		
		
		s.close();
	}
	
	public static int power(int power,int base) {
		int result=1;
	
		for (int i = 1; i <= power; i++) {
			
			result *= base;
		}
		return result;
	}
}
