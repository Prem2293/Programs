package Array;

public class P29 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 1, 2, 8 };
		int value = 2;
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				count++;
			}
			if (count == 2) {
				System.out.println("value " + a[i] + " is present at index " + i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("element not occured");
		}
	}
}
