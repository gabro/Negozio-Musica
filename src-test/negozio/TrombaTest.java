/**
 * 
 */
package negozio;

import static org.junit.Assert.*;
import negozio.Modelli.Strumenti.Tromba;

import org.junit.Test;

/**
 * @author gabrielepetronella
 *
 */
public class TrombaTest {

	/**
	 * Test method for {@link negozio.Modelli.Strumenti.Tromba#Tromba(java.lang.String)}.
	 */
	@Test
	public void testTromba() {
		Tromba trombaTest = new Tromba("PROVA");
		assertEquals("Il nome deve corrispondere a quello inizializzato","PROVA", trombaTest.getNome());
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

	/**
	 * Test method for {@link negozio.Modelli.Strumento#Strumento(java.lang.String)}.
	 */
	@Test
	public void testStrumento() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link negozio.Modelli.Oggetto#Oggetto(java.lang.String)}.
	 */
	@Test
	public void testOggetto() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link negozio.Modelli.Oggetto#getNome()}.
	 */
	@Test
	public void testGetNome() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link negozio.Modelli.Oggetto#setNome(java.lang.String)}.
	 */
	@Test
	public void testSetNome() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link negozio.Modelli.Oggetto#compareTo(negozio.Modelli.Oggetto)}.
	 */
	@Test
	public void testCompareTo() {
		fail("Not yet implemented"); // TODO
	}

}
