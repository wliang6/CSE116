package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ReferenceTests {
	
	private code.WriteUp _class;
	
	private void testOfSolution(String s, char c, boolean expected) {
		boolean actual = _class.solution(s,c);
		assertTrue("solution(\""+s+"\", '"+c+"') should be '"+expected+"' but was '"+actual+"',",
				expected == actual);
	}

	@Before public void setup() {
		_class = new code.WriteUp();
	}
	
	@Test public void testOfSolution_00() { testOfSolution(null, 'a', false); }
	@Test public void testOfSolution_01() { testOfSolution("", 'a', false); }
	@Test public void testOfSolution_02() { testOfSolution("an aardvark is able", 'a', true); }
	@Test public void testOfSolution_03() { testOfSolution("b..b..blistering blue barnacles", 'b', false); }
	@Test public void testOfSolution_04() { testOfSolution("AAAb", 'a', false); }
	@Test public void testOfSolution_05() { testOfSolution("AAAb", 'A', true); }
	@Test public void testOfSolution_06() { testOfSolution("cde", 'e', false); }
	@Test public void testOfSolution_07() { testOfSolution("creepy crawlies", 'e', true); }
	@Test public void testOfSolution_08() { testOfSolution("bookkeeping", 'b', false); }
	@Test public void testOfSolution_09() { testOfSolution("bookkeeping", 'o', true); }
	@Test public void testOfSolution_10() { testOfSolution("bookkeeping", 'k', true); }
	@Test public void testOfSolution_11() { testOfSolution("bookkeeping", 'e', true); }
	@Test public void testOfSolution_12() { testOfSolution("bookkeeping", 'z', false); }
}
