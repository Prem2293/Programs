package Array;

public class P20_InsertAnElementInArray {
	public static void main(String[] args) {
		int[] a = { 9, 8, 25, 5 };
		int[] b = new int[a.length + 1];
		int pos = 2;
		int value = 255;
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (i == pos) {
				b[i] = value;
				continue;
			}
			b[i] = a[count++];
		}
	}
}
