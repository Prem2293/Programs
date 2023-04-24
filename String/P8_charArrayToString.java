package String;

public class P8_charArrayToString {
	public static void main(String[] args) {
		char[] a= {'a','b','c'};
		String b="";
		for (int i = 0; i < a.length; i++) {
			b+=a[i];
		}
		System.out.println(b);
		
	}
}
