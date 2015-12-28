package nucleobasetest;

import static org.junit.Assert.*;
import nucleobase.Adenine;
import nucleobase.Thymine;
import nucleobase.Uracil;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdenineTest {
	
	private static Adenine adenine;
	
	@BeforeClass
	public static void oneTimeSetup() {
		adenine = new Adenine();
	}
	
	@Test
	public void getSymbolTest() {
		assertEquals("A", adenine.getSymbol());
	}

	@Test
	public void getNameTest() {
		assertEquals("adenine", adenine.getName());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("adenine", adenine.toString());
	}
	
	@Test
	public void getDNABasePairTest(){
		assertEquals(Thymine.class, adenine.getDNABasePair().getClass());
	}
	
	@Test
	public void getRNABasePairTest() {
		assertEquals(Uracil.class, adenine.getRNABasePair().getClass());
	}
}
