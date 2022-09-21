package dad.codesignal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class adjacentElementsProductTest {

	private EdgeOfTheOcean eoto;

	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test01() {
		int[] lista = {1,2,3,4,5,6};
		assertEquals(30,eoto.adjacentElementsProduct(lista));
	}

	@Test
	public void test02() {
		int[] lista = {-23, 4, -3, 8, -12};
		assertEquals(-12,eoto.adjacentElementsProduct(lista));
	}
	
	@Test
	public void test03() {
		int[] lista = {4, 1, 2, 3, 1, 5};
		assertEquals(6,eoto.adjacentElementsProduct(lista));
	}
	
	@Test
	public void test04() {
		int[] lista = {9, 5, 10, 2, 24, -1, -48};
		assertEquals(50,eoto.adjacentElementsProduct(lista));
	}
	
	@Test
	public void test05() {
		int[] lista = {1, 0, 1, 0, 1000};
		assertEquals(0,eoto.adjacentElementsProduct(lista));
	}

	
	}

