package day_4;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> branches =new HashSet<String>();
		branches.add("CSE");
		branches.add("ECE");
		branches.add("MECH");
		branches.add("CSE");
		branches.add("CIVIL");
		branches.add("EEE");
		branches.add("ECE");
		
		
//	for(String branch: branches) {
//		System.out.println(branch);
//	}
		System.out.println(branches);
		
		System.out.println("Size of branches: "+branches.size());
		
		System.out.println("branches contains CSE: "+branches.contains("CSE"));
		
		branches.remove("EEE");
		
//		branches.clear();
		
		
		
	}
	
}
