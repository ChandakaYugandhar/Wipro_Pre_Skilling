package day_5;

import java.util.Optional;
public class OptionalClassPractice {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		
		String result = optional.orElse("Default value");
		System.out.println(result);
		
		Optional<String> cityDefault= Optional.ofNullable("Vizianagaram");
		String city = cityDefault.orElse("Hyderabad");
		
		System.out.println("City: "+city);

	}

}
