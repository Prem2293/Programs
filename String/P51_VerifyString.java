package String;

public class P51_VerifyString {
	public static void main(String[] args) {
		String a="15d9h982";
		boolean flag=false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='0'&& a.charAt(i)<='9') {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println("String contains numbers only");
		} else {
			System.out.println("String does contains numbers only");
		}
	}

}
