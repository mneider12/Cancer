package pedigree;

public class Person {

	private Trait trait;
	private Gender gender;
	
	public Person() {
		trait = new Trait();
		gender = Gender.other;
	}
	
	public Person(Trait trait, Gender gender) {
		this.trait = trait;
		this.gender = gender;
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
	
}
