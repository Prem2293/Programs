package String;

public class P54_RemoveAllOccurance {
	public static void main(String[] args) {
		String a="hello";
		String b="";
		char g='l';
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)!=g) {
				b+=a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
