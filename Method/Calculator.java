package Method;

import java.util.Scanner;

public class Calculator {

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void multi(int a, int b) {
		System.out.println(a * b);
	}

	public static void rem(int a, int b) {
		System.out.println(a % b);
	}

	public static void quo(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("choose\n1.Add\n2.subtract\n3.multiply\n4.divde\n5.quotent\n6.reminder");
		int a = s.nextInt();
		switch (a) {
		case 1: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			add(num1, num2);
			break;
		}
		case 2: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			sub(num1, num2);
			break;
		}
		case 3: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			multi(num1, num2);
			break;
		}
		case 4: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			div(num1, num2);
			break;
		}
		case 5: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			quo(num1, num2);
			break;
		}
		case 6: {
			System.out.println("enter number 1");
			int num1 = s.nextInt();
			System.out.println("enter number 2");
			int num2 = s.nextInt();
			rem(num1, num2);
			break;
		}

		default:
			System.out.println("Wrong Input");
			break;
		}
		s.close();
	}

}
