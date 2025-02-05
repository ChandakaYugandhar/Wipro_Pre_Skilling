package day_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPIPractice {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(35,24,50,47,10);
		//using Lambda
		marks.forEach(mark->System.out.println(mark));
		
		//using method reference
		marks.forEach(System.out::println);
		
		List<Integer> pass = marks.stream()
				.filter(mark->mark>20)
				.collect(Collectors.toList());
		System.out.println("Passed students marks: ");
		System.out.println(pass);
	}

}
