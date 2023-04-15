package Array_2D;

public class P4_Char_Array {
	public static void main(String[] args) {
		char[][] a= {{'a','b','c'},{'d','e','f'}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
