package nucleobase;

public class Cytosine implements Nucleobase {
	
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
}
