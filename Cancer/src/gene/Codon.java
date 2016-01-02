package gene;

import nucleobase.Nucleobase;

public class Codon {

	private Nucleobase baseOne;
	private Nucleobase baseTwo;
	private Nucleobase baseThree;
	
	public Codon() {
		baseOne = null;
		baseTwo = null;
		baseThree = null;
	}
	
	public Codon(Nucleobase baseOne, Nucleobase baseTwo, Nucleobase baseThree) {
		this.baseOne = baseOne;
		this.baseTwo = baseTwo;
		this.baseThree = baseThree;
	}
	
	public Nucleobase getBaseOne() {
		return baseOne;
	}
	
	public Nucleobase getBaseTwo() {
		return baseTwo;
	}
	
	public Nucleobase getBaseThree() {
		return baseThree;
	}
}
