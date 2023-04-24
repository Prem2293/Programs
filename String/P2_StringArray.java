package String;

public class P2_StringArray {
	public static void main(String[] args) {
		String a="hello";
		char[] b=a.toCharArray();
		int count=0;
		for (int i = 0; i < b.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
