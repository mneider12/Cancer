package pedigree;

import java.util.ArrayList;

public class Person {

	private Trait trait;
	private Gender gender;
	private Person mother;
	private Person father;
	private ArrayList<Person> children;
	
	/*
	 * Initialize a generic person
	 */
	public Person() {
		trait = new Trait();
		gender = Gender.other;
		mother = null;
		father = null;
		children = new ArrayList<Person>();
	}
	
	/*
	 * Initialize a person with no relatives
	 */
	public Person(Trait trait, Gender gender) {
		this.trait = trait;
		this.gender = gender;
		mother = null;
		father = null;
		children = new ArrayList<Person>();
	}
	
	/*
	 * Initialize a person with relatives
	 */
	public Person(Trait trait, Gender gender, Person mother, Person father,
			ArrayList<Person> children) {
		this(trait, gender);
		this.mother = mother;
		this.father = father;
		this.children = children;
	}
	
	public void setTrait(Trait trait) {
		this.trait = trait;
	}
	
	public void setTrait(String name) {
		trait = new Trait(name);
	}
	
	public Trait getTrait() {
		return trait;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setMother(Person mother) {
		this.mother = mother;
	}
	
	public Person getMother() {
		return mother;
	}
	
	public void setFather(Person father) {
		this.father = father;
	}
	
	public Person getFather() {
		return father;
	}
	
	public void addChild(Person child) {
		children.add(child);
	}
	
	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}
	
	public ArrayList<Person> getChildren() {
		return children;
	}
	
	
}
