package Program11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Laptop> a = new ArrayList<Laptop>();
		a.add(new Laptop(38999, 8));
		a.add(new Laptop(39999, 8));
		a.add(new Laptop(41999, 16));
		a.add(new Laptop(58999, 32));
		System.out.println("choose" + "\n 1.ascending according to price" + "\n 2.descending according to price");
		int choose = s.nextInt();
		switch (choose) {
		case 1: {
			Laptop.val = -1;
			Laptop.val1 = 1;
			break;
		}
		case 2: {
			Laptop.val = 1;
			Laptop.val1 = -1;
			break;
		}

		default:
			System.out.println("Wrong input");
			break;
		}
		s.close();
		Collections.sort(a);
		for (Laptop laptop : a) {
			System.out.println(laptop);
		}
	}

}
