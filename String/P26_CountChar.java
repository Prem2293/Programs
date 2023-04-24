package String;

public class P26_CountChar {
	public static void main(String[] args) {
		String a="hello238";
		int charcount=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='a'&& a.charAt(i)<='z') {
				charcount++;
				System.out.print(a.charAt(i));
			}
		}
		System.out.println("character count is "+charcount);
	}

}
