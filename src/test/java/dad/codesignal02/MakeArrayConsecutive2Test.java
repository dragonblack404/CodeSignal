package dad.codesignal02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class MakeArrayConsecutive2Test {

	EdgeOfTheOcean eoto;
	
	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test01() {
		int[] lista = {6,2,3,8};
		assertEquals(3, eoto.makeArrayConsecutive2(lista));
	}
	
	@Test
	public void test02() {
		int[] lista = {0,3};
		assertEquals(2, eoto.makeArrayConsecutive2(lista));
	}
	
	@Test
	public void test03() {
		int[] lista = {5,4,6};
		assertEquals(0, eoto.makeArrayConsecutive2(lista));
	}

	@Test
	public void test04() {
		int[] lista = {6,3};
		assertEquals(2, eoto.makeArrayConsecutive2(lista));
	}
	
	@Test
	public void test05() {
		int[] lista = {1};
		assertEquals(0, eoto.makeArrayConsecutive2(lista));
	}
	
	
}
