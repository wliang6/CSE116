package tests;
import static org.junit.Assert.*; 

import java.util.HashMap;

import org.junit.Test;

import code.solution;
public class solutiontests {
	
	
//Method 1 - 
//common method
public void drypaintsandwipe(String a, boolean expected){
	solution s = new solution();
	boolean actual = s.drypaintsandwipe(a);
	assertTrue("", actual == expected);
}
	@Test
	public void drypaintsandwipe_test1(){ drypaintsandwipe("DPSW", false);}
	@Test 
	public void drypaintsandwipe_test2(){ drypaintsandwipe("PDSW", true);}
	@Test 
	public void drypaintsandwipe_test3(){ drypaintsandwipe("SWP", true);}
	@Test
	public void drypaintsandwipe_test4(){ drypaintsandwipe("SWS", true);}
	@Test
	public void drypaintsandwipe_test5(){ drypaintsandwipe("SWPSW", true);}
	@Test
	public void drypaintsandwipe_test6(){ drypaintsandwipe("SWPD", true);}
	@Test
	public void drypaintsandwipe_test7(){ drypaintsandwipe("PD", true);}
	@Test
	public void drypaintsandwipe_test8(){ drypaintsandwipe("WPS", false);}
	@Test
	public void drypaintsandwipe_test9(){ drypaintsandwipe("PPSS", false);}
	@Test
	public void drypaintsandwipe_test10(){ drypaintsandwipe("123a", false);}
	

	
	




public void accept1method(String a, HashMap<String,Integer> expected){
	solution b3 = new solution();
	HashMap<String,Integer> out = b3.accept1("/home/mtdue/wliang6/example.txt");
	assertTrue("blah", out.get("foo") == 1);
	assertTrue("blah", out.get("bar") == 2);
	assertTrue("blah", out.get("baz") == 1);
}
}
