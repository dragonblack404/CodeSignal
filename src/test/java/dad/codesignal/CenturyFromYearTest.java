package dad.codesignal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {

	private TheJourneyBegins tjb;

	
	@Before
	public void setUp() throws Exception {
		tjb = new TheJourneyBegins();
	}

	@Test
	public void test01(){
		assertEquals(1, tjb.centuryFromYear(1));
	}
	
	@Test
	public void test02(){
		assertEquals(20, tjb.centuryFromYear(1902));
	}
	
	@Test
	public void test03(){
		assertEquals(20, tjb.centuryFromYear(2000));
	}

}
