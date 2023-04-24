package String;

public class P22_PrintLast_4_char {
	public static void main(String[] args) {
		String city="Pune";
		if (city.length()>=4) {
			for (int i = city.length()-4; i < city.length(); i++) {
				System.out.print(city.charAt(i));
			}
		} else {
			System.out.println("sorry city has lest characters");
		}
		
	}
}
