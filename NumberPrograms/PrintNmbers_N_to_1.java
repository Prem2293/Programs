package looping_statement;

import java.util.Scanner;

public class PrintNmbers_N_to_1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start range");
		int a=s.nextInt();
		s.close();
		for (int i = a; i >0; i--) {
			System.out.println(i);
		}
	}

}
