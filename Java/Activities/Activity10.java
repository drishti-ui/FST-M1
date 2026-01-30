
package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println("hashset is : " +hs);
		
		System.out.println("Size of hashset : " + hs.size());
		
		System.out.println("Remove C from hashset : " + hs.remove("C"));
		
		if(hs.remove("U")) {
			System.out.println("U is removed from hashset");
		}
			else {
				System.out.println("U is not present in hashset");
			
		}
		
		System.out.println("Check if E is present in hashset : " + hs.contains("E"));
		
		System.out.println("Updated set : " + hs);

	}

}
