package pedigree;

public class Person {

	private Trait trait;
	private Gender gender;
	private Person mother;
	private Person father;
	
	public Person() {
		trait = new Trait();
		gender = Gender.other;
		mother = null;
		father = null;
	}
	
	public Person(Trait trait, Gender gender) {
		this.trait = trait;
		this.gender = gender;
	}
	
	public Person(Trait trait, Gender gender, Person mother, Person father) {
		this.trait = trait;
		this.gender = gender;
		this.mother = mother;
		this.father = father;
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
	
}
