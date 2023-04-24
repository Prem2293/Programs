package Program5;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.println("enter marks");
		System.out.println("english");
		a.add(s.nextInt());
		System.out.println("maths");
		a.add(s.nextInt());
		System.out.println("science");
		a.add(s.nextInt());
		System.out.println("geography");
		a.add(s.nextInt());
		System.out.println("history");
		a.add(s.nextInt());
		System.out.println("social science");
		a.add(s.nextInt());
		System.out.println("computer science");
		a.add(s.nextInt());
		System.out.println("hindi");
		a.add(s.nextInt());
		System.out.println("marathi");
		a.add(s.nextInt());
		System.out.println("java");
		a.add(s.nextInt());
		s.close();
		for (Object object : a) {
			System.out.println(object);
		}
	}

}
