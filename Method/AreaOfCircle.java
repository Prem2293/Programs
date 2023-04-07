package Method;

import java.util.Scanner;

public class AreaOfCircle {
	public static void area_of_circle(int a) {
		System.out.println("Area of circle " + (3.14 * (a * a)));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius");
		int radius = s.nextInt();
		area_of_circle(radius);
		s.close();
	}

}
