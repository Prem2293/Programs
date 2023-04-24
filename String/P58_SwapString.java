package String;

public class P58_SwapString {
	public static void main(String[] args) {
		String a="hello";
		String b="";
		String c="bye";
		System.out.println("before");
		System.out.println("value of a "+a);
		System.out.println("value of c "+c);
		b=a;
		a=c;
		c=b;
		a.charAt(0);
		System.out.println("after");
		System.out.println("value of a "+a);
		System.out.println("value of c "+c);
	}

}
