package day_6;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestPractice {
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,9})
	
	void testParameterized(int number) {
		assertTrue(number % 2 ==0);
	}

}
