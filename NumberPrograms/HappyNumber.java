package looping_statement;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int sum = sum(s.nextInt());
		s.close();
		while (true) {
			sum = sum(sum);
			if (sum == 1) {
				System.out.println("happy number");
				break;
			} else if (sum < 10) {
				System.out.println("it is not happy number");
				break;
			}
		}
	}

	public static int sum(int a) {
		int sum = 0;
		for (int i = a; i > 0; i = i / 10) {
			sum += (i % 10) * (i % 10);
		}
		return sum;
	}
}
