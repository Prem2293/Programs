package Program1;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<PersonDetails> a=new ArrayList<PersonDetails>();
		a.add(new PersonDetails(24, "Nikhlya"));
		a.add(new PersonDetails(26, "Nonstatic"));
		a.add(new PersonDetails(29, "Kaus tube"));
		for (PersonDetails personDetails : a) {
			if (personDetails.age%2==0) {
				System.out.print("Age :"+personDetails.age+" ");
				System.out.println("Name :"+personDetails.name);
			}
			
		}
	}

}
