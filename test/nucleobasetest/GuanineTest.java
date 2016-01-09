package nucleobasetest;

import static org.junit.Assert.*;
import nucleobase.Cytosine;
import nucleobase.Guanine;

import org.junit.BeforeClass;
import org.junit.Test;

public class GuanineTest {

	private static Guanine guanine;
	
	@BeforeClass
	public static void oneTimeSetup() {
		guanine = new Guanine();
	}
	
	@Test
	public void getSymbolTest() {
		assertEquals("G", guanine.getSymbol());
	}

	@Test
	public void getNameTest() {
		assertEquals("guanine", guanine.getName());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("guanine", guanine.toString());
	}

	@Test
	public void getDNABasePairTest(){
		assertEquals(Cytosine.class, guanine.getDNABasePair().getClass());
	}
	
	@Test
	public void getRNABasePairTest() {
		assertEquals(Cytosine.class, guanine.getRNABasePair().getClass());
	}
}
