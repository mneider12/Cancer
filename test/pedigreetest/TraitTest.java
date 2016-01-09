package pedigreetest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pedigree.Trait;

public class TraitTest {

	private static Trait trait;
	
	@BeforeClass
	public static void oneTimeSetup() {
		trait = new Trait();
	}
	
	@Test
	public void traitTest() {
		Trait defaultTrait = new Trait();
		assertEquals("", defaultTrait.getName());
		Trait fullTrait = new Trait("hamburger");
		assertEquals("hamburger", fullTrait.getName());
	}
	
	@Test
	public void setNameTest() {
		trait.setName("Cheese");
		assertEquals("Cheese", trait.getName());
	}

}
