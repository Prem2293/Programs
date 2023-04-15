package Array;

public class P11_Distinct_EleMent {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		int[] b = { 10, 20, 40, 50, 60 };
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("distinct element first array" + a[i]);
			}
		}
		for (int i = 0; i < b.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {

				if (b[i] == a[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("distinct element second array " + b[i]);
			}
		}
	}

}
