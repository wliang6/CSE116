package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.solution;

public class tests {

//Method 1
	@Test	
	public void encode (){
		String string = "firefly";
		String expected = "sversyl";
		String actual = solution.encode(string);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected.equals(actual));
	}
	
	@Test
	public void encode1(){
		String string = "FIREFLY";
		String string2 = "ZEBRAS";
		String expected = "SFOASIX";
		String actual = solution.encode1(string, string2);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected.equals(actual));
	}
	
	
	
//Method 4
	 public void testCode(String input, String input2, Boolean expected){
	 Boolean actual = solution.anagram(input, input2);
	 assertTrue(""+actual, expected.equals(actual));
	 }
	
	@Test public void test1() {testCode("Tom Marvolo Riddle", "I am Lord Voldemort", true);}
	 @Test public void test2() {testCode("listen", "silent", true);}
	 @Test public void test3() {testCode("Dormitory", "Dirty room", true);}
	 @Test public void test4() {testCode("HELLO", "URYYB", false);}
	 
	 
	
//Method 5
	@Test
	public void swap(){
		int [] array = {1,2,3,4,5};
		int position1 = 0;
		int position2 = 3;
		int [] expected = {4,2,3,1,5};
		int [] actual = solution.swap(array, position1, position2);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected==actual);
	}

	
//Method 6
	
	public void zip(int [] array1, int [] array2, int [] expected){
		int[] actual = solution.zip(array1, array2);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected.equals(actual));
	}
	
	@Test
	public void zip1(){
		int [] array1 = {4,3,7,2,6};
		int [] array2 = {2,1,4,8,0};
		int [] expected = {4,2,3,1,7,4,2,8,6,0};
		zip(array1,array2,expected);
		}
	
	@Test
	public void zip2(){
		int [] array1 = {1,2,3};
		int [] array2 = {4,5,6};
		int [] expected = {1,4,2,5,3,6};
		zip(array1,array2,expected);
	}
	
//Method 7
	
	public void merge(int [] array1, int [] array2, int [] expected){
		int[] actual = solution.merge(array1, array2, expected);
		assertTrue("The expected answer should be " + expected + " but " + actual + 
				   " is returned.", expected.equals(actual));
	}
	@Test
	public void merge1(){
		int [] array1 = {1,2,5,6,7};
		int [] array2 = {2,3,8,9};
		int [] expected = {1,2,2,3,5,6,7,8,9};
		merge(array1,array2,expected);
	}
	
	@Test 	
	public void merge2(){
		int [] array1 = {4,3,7,2,6};
		int [] array2 = {2,1,4,8,0};
		int [] expected = {0,1,2,2,3,4,4,6,7,8};
		merge(array1,array2,expected);
	}
}
