package PATTERN;

import java.util.Scanner;

public class P23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows*cols");
		int rs=s.nextInt();
		s.close();
		char a='a';
		for (int i = 1; i <=rs; i++) {
			for (int j = 1; j <=rs; j++) {
				if (i==1||j==1||i==rs||j==rs) {
					System.out.print(a++);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
