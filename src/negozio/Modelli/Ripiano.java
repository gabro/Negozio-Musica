package negozio.Modelli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ripiano {

	private String idRipiano;
	private ArrayList<Oggetto> listaOggetti;

	public final ArrayList<Oggetto> getListaOggetti() {
		return listaOggetti;
	}

	public final void setListaOggetti(ArrayList<Oggetto> listaOggetti) {
		this.listaOggetti = listaOggetti;
	}

	public Ripiano(String idRipiano) {
		super();
		this.idRipiano = idRipiano;
	}

	public final String getIdRipiano() {
		return idRipiano;
	}

	public void riordinaRipiano() {
		Collections.sort(listaOggetti);
	}

	public final void setIdRipiano(String idRipiano) {
		this.idRipiano = idRipiano;
	}

	public void collocaOggetto(Oggetto oggetto) {

		// Se la lista è null la inizializzo
		if (null == listaOggetti) {
			listaOggetti = new ArrayList<Oggetto>();
		}

		// Colloca oggetto sul ripiano
		listaOggetti.add(oggetto);
	}

	public void elencaOggetti() {
		/** Stampa a video un elenco degli oggetti presenti sullo scaffale
		 */
		System.out.println("Il ripiano numero " + this.idRipiano
				+ " contiene gli oggetti: ");
		Iterator<Oggetto> itr = listaOggetti.iterator();
		while (itr.hasNext()) {
			Oggetto element = itr.next();
			System.out.println("- "+element.getNome());
		}
		System.out.println();
	}
}
