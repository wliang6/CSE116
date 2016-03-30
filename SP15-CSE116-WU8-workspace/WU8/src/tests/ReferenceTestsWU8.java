package tests;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import lrstruct.LRStruct;

import org.junit.Test;

import code.Visitor;

public class ReferenceTestsWU8 {

	private Random _rand;
	@Test public void test01() { randomTest(); }
	@Test public void test02() { randomTest(); }
	@Test public void test03() { randomTest(); }
	@Test public void test04() { randomTest(); }
	@Test public void test05() { randomTest(); }
	@Test public void test06() { randomTest(); }
	@Test public void test07() { randomTest(); }
	@Test public void test08() { randomTest(); }
	@Test public void test09() { randomTest(); }
	@Test public void test10() { randomTest(); }
	
	public ReferenceTestsWU8() {
		_rand = new Random();
	}
	
	public void randomTest() {
		LRStruct<String> list = new LRStruct<String>();
		int wordSetSize = _rand.nextInt(20); // set size is 0-19
		int expected = 0;
		for (int i=0; i<wordSetSize; i++) {
			String word = randomString();
			list.insertFront(word);
			expected += word.length();
		}
		Visitor sol = new Visitor();
		int actual = list.execute(sol, null);
		assertTrue(list+" contains "+expected+" characters, but the computer answer was "+actual,
				expected == actual);
	}
	private String randomString() {
		StringBuffer word = new StringBuffer();
		int wordLength = _rand.nextInt(8); // length is 0-7 
		for (int i=0; i<wordLength; i++) {
			word.append((char) ('a' + _rand.nextInt(26)));
		}
		return word.toString();
	}
	
}	
