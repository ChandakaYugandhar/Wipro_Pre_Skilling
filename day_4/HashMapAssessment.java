package day_4;

import java.util.HashMap;
import java.util.Map;
public class HashMapAssessment {

	public static void main(String[] args) {
		
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		
		students.put(101, "Yugandhar");
		students.put(102, "Ravi Kumar");
		students.put(106, "Charan");
		students.put(103, "Swaroop");
		students.put(104, "Karthik");
		students.put(105, "Manibabu");
		
		System.out.println(students);
		
		System.out.println("Student with id 102: "+students.get(102));
		
		students.remove(106);
		System.out.println(students);
		System.out.println("Student Records: ");
		for(Map.Entry<Integer,String> student : students.entrySet()) {
			System.out.println("Id: "+student.getKey()+" "+"Name: "+student.getValue());
		}
		
	}

}
