package negozio.Modelli.Strumenti;

import negozio.Interfacce.Accordabile;
import negozio.Modelli.Nota;
import negozio.Modelli.Strumento;

public class Violino extends Strumento implements Accordabile {

	public Violino(String nome) {
		super(nome);
	}

	@Override
	public void emettiSuono(Nota nota) {
		System.out.println("ZIN ZIN ZIIIIIIN");
	}

	@Override
	public void accorda() {
		System.out.println("Violino accordato!");				
	}

}
