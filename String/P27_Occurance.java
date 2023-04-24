package String;

public class P27_Occurance {
	public static void main(String[] args) {
		String a = "hello";
		char v='e';
		int b=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)==v) {
				b++;
			}
		}
		if (b>0) {
			System.out.println("given character is present in String ");
		}else {
			System.out.println("given character is not present in String");

		}
	}

}
