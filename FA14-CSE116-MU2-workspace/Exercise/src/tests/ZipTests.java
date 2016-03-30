package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import code.Zippers;

public class ZipTests {
	
	private static Zippers z = new Zippers();
	
	public void genericTest(int... zipped) {
		int[] r = new int[zipped.length / 2 + zipped.length % 2];
		int[] s = new int[zipped.length / 2];
		for (int i=0; i<zipped.length; i=i+2) {
			int k = i/2;
			if (k<r.length) { r[k] = zipped[i]; }
			if (k<s.length) { s[k] = zipped[i+1]; } 
		}
		String expected = Arrays.toString(zipped);
//		ArrayList<Integer> x = new ArrayList<Integer>();
//		for (int i : r) { x.add(i); }
//		ArrayList<Integer> y = new ArrayList<Integer>();
//		for (int i : s) { y.add(i); }
		String actual = Arrays.toString(z.zip(r,s));
		assertTrue("I zipped "+Arrays.toString(r)+" and "+Arrays.toString(s)+" expecting to get "+expected+", but I got "+actual,
				expected.equals(actual));
	}

	@Test public void test_01() { genericTest(1); }
	@Test public void test_02() { genericTest(1,2); }
	@Test public void test_03() { genericTest(1,2,3); }
	@Test public void test_04() { genericTest(1,2,3,4); }
	@Test public void test_05() { genericTest(1,2,3,4,5); }
	@Test public void test_06() { genericTest(1,2,3,4,5,6); }
	@Test public void test_07() { genericTest(randomIntegerArray(4,99)); }
	@Test public void test_08() { genericTest(randomIntegerArray(4,99)); }
	@Test public void test_09() { genericTest(randomIntegerArray(4,99)); }
	@Test public void test_10() { genericTest(randomIntegerArray(4,99)); }
	
	static int[] randomIntegerArray(int howMany, int max) {
		int[] array = new int[howMany];
		Random r = new Random();
		for (int i=0; i<howMany; i++) {
			array[i] = r.nextInt(max);
		}
		return array;
	}

}
