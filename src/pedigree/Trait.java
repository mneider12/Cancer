package pedigree;

public class Trait {

	private String name;
	
	public Trait() {
		name = "";
	}
	
	public Trait(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
