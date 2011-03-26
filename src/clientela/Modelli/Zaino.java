package clientela.Modelli;

import java.util.ArrayList;

import negozio.Modelli.Oggetto;

public class Zaino {

	private String idZaino;
	private ArrayList<Oggetto> listaOggetti;

	public Zaino(String idZaino) {
		super();
		this.idZaino = idZaino;
	}
	
	public final String getIdZaino() {
		return idZaino;
	}

	public final void setIdZaino(String idZaino) {
		this.idZaino = idZaino;
	}

	public final void setListaOggetti(ArrayList<Oggetto> listaOggetti) {
		this.listaOggetti = listaOggetti;
	}

	public final ArrayList<Oggetto> getListaOggetti() {
		return listaOggetti;
	}

	public void inserisciOggetto(Oggetto oggetto) {

		// Se la lista è null la inizializzo
		if (null == listaOggetti) {
			listaOggetti = new ArrayList<Oggetto>();
		}
		
		// Metti l'oggetto nello zaino
		listaOggetti.add(oggetto);
		System.out.println("L'oggetto "+oggetto.getNome()+" è stato messo nello zaino numero "+this.idZaino);
	}

}
