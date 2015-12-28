package nucleobase;

public class Thymine implements DNABase {

	public Thymine() {
		
	}
	
	@Override
	public String getSymbol() {
		return "T";
	}

	@Override
	public String getName() {
		return "thymine";
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public DNABase getDNABasePair() {
		return new Adenine();
	}
}
