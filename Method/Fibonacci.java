package Method;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci(int k) {
		int a=0;
		int b=1;
		int c=0;
		for (int i = 1; i <=k; i++) {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		s.close();
		fibonacci(a);
	}

}
