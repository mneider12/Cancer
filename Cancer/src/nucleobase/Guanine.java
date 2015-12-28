package nucleobase;

public class Guanine implements Nucleobase {

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
}
