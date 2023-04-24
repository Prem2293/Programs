package String;

public class P35_SepratedByComma {
	public static void main(String[] args) {
		String a = "hello,world,";
		String n = "";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ',') {
				System.out.println(n.charAt(0)+""+n.charAt(n.length()-1));
				n = "";
			}
			if (a.charAt(i)!=',') {
				n += a.charAt(i);
			}
		}
	}

}
