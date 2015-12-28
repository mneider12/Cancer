package pedigreetest;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
		Person mother = new Person(new Trait("mother"), Gender.female);
		Person father = new Person(new Trait("father"), Gender.male);
		Person son = new Person(new Trait("Jack"), Gender.male);
		Person daughter = new Person(new Trait("Jill"), Gender.female);
		ArrayList<Person> children = new ArrayList<Person>();
		children.add(son);
		children.add(daughter);
		Person parentTest = new Person(new Trait("born"), Gender.male, mother, father, children);
		assertEquals("born", parentTest.getTrait().getName());
		assertEquals(mother, parentTest.getMother());
		assertEquals(father, parentTest.getFather());
		assertEquals(son, parentTest.getChildren().get(0));
		assertEquals(daughter, parentTest.getChildren().get(1));
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
	
	/*
	 * Test getter and setter for mother and father
	 */
	@Test
	public void setParentTest() {
		Person mother = new Person();
		Person father = new Person();
		person.setMother(mother);
		person.setFather(father);
		assertEquals(mother, person.getMother());
		assertEquals(father, person.getFather());
	}
}

