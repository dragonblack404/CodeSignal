package dad.codesignal03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.SmoothSailing;

public class AllLongestStringsTest {

	SmoothSailing ss;

	@Before
	public void setUp() throws Exception {
		ss = new SmoothSailing();
	}

	@Test
	public void test01() {
		String[] lista = { "aba", "aa", "ad", "vcd", "aba" };
		String[] resul = { "aba", "vcd", "aba" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test02() {
		String[] lista = { "aa" };
		String[] resul = { "aa" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test03() {
		String[] lista = { "abc", "eeee", "abcd", "dcd" };
		String[] resul = { "eeee", "abcd" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test04() {
		String[] lista = { "a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };
		String[] resul = { "zzzzzz", "abcdef", "aaaaaa" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test05() {
		String[] lista = { "enyky", "benyky", "yely", "varennyky" };
		String[] resul = { "varennyky" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test06() {
		String[] lista = { "abacaba", "abacab", "abac", "xxxxxx" };
		String[] resul = { "abacaba" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test07() {
		String[] lista = { "young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon" };
		String[] resul = { "yooooooung", "watermelon" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test08() {
		String[] lista = { "onsfnib", "aokbcwthc", "jrfcw" };
		String[] resul = { "aokbcwthc" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test09() {
		String[] lista = { "lbgwyqkry" };
		String[] resul = { "lbgwyqkry" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

	@Test
	public void test10() {
		String[] lista = { "i" };
		String[] resul = { "i" };

		assertArrayEquals(resul, ss.allLongestStrings(lista));
	}

}
