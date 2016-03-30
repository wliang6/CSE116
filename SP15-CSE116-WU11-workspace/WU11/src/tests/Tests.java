package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import code.BRStruct;
import code.Visitor;

public class Tests {
	
	private class Pair<A,B> {
		public A a;
		public B b;
		public Pair(A a, B b) {
			this.a = a;  this.b = b;
		}
	}

	private Visitor v;
	private BRStruct<String> tree;
	private String LETTERS = "abcdefghijklmnopqrstuvwxyz \t\n";
	private Random random = new Random();

	private String random(int minLength, int maxLength) {
		String s = "";
		int length = minLength + random.nextInt(maxLength-minLength+1);
		for (int i=0; i<length; i++) {
			int r = random.nextInt(LETTERS.length());
			s += LETTERS.charAt(r);
		}
		return s;
	}
	
	private Pair<String,BRStruct<String>> randomTree(int number, int max) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Number: "+number);
		for (int i=0; i<number; i++) {
			list.add(random(1,max-1));
			System.out.println("   ["+number+"] list: "+list);
		}
		String answer = random(max,max);
		list.add(answer);
		Collections.shuffle(list);
		System.out.println("answer: "+answer+", list is "+list);
		BST<String> tree = new BST<String>();
		for (String s : list) {
			tree.insert(s);
		}
		return new Pair<String,BRStruct<String>>(answer,tree.getTree());
	}
	
	@Before public void setUp() {
		v = new Visitor();
		tree = new BRStruct<String>();		
	}
	
	public void randomTest() {
		Pair<String,BRStruct<String>> pair = randomTree(random.nextInt(6), 5+random.nextInt(8));
		tree = pair.b;
		String expected = pair.a;
		String actual = tree.execute(v, null);
		assertTrue("tree: "+tree+", expected: '" + expected+"', actual: '"+actual+"'.",
				expected.equals(actual));
	}
	
	@Test public void test00() { randomTest(); }
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
	@Test public void test11() { randomTest(); }
	@Test public void test12() { randomTest(); }
	@Test public void test13() { randomTest(); }
	@Test public void test14() { randomTest(); }
	@Test public void test15() { randomTest(); }
	@Test public void test16() { randomTest(); }
	@Test public void test17() { randomTest(); }
	@Test public void test18() { randomTest(); }
	@Test public void test19() { randomTest(); }
}