package day_5;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DataAndTimeAPIPracitce {

	public static void main(String[] args) {
		
		System.out.println("Time: "+LocalTime.now());
		LocalDate date = LocalDate.now();
		System.out.println("Date: "+date);
		System.out.println("Formatted Date: "+date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println("Formatted Date: "+date.format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
		System.out.println("Formatted Date: "+date.format(DateTimeFormatter.ofPattern(" E dd-MMM-yyyy")));
		System.out.println("Date and Time: "+LocalDateTime.now());
		
	}

}
