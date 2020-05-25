package main.com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	
		//1. An empty string returns zero
		@Test
		public void emptyStringShouldReturnZero() {
			assertEquals(Calculator.sum(""),new Long(0));
		}
		

}
