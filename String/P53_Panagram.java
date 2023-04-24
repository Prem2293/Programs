package String;

public class P53_Panagram {
	public static void main(String[] args) {
		String a = "ab cde fgh ijkl mo pqrs tuv wxyz";
		char[] b = new char[26];
		boolean flag = true;

		for (int i = 0; i < a.length(); i++) {
			char u = a.charAt(i);
			if (u >= 'a' && u <= 'z') {
				b[u - 97] = 1;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("panagram");
		} else {
			System.out.println("not panagram");

		}
	}
}
