package nucleobase;

public class Guanine implements DNABase, RNABase {

	public Guanine() {
		
	}
	
	@Override
	public String getSymbol() {
		return "G";
	}

	@Override
	public String getName() {
		return "guanine";
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public RNABase getRNABasePair() {
		return new Cytosine();
	}

	@Override
	public DNABase getDNABasePair() {
		return new Cytosine();
	}

	@Override
	public boolean equals(Object obj) {
		return obj.getClass().equals(Guanine.class);
	}
	
	@Override
	public int hashCode() {
		return 3;
	}
}
