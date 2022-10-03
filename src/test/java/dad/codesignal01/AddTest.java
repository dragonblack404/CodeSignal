package dad.codesignal01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;

public class AddTest {

	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test01(){
		assertEquals(3, tjb.add(1, 2));
	}
	
	@Test
	public void test02(){
		assertEquals(8, tjb.add(10, -2));
	}
	
	@Test
	public void test03(){
		assertEquals(6, tjb.add(3, 2));
	}
	
}
