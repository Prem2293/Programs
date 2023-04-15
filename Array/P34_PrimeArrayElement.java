package Array;

public class P34_PrimeArrayElement {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(a[i] + " number is prime");
			} else {
				System.out.println(a[i] + " number is not prime");
			}

//			check(a[i]);
		}
	}

	public static void check(int a) {
		int count = 1;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(a + " number is prime");
		} else {
			System.out.println(a + " number is not prime");
		}

	}

}
