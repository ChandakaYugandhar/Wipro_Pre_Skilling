package day_4;

import java.util.HashSet;
public class HashSetAssessment {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Vizianagaram");
		cities.add("Kolkata");
		cities.add("Delhi");
		cities.add("vizianagaram");
		
		System.out.println(cities);
		
		System.out.println("Cities contains Hyderabad? "+cities.contains("Hyderabad"));
		
		cities.remove("Mumbai");
		
		for(String city: cities) {
			System.out.println(city);
		}
	}

}
