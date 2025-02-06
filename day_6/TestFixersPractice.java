package day_6;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.Test;

public class TestFixersPractice {
	@BeforeEach
	
	public void beforeTest() {
		System.out.println("It runs bofore each test case");
	}
	
	@Test
	
	public void add() {
		int result = 100+200;
		assertEquals(300,result);
		assertNotEquals(300,result);
	}
	
	@AfterEach
	
	public void afterTest() {
		System.out.println("It runs after each test case");
	}

}
