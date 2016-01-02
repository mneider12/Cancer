package genetest;

import static org.junit.Assert.*;
import gene.Codon;
import nucleobase.Adenine;
import nucleobase.Guanine;
import nucleobase.Thymine;

import org.junit.Test;

public class CodonTest {

	@Test
	public void codonTest() {
		Codon codon = new Codon();
		assertEquals(null, codon.getBaseOne());
		assertEquals(null, codon.getBaseTwo());
		assertEquals(null, codon.getBaseThree());
		codon = new Codon(new Adenine(), new Thymine(), new Guanine());
		assertEquals(new Adenine(), codon.getBaseOne());
		assertEquals(new Thymine(), codon.getBaseTwo());
		assertEquals(new Guanine(), codon.getBaseThree());
	}
}
