

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void test2factorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(2);
		assertEquals("2! = 2", 2, actual, 0.0);
	}
	@Test
	public void test5factorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(5);
		assertEquals("5! = 120", 120, actual, 0.0);
	}
	@Test
	public void test12factorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(12);
		assertEquals("12! = 479001600", 479001600, actual, 0.0);
	}

	@Test
	public void testBinarySearch1() {
		MyCalculator mc = new MyCalculator();
		int[] a = {1,3,5,6,7,10,12,15};
		int x = 8;
		
		int actual = mc.binarySearch(a, x);
		assertEquals("Find 5.", 1, actual, 0.0);
	}
	@Test
	public void testBinarySearch2() {
		MyCalculator mc = new MyCalculator();
		int[] a = {1,3,5,6,7,10,12,15};
		int x = 8;
		
		int actual = mc.binarySearch(a, x);
		assertEquals("Find 5.", -1, actual, 0.0);
	}
	@Test
	public void testBinarySearch3() {
		MyCalculator mc = new MyCalculator();
		int[] a = {1,3,5,6,7,10,12,15};
		int x = 8;
		
		int actual = mc.binarySearch(a, x);
		assertEquals("Find 5.", -1, actual, 0.0);
	}

}
