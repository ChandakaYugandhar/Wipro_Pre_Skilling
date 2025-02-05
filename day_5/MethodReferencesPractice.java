package day_5;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;
public class MethodReferencesPractice {
	MethodReferencesPractice(){
		System.out.println("This for test constructor reference");
	}

	public static void main(String[] args) {
		//Static method reference
		Function<Integer,Double> sqrtfun = Math::sqrt;
		System.out.println(sqrtfun.apply(25));
		
		//Instance method reference
		String message = "hello";
		System.out.println(message);
		Supplier<String> toUpperCase = message::toUpperCase;
		System.out.println("Upper Case: "+toUpperCase.get());
		
		//Instance method reference Aribitrary Object
		List<String> names = Arrays.asList("Yuganhar","Ravi","Swaroop","Karthik");
		names.forEach(System.out::println);
		
		//constructor reference
		
		Supplier<MethodReferencesPractice> constRef = MethodReferencesPractice::new;
		MethodReferencesPractice mr = constRef.get();
		System.out.println(mr);
	}

}
