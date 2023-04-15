package Array;

public class P12_CheckElements {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;

			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(a[i] + " Is Present In Array");
			} else {
				System.out.println(a[i] + " Is Not Present In Array");
			}
		}
	}

}
