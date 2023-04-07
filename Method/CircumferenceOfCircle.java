package Method;

import java.util.Scanner;

public class CircumferenceOfCircle {
	public static void circumference_of_circle(int a) {
		System.out.println("circumference of circle " + (2 * (3.14 * (a))));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius");
		int radius = s.nextInt();
		circumference_of_circle(radius);
		s.close();
	}

}
