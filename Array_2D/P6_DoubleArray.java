package Array_2D;

public class P6_DoubleArray {
	public static void main(String[] args) {
		double[][] a= {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			} 
			System.out.println();
		}
	}

}
