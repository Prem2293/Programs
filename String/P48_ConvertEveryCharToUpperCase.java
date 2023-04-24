package String;

public class P48_ConvertEveryCharToUpperCase {
	public static void main(String[] args) {
		String a="hello 7his $tet";
		String b="";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='a'&&a.charAt(i)<='z') {
				b+=(char) (a.charAt(i)-32);
			}else {
				b+=a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
