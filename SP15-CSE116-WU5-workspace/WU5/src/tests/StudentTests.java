package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import code.Submission;

public class StudentTests {
	
public void commoncode(String s, int expected){
	int actual = Submission.solution(s);
	assertTrue("", expected == actual);
	}

@Test
public void test1(){commoncode("M", 1);}
@Test
public void test2(){commoncode("MX", 1);}
@Test
public void test3(){commoncode("MXMM", 2);}
@Test
public void test4(){commoncode("MXMMXM", 3);}
@Test
public void test5(){commoncode("", 1);}
}


