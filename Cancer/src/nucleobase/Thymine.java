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
	
	@Override
	public boolean equals(Object obj) {
		return obj.getClass().equals(Thymine.class);
	}
	
	@Override
	public int hashCode() {
		return 4;
	}
}
