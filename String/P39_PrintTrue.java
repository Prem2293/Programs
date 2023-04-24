package String;

import java.util.Scanner;

public class P39_PrintTrue {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String a=s.next();
		s.close();
		if (a.charAt(0)=='h' || a.charAt(0)=='H') {
			System.out.println(true);
		}else {
			System.out.println("string do not start with h/H");
		}
	}

}
