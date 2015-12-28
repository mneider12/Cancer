package pedigreetest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pedigree.Gender;
import pedigree.Person;
import pedigree.Trait;

public class PersonTest {

	private static Person person;
	
	@BeforeClass
	public static void oneTimeSetup() {
		person = new Person();
	}
	
	/*
	 * Test Constructors
	 */
	@Test
	public void personTest() {
		Person defaultTest = new Person();
		assertEquals("", defaultTest.getTrait().getName());
		assertEquals(Gender.other, defaultTest.getGender());
		Person fullTest = new Person(new Trait("Carrot Cake"), Gender.female);
		assertEquals("Carrot Cake", fullTest.getTrait().getName());
		assertEquals(Gender.female, fullTest.getGender());
	}
	
	/*
	 * Test getter and setter for gender
	 */
	@Test
	public void setGenderTest() {
		person.setGender(Gender.female);
		assertEquals(Gender.female, person.getGender());
		person.setGender(Gender.male);
		assertEquals(Gender.male, person.getGender());
	}

	/* 
	 * Test getter and setters for trait
	 */
	@Test
	public void setTraitTest() {
		person.setTrait("blueberry");
		assertEquals("blueberry", person.getTrait().getName());
		Trait trait = new Trait("Strawberry");
		person.setTrait(trait);
		assertEquals("Strawberry", person.getTrait().getName());
	}
}

