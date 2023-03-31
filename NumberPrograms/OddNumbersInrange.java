package looping_statement;

import java.util.Scanner;

public class OddNumbersInrange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Start range");
		int a=s.nextInt();
		System.out.println("enter the End range");
		int b=s.nextInt();
		s.close();
		
		for (int i = a; i <=b; i++) {
			if (i%2!=0) {
				System.out.println("odd number "+i);
			}
		}
	}

}
