package nucleobasetest;

import static org.junit.Assert.*;
import nucleobase.Adenine;
import nucleobase.Uracil;

import org.junit.BeforeClass;
import org.junit.Test;

public class UracilTest {

	private static Uracil uracil;
	
	@BeforeClass
	public static void oneTimeSetup() {
		uracil = new Uracil();
	}
	
	@Test
	public void getSymbolTest() {
		assertEquals("U", uracil.getSymbol());
	}

	@Test
	public void getNameTest() {
		assertEquals("uracil", uracil.getName());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("uracil", uracil.toString());
	}
	
	@Test
	public void getRNABasePairTest() {
		assertEquals(Adenine.class, uracil.getRNABasePair().getClass());
	}
}
