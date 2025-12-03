package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Ram");
		names.add("Raj");
		names.add("Kevin");
		names.add("John");
		names.add("Peter");
		
		for (int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("3rd name in the ArrayList : " + names.get(2));
		
		System.out.println("Check if John is present in arraylist : " + names.contains("John"));
		
		System.out.println("Arraylist is  :" + names.size());
		
		names.remove(3);
		System.out.println("New size of arraylist :" + names.size());

			
	}

}
