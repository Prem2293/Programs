package Array;

public class P42_ZigZag_Array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 88 };
		int[] b = { 5, 6, 7, 8, 22 };
		int[] c = new int[a.length + b.length];
		int a_index = 0;
		int b_index = 0;
		for (int i = 0; i < c.length;) {

			if (a_index < a.length) {
				c[i] = a[a_index++];
				i++;

			}
			if (b_index < b.length) {
				c[i] = b[b_index++];
				i++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
