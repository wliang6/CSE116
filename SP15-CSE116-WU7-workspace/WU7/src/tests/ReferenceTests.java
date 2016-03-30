package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

import code.Submission;

public class ReferenceTests {

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
	
	public void randomTest() {
		Random rand = new Random();
		HashSet<String> uniqueWords = new HashSet<String>();
		int wordSetSize = 4 + rand.nextInt(3);
		while (uniqueWords.size() < wordSetSize) {
			String word = "";
			int wordLength = rand.nextInt(3)+2; // length is 2, 3, or 4 
			for (int i=0; i<wordLength; i++) {
				word = word + (char) ('a' + rand.nextInt(26));
			}
			uniqueWords.add(word);
		}
		ArrayList<String> temp = new ArrayList<String>();
		int howMany = 0;
		String target = null;
		for (String w : uniqueWords) {
			howMany = 1 + rand.nextInt(5); // at least 1
			target = w;
			for (int i=0; i<howMany; i++) {
				temp.add(target);
			}
		}
		Collections.shuffle(temp);
		StringBuffer sb = new StringBuffer();
		for (String word : temp) {
			sb.append(word);
			sb.append(' ');
		}
		String input = sb.toString();
		int expected = howMany;
		Submission sol = new Submission();
		HashMap<String,Integer> map = sol.solution(input);
		int actual = map.get(target);
		assertTrue("\nI expected to count "+expected+" occurrences of \n\t"+target+"\nin\n\t"+input+"\nbut I counted "+actual+".", expected == actual);
	}
	
}	
