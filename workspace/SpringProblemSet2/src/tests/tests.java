package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import code.solution;

public class tests{

//test that accepts a string and int as inputs ex. (010101, 2) and returns the 
	//base 10 interpretation of the String
	public void method1(String numbers, int index, int expected){
		int actual = solution.x2ten(numbers, index);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected == actual);
	}
	
	@Test
	public void method1a(){
		method1("1101", 2, 13);
	}
	
	@Test 
	public void method1b(){
		method1("101", 2, 5);
	}
	
	@Test
	public void method1c(){
		method1("A", 36, 10);
	}
	
	@Test
	public void method1d(){
		method1("Z", 36, 35);
	}

	@Test
	public void method1e(){
		method1("!", 36, -1);
	}
	
	
//test for 2nd method
	
	public void method2(int x, int y, String expected){
		String actual = solution.ten2x(x, y);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected.equals(actual));
		
	}
	
	@Test
	public void method2a(){
		method2(101, 2, "5");
	}
	
	
	
	
	
	
//test for finding the sum of all integers in a string (that has both letters and numbers)
	@Test
	public void method3a (){
		String str = "1234";
		int expected = 10;
		int actual = solution.sumOfDigits(str);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected == actual);
		
	}
	
	@Test
	public void method3b (){
		String str = "123a b";
		int expected = 6;
		int actual = solution.sumOfDigits(str);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected == actual);
	}
	
	
	

//test for finding largest value in an array
	@Test
	public void method5 (){
	int [] array = {1, 3, 5, 4, 7, 10};
	int expected = 10;
	int actual = solution.largest(array);
	assertTrue("The expected answer should be " + expected + " but " + actual + 
			   " is returned.", expected == actual);
	}


//test for finding the index of largest value in an array
	@Test
	public void method6 (){
		int [] array = {35, 10, 98, 67, 100, 2, 0};
		int expected = 4;
		int actual = solution.indexOfLargest(array);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				" is returned.", expected == actual);
	}
	
	
	
	
//test for returning array of int size 27 (ex. a / A is position 0, Z / z is position 26, 
	//nonalphabetical characters are in position 27
	@Test
	public void method7 (){
		String n = "baaa!";
		int [] expected = {3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		int [] actual = solution.countAll(n);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				" is returned.", expected == actual);
	}
	
	@Test
	public void method7a (){
		String n = "!";
		int [] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		int
		[] actual = solution.countAll(n);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				" is returned.", expected == actual);
	}
}
	
