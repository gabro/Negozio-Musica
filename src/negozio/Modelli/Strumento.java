package negozio.Modelli;

import negozio.Interfacce.Suonabile;

public abstract class Strumento extends Oggetto implements Suonabile {

	public Strumento(String nome) {
		super(nome);
	}

}
