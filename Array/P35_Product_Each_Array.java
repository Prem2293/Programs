package Array;

public class P35_Product_Each_Array {
	public static void main(String[] args) {
		int[] a= {2,3,4,5};
		int prod=1;
		for (int i = 0; i < a.length; i++) {
			prod *=a[i];
		}
		System.out.println("product is "+prod);
	}

}
