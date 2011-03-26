package negozio.Modelli.Strumenti;

import negozio.Interfacce.Accessoriabile;
import negozio.Interfacce.Accordabile;
import negozio.Modelli.Accessorio;
import negozio.Modelli.Nota;
import negozio.Modelli.Strumento;

public class Chitarra extends Strumento implements Accordabile,Accessoriabile {

	public Chitarra(String nome) {
		super(nome);
	}

	@Override
	public void emettiSuono(Nota nota) {
		System.out.println("SDLEEEENG!!");
	}

	@Override
	public void montaAccessorio(Accessorio accessorio) {
		System.out.println("Accessorio "+accessorio.getNome()+" montato");
	}

	@Override
	public void accorda() {
		System.out.println("Chitarra accordata!");		
	}

}
