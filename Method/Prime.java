package Method;

import java.util.Scanner;

public class Prime {
	public static void prime_number(int a) {
		int count=1;
		for (int i = 2; i <=a/2; i++) {
			if (a%i==0) {
				count++;
			}
		}
		if (count==1) {
			System.out.println("it is prime number");
		}else {
			System.out.println("it is not prime number");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		s.close();
		prime_number(a);
	}

}
