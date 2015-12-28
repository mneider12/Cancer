package nucleobase;

public class Adenine implements DNABase,RNABase {
	
	public Adenine() {
		
	}

	@Override
	public String getSymbol() {
		return "A";
	}

	@Override
	public String getName() {
		return "adenine";
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public RNABase getRNABasePair() {
		return new Uracil();
	}

	@Override
	public DNABase getDNABasePair() {
		return new Thymine();
	}
}
