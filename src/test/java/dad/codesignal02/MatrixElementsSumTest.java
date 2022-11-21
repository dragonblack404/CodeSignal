package dad.codesignal02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class MatrixElementsSumTest {

	EdgeOfTheOcean eoto;

	@Before
	public void setUp() throws Exception {
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test01() {
		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };

		assertEquals(9, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test02() {
		int[][] matrix = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };

		assertEquals(9, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test03() {
		int[][] matrix = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		assertEquals(18, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test04() {
		int[][] matrix = { { 0 } };

		assertEquals(0, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test05() {
		int[][] matrix = { { 1, 0, 3 }, { 0, 2, 1 }, { 1, 2, 0 } };

		assertEquals(5, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test06() {
		int[][] matrix = { { 1 }, { 5 }, { 0 }, { 2 } };

		assertEquals(6, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test07() {
		int[][] matrix = { { 1, 2, 3, 4, 5 } };

		assertEquals(15, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test08() {
		int[][] matrix = { { 2 }, { 5 }, { 10 } };

		assertEquals(17, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test09() {
		int[][] matrix = { { 4, 0, 1 }, { 10, 7, 0 }, { 0, 0, 0 }, { 9, 1, 2 } };

		assertEquals(15, eoto.matrixElementsSum(matrix));
	}

	@Test
	public void test10() {
		int[][] matrix = { { 1 } };

		assertEquals(1, eoto.matrixElementsSum(matrix));
	}

}
