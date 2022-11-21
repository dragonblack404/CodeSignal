package dad.codesignal03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.SmoothSailing;

public class IsLucky {

	SmoothSailing ss;

	@Before
	public void setUp() throws Exception {
		ss = new SmoothSailing();
	}

	@Test
	public void test01() {
		int n = 1230;
		assertTrue(ss.isLucky(n));
	}
	
	@Test
	public void test02() {
		int n = 239017;
		assertFalse(ss.isLucky(n));
	}
	
	@Test
	public void test03() {
		int n = 134008;
		assertTrue(ss.isLucky(n));
	}
	
	@Test
	public void test04() {
		int n = 10;
		assertFalse(ss.isLucky(n));
	}
	
	@Test
	public void test05() {
		int n = 11;
		assertTrue(ss.isLucky(n));
	}
	
	@Test
	public void test06() {
		int n = 1010;
		assertTrue(ss.isLucky(n));
	}
	
	@Test
	public void test07() {
		int n = 261534;
		assertFalse(ss.isLucky(n));
	}
	
	@Test
	public void test08() {
		int n = 100000;
		assertFalse(ss.isLucky(n));
	}
	
	@Test
	public void test09() {
		int n = 999999;
		assertTrue(ss.isLucky(n));
	}
	
	@Test
	public void test10() {
		int n = 123321;
		assertTrue(ss.isLucky(n));
	}

}
