package day_4;

import java.util.Vector;
public class VectorPractice {

	public static void main(String[] args) {
		
		Vector<String> fruits = new Vector<String>(5);
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Cherry");
		fruits.add("Pineapple");
		System.out.println(fruits);
		
		System.out.println("Size of fruits: "+fruits.size());
		System.out.println("Capacity of fruits: "+fruits.capacity());
		
		fruits.add(1,"Watermelon");
		fruits.add("grapes");
		
		System.out.println("After add Size of fruits: "+fruits.size());
		System.out.println("After add Capacity of fruits: "+fruits.capacity());
		
		System.out.println("First fruit: "+fruits.getFirst());
		System.out.println("Last fruit: "+fruits.getLast());
		
		System.out.println("Position of Mango: "+fruits.indexOf("Mango"));
		
		System.out.println("fruits contians Apple? "+fruits.contains("Apple"));

	}

}
