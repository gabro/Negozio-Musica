package negozio.Modelli.Strumenti;

import negozio.Interfacce.Lucidabile;
import negozio.Modelli.Nota;
import negozio.Modelli.Strumento;

public class Tromba extends Strumento implements Lucidabile {

	public Tromba(String nome) {
		super(nome);
	}

	@Override
	public void emettiSuono(Nota nota) {
		System.out.println("PAPAPAAAAA");
	}

	@Override
	public void pulisci() {
		System.out.println("Strumento pulito!");
		
	}

}
