package nucleobasetest;

import static org.junit.Assert.*;
import nucleobase.Cytosine;
import nucleobase.Guanine;


import org.junit.BeforeClass;
import org.junit.Test;

public class CytosineTest {

	private static Cytosine cytosine;
	
	@BeforeClass
	public static void oneTimeSetup() {
		cytosine = new Cytosine();
	}
	
	@Test
	public void getSymbolTest() {
		assertEquals("C", cytosine.getSymbol());
	}

	@Test
	public void getNameTest() {
		assertEquals("cytosine", cytosine.getName());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("cytosine", cytosine.toString());
	}
	
	@Test
	public void getDNABasePairTest(){
		assertEquals(Guanine.class, cytosine.getDNABasePair().getClass());
	}
	
	@Test
	public void getRNABasePairTest() {
		assertEquals(Guanine.class, cytosine.getRNABasePair().getClass());
	}
}
