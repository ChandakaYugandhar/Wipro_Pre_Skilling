package day_4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
//	static void display(String students) {
//		for(String student: students) {
//			System.out.println(student);
//		}
//	}

	public static void main(String[] args) {
		
		ArrayList<String> students=new ArrayList<String>();
		//adding elements to the students list using add()
		students.add("Yugandhar");
		students.add("Ravi");
		students.add("Mani");
		students.add("Karthik");
		students.add("Swaroop");
		
		System.out.println("Eelements before update the student list:");
		System.out.println("Size before update the student list: "+students.size());
		
		for(String student: students) {
			System.out.println(student);
		}
		//get a particular element from the students list using get()
		
		System.out.println("first element: "+students.get(0));
		System.out.println("second element: "+students.get(1));
		
		//insert the elements in middel of the students list by index add(index,"element")
		
		students.add(0,"Prasad");
		students.add(2,"Bharath");
		students.add(7,"Cse");
		
		
		System.out.println("Eelements after update the student list:");
		System.out.println("Size after update the student list: "+students.size());
		Iterator<String> list = students.iterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		//update the elements in students list by index using set(index,"element")

		students.set(7,"Ece");
		
		for(String student: students) {
			System.out.println(student);
		}
		
		
		//remove element form student list using remove(index)
		
		students.remove(7);
		
		System.out.println("Final students list: ");
		//ArrayListExample.display(students);
		for(String student: students) {
		System.out.println(student);
	}
	}

}
