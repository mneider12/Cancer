package nucleobase;

public class Uracil implements Nucleobase {

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
}
