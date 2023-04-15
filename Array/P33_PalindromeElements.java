package Array;

public class P33_PalindromeElements {
	public static void main(String[] args) {
		int[] a = { 11, 4444, 25, 232 };
		for (int i = 0; i < a.length; i++) {
//			check(a[i]);
			int reverse = 0;
			int reminder = 0;

			for (int j = a[i]; j > 0; j = j / 10) {
				reminder = j % 10;
				reverse = reverse * 10 + (reminder);
			}

			if (a[i] == reverse) {
				System.out.println(a[i] + " number is palindrome " + reverse);
			} else {
				System.out.println(a[i] + " number is not palindrome " + reverse);
			}
		}
	}

	public static void check(int a) {
		int reverse = 0;
		int reminder = 0;
		for (int i = a; i > 0; i = i / 10) {
			reminder = i % 10;
			reverse = reverse * 10 + (reminder);
		}
		if (a == reverse) {
			System.out.println(a + " number is palindrome " + reverse);
		} else {
			System.out.println(a + " number is not palindrome " + reverse);
		}
	}

}
