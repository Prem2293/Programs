package Array;

public class P1_Store_Char_Ascii {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			int[] b = new int[a + 1];
			b[a] = i;
			System.out.println(b[a]);
			++a;
		}

	}

}
