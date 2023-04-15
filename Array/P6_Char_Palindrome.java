package Array;

public class P6_Char_Palindrome {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'b', 'a' };
		int start = 0;
		int end = a.length - 1;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[start] == a[end]) {
				flag = true;
				start++;
				end--;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("palindrome array");
		} else {
			System.out.println("not a palindrome array");
		}
	}

}
