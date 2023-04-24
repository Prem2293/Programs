package String;

public class P47_DistinctChar {
	public static void main(String[] args) {
		String a = "hello";
		for (int i = 0; i < a.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j) && i != j) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("unique element is "+a.charAt(i));
			}
		}
	}
}
