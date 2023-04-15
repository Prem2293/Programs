package Array;

public class P38_Reverse_Of_Array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int b[] = new int[a.length];
		int index = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			b[i]=a[index--];
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}
}
