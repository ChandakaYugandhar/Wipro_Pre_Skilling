package day_5;

import java.util.function.*;
public class FunctionalInterfacesPractice {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (n)->n%2==0;
		
		System.out.println(isEven.test(1));
		System.out.println(isEven.test(2));
		System.out.println(isEven.test(3));
		
		
		Function<String,Integer> length = s -> s.length();
		String str = "Java";
		System.out.println(str);
		System.out.println("length of "+str+" is: "+length.apply(str));
		
		Consumer<String> print = s->System.out.println(s);
		
		print.accept("Hello, world!");
		
		Supplier<Double> randomNumber= ()->Math.random();
		
		System.out.println("Random number: "+randomNumber.get()*101);
	}

}
