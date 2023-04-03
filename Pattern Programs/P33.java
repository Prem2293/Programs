package PATTERN;

import java.util.Scanner;

public class P33 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows and cols");
		int r=s.nextInt();
		s.close();
		int a=r;
		for (int i = 1; i <=r; i++) {
			for (int j = r; j >=i; j--) {
				System.out.print(a);
			}
			a--;
			System.out.println();
		}
	}

}
