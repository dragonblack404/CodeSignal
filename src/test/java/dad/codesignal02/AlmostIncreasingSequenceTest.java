package dad.codesignal02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class AlmostIncreasingSequenceTest {

	EdgeOfTheOcean eoto;

	
	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test01() {
		int[] list = {1,3,2,1};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test02() {
		int[] list = {1,3,2};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test03() {
		int[] list = {1,2,1,2};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test04() {
		int[] list = {3,6,5,8,10,20,15};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test05() {
		int[] list = {1,1,2,3,4,4};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test06() {
		int[] list = {1,4,10,4,2};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test07() {
		int[] list = {10,1,2,3,4,5};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test08() {
		int[] list = {1,1,1,2,3};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test09() {
		int[] list = {0,-2,5,6};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test10() {
		int[] list = {1,2,3,4,5,3,5,6};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test11() {
		int[] list = {40,50,60,10,20,30};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test12() {
		int[] list = {1,1};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test13() {
		int[] list = {1,2,5,3,5};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test14() {
		int[] list = {1,2,5,5,5};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test15() {
		int[] list = {10,1,2,3,4,5,6,1};
		assertFalse(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test16() {
		int[] list = {1,2,3,4,3,6};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test17() {
		int[] list = {1,2,3,4,99,5,6};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test18() {
		int[] list = {123, -17, -5, 1, 2, 3, 12, 43, 45};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
	@Test
	public void test19() {
		int[] list = {3, 5, 67, 98, 3};
		assertTrue(eoto.almostIncreasingSequence(list));
	}
	
}
