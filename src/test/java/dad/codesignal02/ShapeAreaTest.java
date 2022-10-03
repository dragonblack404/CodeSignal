package dad.codesignal02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class ShapeAreaTest {

	EdgeOfTheOcean eoto;

	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();

	}

	@Test
	public void test01() {
		assertEquals(1, eoto.shapeArea(1));
	}

	@Test
	public void test02() {
		assertEquals(5, eoto.shapeArea(2));
	}

	@Test
	public void test03() {
		assertEquals(13, eoto.shapeArea(3));
	}

	@Test
	public void test04() {
		assertEquals(25, eoto.shapeArea(4));
	}

	@Test
	public void test05() {
		assertNotEquals(31, eoto.shapeArea(5));
	}
	
	@Test
	public void test06() {
		assertEquals(127984001, eoto.shapeArea(8000));
	}
	
	
	
}