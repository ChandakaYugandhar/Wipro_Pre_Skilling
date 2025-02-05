package day_5;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;
public class LambdaStringProcessingQ1 {
	
	@FunctionalInterface
	interface StringProcessor{
		String process(String str);
	}

	public static void main(String[] args) {
		List<String> fruits =Arrays.asList("Cherry","Watermelon","Apple","Grapes","Banana","Mango");
		
		System.out.println(fruits);
		fruits.sort((a,b)->b.compareTo(a));
		
		System.out.println(fruits);
		
		StringProcessor toUpperCaseString = String::toUpperCase;
		
		System.out.println("Uppercase fruits: ");
		fruits.forEach(fruit->System.out.println(toUpperCaseString.process(fruit)));
		
		

	}

}
