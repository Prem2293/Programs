package String;

//import java.util.Scanner;

public class P33_Replace_Char {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the string");
//		String a=s.next();
//		System.out.println("enter char to replace");
//		char r=s.next().charAt(0);
//		System.out.println("enter new char");
//		a=a.replace(r, s.next().charAt(0));
//		s.close();
//		System.out.println(a);

		String a = "String";
		char replace = 'r';
		char newchar = 'j';
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == replace) {
				b += newchar;
			} else {
				b += a.charAt(i);
			}
		}
		System.out.println(b);
	}
}
