package day_4;

import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer,String> days= new HashMap<Integer,String>();
		
		days.put(1, "Sunday");
		days.put(2,"Monday");
		days.put(3,"Tuesday");
		days.put(4,"Wednesday");
		days.put(5,"Thursday");
		days.put(6,"Friday");
		days.put(7, "Saturday");
		
		
		System.out.println(days);
		System.out.println("keys:");
		for(Integer day: days.keySet()) {
			System.out.println(day);
		}
		
		System.out.println("Values:");
		for(String day: days.values()) {
			System.out.println(day);
		}
		
		System.out.println("keys and Values:");

		for(Map.Entry<Integer,String> day: days.entrySet()) {
			System.out.println(day.getKey()+" : "+day.getValue());
		}
	}

}
