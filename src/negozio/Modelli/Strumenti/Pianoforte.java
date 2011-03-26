package negozio.Modelli.Strumenti;

import negozio.Interfacce.Accordabile;
import negozio.Modelli.Nota;
import negozio.Modelli.Strumento;

public class Pianoforte extends Strumento implements Accordabile {

	public Pianoforte(String nome) {
		super(nome);
	}

	@Override
	public void emettiSuono(Nota nota) {
		System.out.println("PLIN PLIN PLIIIIN!");
	}

	@Override
	public void accorda() {
		System.out.println("Pianoforte accordato!");
		
	}

}
