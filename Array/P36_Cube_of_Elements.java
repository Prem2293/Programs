package Array;

public class P36_Cube_of_Elements {
	public static void main(String[] args) {
		int[] a= {2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
			int prod=1;
			for (int j = 0; j < 3; j++) {
				prod *=a[i];
			}
			System.out.println(" cube of "+a[i]+" is "+prod);
		}
	}

}
