package nucleobasetest;

import static org.junit.Assert.*;
import nucleobase.Adenine;
import nucleobase.Thymine;

import org.junit.BeforeClass;
import org.junit.Test;

public class ThymineTest {

	private static Thymine thymine;
	
	@BeforeClass
	public static void oneTimeSetup() {
		thymine = new Thymine();
	}
	
	@Test
	public void getSymbolTest() {
		assertEquals("T", thymine.getSymbol());
	}

	@Test
	public void getNameTest() {
		assertEquals("thymine", thymine.getName());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("thymine", thymine.toString());
	}
	
	@Test
	public void getDNABasePairTest(){
		assertEquals(Adenine.class, thymine.getDNABasePair().getClass());
	}
}
