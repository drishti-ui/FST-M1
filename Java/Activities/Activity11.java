package activities;

import java.util.HashMap;


public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> colours =  new HashMap<>();
		colours.put(1, "Red");
		colours.put(2, "Orange");
		colours.put(3, "Blue");
		colours.put(4, "Black");
		colours.put(5, "Yellow");
		
		System.out.println("Colors in the map : " + colours);
		
		System.out.println("Remove Red color : " + colours.remove(1));
		
		if(colours.containsValue("Green")) {
			System.out.println("Green is present in Map");
		}
		else {
			System.out.println("Green is not present in Map");	
		}
		
		System.out.println("Size of the map : " + colours.size());
	}

}