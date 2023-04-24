package String;

public class P34_Reverse {
	public static void main(String[] args) {
		String a="hello";
		String rev="";
		for (int i = a.length()-1; i >=0; i--) {
			rev+=a.charAt(i);
		}
		System.out.println(rev);
	}

}
