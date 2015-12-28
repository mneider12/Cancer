package nucleobase;

public class Adenine implements Nucleobase{
	
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
}
