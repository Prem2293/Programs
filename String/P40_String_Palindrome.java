package String;

public class P40_String_Palindrome {
	public static void main(String[] args) {
		String a="mom";
		String b="";
		for (int i = a.length()-1; i >=0; i--) {
			b+=a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("it is palindrome string");
		}else {
			System.out.println("it is not palindrome string");
		}
	}
}
