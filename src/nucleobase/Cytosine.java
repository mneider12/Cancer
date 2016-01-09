package nucleobase;

public class Cytosine implements DNABase, RNABase {
	
	public Cytosine() {
		
	}

	@Override
	public String getSymbol() {
		return "C";
	}

	@Override
	public String getName() {
		return "cytosine";
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public RNABase getRNABasePair() {
		return new Guanine();
	}

	@Override
	public DNABase getDNABasePair() {
		return new Guanine();
	}

	@Override
	public boolean equals(Object obj) {
		return obj.getClass().equals(Cytosine.class);
	}
	
	@Override
	public int hashCode() {
		return 2;
	}	
}

