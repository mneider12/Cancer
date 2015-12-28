package nucleobase;

public class Uracil implements RNABase {

	public Uracil() {
		
	}
	
	@Override
	public String getSymbol() {
		return "U";
	}

	@Override
	public String getName() {
		return "uracil";
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public RNABase getRNABasePair() {
		return new Adenine();
	}
}
