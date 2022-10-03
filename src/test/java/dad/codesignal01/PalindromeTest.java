package dad.codesignal01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;

public class PalindromeTest {

	private TheJourneyBegins tjb;

	@Before
	public void setUp() throws Exception {
		tjb = new TheJourneyBegins();
	}

	@Test
	public void test01() {
		assertTrue(tjb.palindrome("acca"));
	}

	@Test
	public void test02() {
		assertTrue(tjb.palindrome("asdfdsa"));
	}

	@Test
	public void test03() {
		assertFalse(tjb.palindrome("hola"));
	}

	@Test
	public void test04() {
		assertTrue(tjb.palindrome("1234321"));
	}

	@Test
	public void test05() {
		assertTrue(tjb.palindrome("a"));
	}

}
