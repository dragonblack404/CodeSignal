package dad.codesignal03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.SmoothSailing;

public class CommonCharacterCount {
	
	SmoothSailing ss;

	@Before
	public void setUp() throws Exception {
		ss = new SmoothSailing();
	}

	@Test
	public void test01() {
		String s1 = "aabcc";
		String s2 = "adcaa";

		assertSame(3, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void test02() {
		String s1 = "zzzz";
		String s2 = "zzzzzzz";

		assertSame(4, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void test03() {
		String s1 = "abca";
		String s2 = "xyzbac";

		assertSame(3, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void test04() {
		String s1 = "a";
		String s2 = "b";

		assertSame(0, ss.commonCharacterCount(s1, s2));
	}

	@Test
	public void test05() {
		String s1 = "a";
		String s2 = "aaa";

		assertSame(1, ss.commonCharacterCount(s1, s2));
	}
}
