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
		/**
		 * Fa suonare lo strumento
		 * @param nota la nota da suonare
		 */
		System.out.println("SDLEEEENG!!");
	}

	@Override
	public void montaAccessorio(Accessorio accessorio) {
		/**
		 * Permette di montare un accessorio sulla chitarra
		 * @param acccessorio l'accessorio da montare
		 */
		System.out.println("Accessorio "+accessorio.getNome()+" montato");
	}

	@Override
	public void accorda() {
		/**
		 * Permette di accordare la chitarra
		 */
		System.out.println("Chitarra accordata!");		
	}

}
