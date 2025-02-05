package day_5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CollctorsAPiPractice {

	public static void main(String[] args) {
		

		List<String> names = Arrays.asList("Yuggu","Siv Sai","Charan","Shyam","Srinu");
		Map<Character,List<String>> groupNames = names.stream()
				.collect(Collectors.groupingBy(name->name.charAt(0)));
		System.out.println(names);
		System.out.println(groupNames);
	}

}
