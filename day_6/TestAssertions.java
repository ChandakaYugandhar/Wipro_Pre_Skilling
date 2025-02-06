package day_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void equalsCheck() {
		int result = 10+20;
		assertEquals(30,result);
	}
	
	@Test
	public void notEqualsCheck() {
		int result = 30-10;
		assertNotEquals(10,result);
	}
	
	@Test
	public void trueCheck() {
		int result = 2*3;
		assertTrue(result==6);
	}
	
	@Test
	public void falseCheck() {
		int result=10/5;
		assertFalse(result!=3);
	}
	
	@Test
	public void nullCheck() {
		String str=null;
		assertNull(str);
	}
	
	@Test
	
	public void notNullCheck() {
		int[] arr= {1,2,3,4};
		assertNotNull(arr);
	}
	
	
}
