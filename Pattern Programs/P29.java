package PATTERN;

import java.util.Scanner;

public class P29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows & col");
		int a=s.nextInt();
		s.close();
		for (int i = 1; i <=a; i++) {
			for (int j = 1; j <=a-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
