import static org.junit.Assert.*;
import negozio.Modelli.Strumenti.Tromba;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author gabrielepetronella
 *
 */
public class TrombaTest {

	
	@Test
	public void testGetNome () {
		Tromba t = new Tromba("ProvaTromba");
		assertEquals("ProvaTromba", t.getNome());
	}

	/**
	 * Test method for {@link negozio.Modelli.Strumenti.Tromba#emettiSuono(negozio.Modelli.Nota)}.
	 */
	@Test
	public void testEmettiSuono() {
		
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link negozio.Modelli.Strumenti.Tromba#pulisci()}.
	 */
	@Test
	public void testPulisci() {
		fail("Not yet implemented"); // TODO
	}

}
