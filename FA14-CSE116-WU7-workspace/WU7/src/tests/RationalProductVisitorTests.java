package tests;

import static org.junit.Assert.assertTrue;
import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

import org.junit.Test;

import code.Rational;

public class RationalProductVisitorTests {

	private int[] randomArray(boolean noZero, int min, int max, int length) {
		java.util.Random r = new java.util.Random();
		int [] array = new int[length];
		for (int i=0; i<length; i++) {
			int x;
			if (noZero) {
				do {
					x = min + r.nextInt((max-min)+1);
				} while (x == 0);
				array[i] = x;
			}
			else {
				array[i] = min + r.nextInt((max-min)+1);
			}
		}
		return array;
	}
	
	@Test public void test0() { int[] ns = randomArray(false, 1, 5, 3); int[] ds = randomArray(true, 1, 5, 3); tester(ns,ds); }
	@Test public void test1() { int[] ns = randomArray(false, 1, 5, 3); int[] ds = randomArray(true, 1, 5, 3); tester(ns,ds); }
	@Test public void test2() { int[] ns = randomArray(false, 1, 5, 3); int[] ds = randomArray(true, 1, 5, 3); tester(ns,ds); }
	@Test public void test3() { int[] ns = randomArray(false, 1, 5, 3); int[] ds = randomArray(true, 1, 5, 3); tester(ns,ds); }
	
	public void tester(int[] numerators, int[] denominators) {
		LRStruct<Rational> list = new LRStruct<Rational>();
		int numProd = 1;
		int denProd = 1;
		for (int i=0; i<numerators.length; i++) {
			numProd *= numerators[i];
			denProd *= denominators[i];
			list.insertFront(new Rational(numerators[i],denominators[i]));
		}
		Rational expected = new Rational(numProd,denProd);
		IAlgo<code.Rational, code.Rational, Object> visitor;
		visitor = new code.Visitor();
		Rational actual = list.execute(visitor, null);
		assertTrue("The product of "+list+" was expected to be "+expected+", but is your visitor computed it to be "+actual,
				expected.equals(actual));
	}

}
