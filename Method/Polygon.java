package Method;

import java.util.Scanner;

public class Polygon {

	public static void area_of_rectangle(int a, int b) {
		System.out.println("area of rectangle" + (a * b));
	}

	public static void area_of_Square(int a) {
		System.out.println("area of square " + (a * a));
	}

	public static void area_of_triangle(int a, int b) {
		System.out.println("Area of triangle " + (0.5 * (a * b)));
	}

	public static void area_of_circle(int a) {
		System.out.println("Area of circle " + (3.14 * (a * a)));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("choose\n1.Area of rectangle\n2.Area of square\n3.Area of Triangle");
		int a = s.nextInt();
		switch (a) {
		case 1: {
			System.out.println("enter length");
			int length = s.nextInt();
			System.out.println("enter width");
			int width = s.nextInt();
			area_of_rectangle(length, width);
			break;
		}
		case 2: {
			System.out.println("enter side");
			int side = s.nextInt();
			area_of_Square(side);
			break;
		}
		case 3: {
			System.out.println("enter base");
			int base = s.nextInt();
			System.out.println("enter height");
			int height = s.nextInt();
			area_of_triangle(base, height);
			break;
		}
		case 4: {
			System.out.println("enter radius");
			int radius = s.nextInt();
			area_of_circle(radius);
			break;
		}

		default:
			System.out.println("invalid input");
			break;
		}
		s.close();

	}

}
