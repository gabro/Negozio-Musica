package clientela.Modelli;

import eccezioni.NonLucidabileEccezione;
import negozio.Interfacce.Accordabile;
import negozio.Interfacce.Lucidabile;
import negozio.Modelli.Nota;
import negozio.Modelli.Oggetto;
import negozio.Modelli.Strumento;

public class Cliente {

	private String nome;
	private Zaino zaino;

	public Cliente(String nome, String idZaino) {
		super();
		this.nome = nome;
		this.zaino = new Zaino(idZaino);
	}

	public final String getNome() {
		return nome;
	}

	public final Zaino getZaino() {
		return zaino;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final void setZaino(Zaino zaino) {
		this.zaino = zaino;
	}

	public void acquistaOggetto(Oggetto oggetto) {
		// Per acquistare un oggetto lo metto nello zaino
		System.out.println(this.nome + " ha acquistato " + oggetto.getNome()
				+ ".");
		this.zaino.inserisciOggetto(oggetto);
	}

	public void suonaStrumento(Strumento strumento, Nota nota) {
		System.out.println(this.nome + " suona la nota " + nota + " con lo/la "
				+ strumento.getNome());
		strumento.emettiSuono(nota);
	}

	public void accordaStrumento(Strumento strumento) {
		if (strumento instanceof Accordabile) {
			((Accordabile) strumento).accorda();
		} else {
			System.out.println(strumento.getNome()
					+ " non è uno strumento accordabile perché è un/una "
					+ strumento.getClass().getSimpleName());

		}
	}

	public void lucidaStrumento(Lucidabile strumento) {
		strumento.pulisci();
	}
}
