package dad.codesignal02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class MakeArrayConsecutiveTest {

	EdgeOfTheOcean eoto;
	
	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test01() {
		int[] lista = {6,2,3,8};
		assertEquals(4, eoto.makeArrayConsecutive(lista));
	}
	
	@Test
	public void test02() {
		int[] lista = {4};
		assertEquals(3, eoto.makeArrayConsecutive(lista));
	}
	
	@Test
	public void test03() {
		int[] lista = {1};
		assertEquals(0, eoto.makeArrayConsecutive(lista));
	}

	@Test
	public void test04() {
		int[] lista = {14};
		assertEquals(13, eoto.makeArrayConsecutive(lista));
	}
	
	@Test
	public void test05() {
		int[] lista = {2};
		assertEquals(1, eoto.makeArrayConsecutive(lista));
	}
	
	
}
