package dad.codesignal03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.SmoothSailing;

public class SortByHeight {

	SmoothSailing ss;
	
	@Before
	public void setUp() throws Exception {
		ss = new SmoothSailing();
	}

	@Test
	public void test01() {
		int a[] = {-1, 150, 190, 170, -1, -1, 160, 180};
		int b[] = {-1, 150, 160, 170, -1, -1, 180, 190};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}
	
	@Test
	public void test02() {
		int a[] = {-1, -1, -1, -1, -1};
		int b[] = {-1, -1, -1, -1, -1};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}
	
	@Test
	public void test03() {
		int a[] = {-1};
		int b[] = {-1};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}
	
	@Test
	public void test04() {
		int a[] = {4, 2, 9, 11, 2, 16};
		int b[] = {2, 2, 4, 9, 11, 16};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}
	
	@Test
	public void test05() {
		int a[] = {2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
		int b[] = {1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}
	
	@Test
	public void test06() {
		int a[] = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
		int b[] = {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};
		
		assertArrayEquals(b, ss.sortByHeight(a));
	}

}
