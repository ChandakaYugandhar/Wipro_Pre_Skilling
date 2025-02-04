package day_4;

import java.util.LinkedList;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> animals = new LinkedList<String>();
		
		//we can use all ArrayList methods here
		
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Goat");
		animals.add("Lion");
		animals.add("Tiger");
		
		System.out.println(animals);
		animals.addFirst("Cat");
		System.out.println(animals);
		animals.addLast("Deer");
		System.out.println(animals);
		
		System.out.println("First animal: "+animals.getFirst());
		System.out.println("Last animal: "+animals.getLast());
		
		System.out.println("After remove First animal:"+animals.removeFirst());
		System.out.println(animals);
		
		System.out.println("After remove last animal: "+animals.removeLast());
		System.out.println(animals);
		
		System.out.println("Final animal list:");
		System.out.println(animals);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
