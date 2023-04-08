package Methods_recursion;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	static int i=1;
	public static void fact(int a) {
		
		fact=fact*i;
		if (i==a) {
			System.out.println(fact);
			return;
		}
		i++;
		fact(a);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		s.close();
		fact(a);
	}

}
