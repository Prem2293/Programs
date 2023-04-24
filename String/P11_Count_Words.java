package String;

public class P11_Count_Words {
	public static void main(String[] args) {
		String a = "hello world my name is Testyantra";
		int count = 1;

		for (int i = 0; i < a.length()-1; i++) {
			if (a.charAt(i) == ' ' && a.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println("Number of words is :" + count);
	}

}
