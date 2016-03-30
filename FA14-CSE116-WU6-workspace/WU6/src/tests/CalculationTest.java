package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Cart;
import code.NonTaxable;
import code.Taxable;

public class CalculationTest {

	public static Taxable STEREO = new Taxable(30000);
	public static Taxable SHOES = new Taxable(10000);
	public static NonTaxable MILK = new NonTaxable(200);
	public static NonTaxable FISH = new NonTaxable(600);
	public static Taxable JACKET = new Taxable(15000);
	public static NonTaxable BREAD = new NonTaxable(299);
	
	@Test public void testTaxComputationEmptyCart() {
		Cart c = new Cart();
		int expected = 0;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationTaxableOnlyOneInCart() {
		Cart c = new Cart();
		c.add(new Taxable(1000,8));
		int expected = 80;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationNonTaxableOnlyOneInCart() {
		Cart c = new Cart();
		c.add(new NonTaxable(1000));
		int expected = 0;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationTaxableOnlyInCart_1() {
		Cart c = new Cart();
		Taxable.RATE = 10;
		c.add(new Taxable(10000));
		c.add(new Taxable(10000));
		c.add(new Taxable(10000));
		int expected = 3000;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationTaxableOnlyInCart_2() {
		Cart c = new Cart();
		Taxable.RATE = 10;
		c.add(SHOES);
		c.add(SHOES);
		c.add(SHOES);
		int expected = 3000;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationNonTaxableOnlyInCart() {
		Cart c = new Cart();
		c.add(MILK);
		c.add(MILK);
		c.add(MILK);
		c.add(FISH);
		c.add(BREAD);
		int expected = 0;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

	@Test public void testTaxComputationMixedCart() {
		Cart c = new Cart();
		Taxable.RATE = 10;
		c.add(SHOES);
		c.add(BREAD);
		c.add(FISH);
		c.add(STEREO);
		c.add(MILK);
		int expected = 4000;
		int actual = c.taxDue();
		assertTrue("I expected "+expected+", but the computed answer was "+actual, expected==actual);
	}

}
