package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ReferenceTests {

	private code.WriteUp _class;

	public String hashMapsAreTheSame(HashMap<String,Integer> a, HashMap<String,Integer> b) {
		String diff = "";
		Set<String> aKeySet = a.keySet();
		Set<String> bKeySet = b.keySet();
		if (!aKeySet.equals(bKeySet)) {
			ArrayList<String> al = new ArrayList<String>(aKeySet);
			ArrayList<String> bl = new ArrayList<String>(bKeySet);
			al.removeAll(bKeySet);
			bl.removeAll(aKeySet);
			diff += "\nThe keysets differ: ";
			if (!al.isEmpty()) {
				diff += "\n\t***********************************************************************";
				diff += "\n\tExpected answer has these extra keys (words that your solution missed):"; 
				for (String s : al) {
					diff += "\n\t\t\""+s+"\"";
				}
			}
			if (!bl.isEmpty()) {
				diff += "\n\t**************************************************************************";
				diff += "\n\tComputed answer has these extra keys (non-words that your solution found):"; 
				for (String s : bl) {
					diff += "\n\t\t\""+s+"\"";
				}
			}
		}
		else { // keysets are the same, check counts
			String diffValues = "";
			for (String s : aKeySet) {
				int aCount = a.get(s);
				int bCount = b.get(s);
				if (aCount != bCount) {
					diffValues += "\n\tfor key \""+s+"\", expected count is "+aCount+" while computed count is "+bCount+".";
				}
			}
			if (diffValues.length() != 0) {
				diff = "\nThe computed counts differ as follows:"+diffValues;
			}
		}
		return diff;
	}

	@Before
	public void setup() {
		_class = new code.WriteUp();
	}

	@Test public void count_test_01() {
		String s = "SampleInputFiles/SampleTextFile1.txt";
		HashMap<String,Integer> expected = new code.Solution().solution(s);
		HashMap<String,Integer> actual = _class.solution(s);
		testRunner(expected,actual);
	}

	@Test public void count_test_02() {
		String s = "SampleInputFiles/SampleTextFile2.txt";
		HashMap<String,Integer> expected = new code.Solution().solution(s);
		HashMap<String,Integer> actual = _class.solution(s);
		testRunner(expected,actual);
	}

	@Test public void count_test_03() {
		String s = "SampleInputFiles/SampleTextFile3.txt";
		HashMap<String,Integer> expected = new code.Solution().solution(s);
		HashMap<String,Integer> actual = _class.solution(s);
		testRunner(expected,actual);
	}

	@Test public void count_test_04() {
		String s = "SampleInputFiles/SampleTextFile4.txt";
		HashMap<String,Integer> expected = new code.Solution().solution(s);
		HashMap<String,Integer> actual = _class.solution(s);
		testRunner(expected,actual);
	}

	@Test public void count_test_05() {
		String s = "SampleInputFiles/SampleTextFile5.txt";
		HashMap<String,Integer> expected = new code.Solution().solution(s);
		HashMap<String,Integer> actual = _class.solution(s);
		testRunner(expected,actual);
	}

	private void testRunner(HashMap<String, Integer> expected, HashMap<String, Integer> actual) {
		String difference = this.hashMapsAreTheSame(expected, actual);
		assertTrue(difference, difference.equals(""));
	}

}
