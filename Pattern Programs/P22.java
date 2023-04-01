package PATTERN;

import java.util.Scanner;

public class P22 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows*cols");
		int rowscols=s.nextInt();
		s.close();
		for (int i = 1; i <=rowscols; i++) {
			for (int j = 1; j <= rowscols; j++) {
				if (i==5 || i==1 || j==1 || j==5 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
