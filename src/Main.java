import negozio.Modelli.Strumenti.Chitarra;
import negozio.Modelli.Strumenti.Pianoforte;
import negozio.Modelli.Strumenti.Tromba;
import clientela.Modelli.Cliente;
import negozio.Modelli.Accessorio;
import negozio.Modelli.Nota;
import negozio.Modelli.Ripiano;

public class Main {

	public static void main(String[] args) {

		Cliente gabriele = new Cliente("Gabriele", "27");
		Cliente elisa = new Cliente("Elisa", "14");

		Chitarra stratocaster = new Chitarra("Fender Stratocaster");
		Pianoforte steinway = new Pianoforte("Steinway");
		Tromba besson = new Tromba("Besson");
		
		Accessorio tracollaBlu = new Accessorio("Tracolla Blu");

		Ripiano ripiano1 = new Ripiano("1");

		ripiano1.collocaOggetto(stratocaster);
		ripiano1.collocaOggetto(besson);
		
		ripiano1.elencaOggetti();
		
		gabriele.acquistaOggetto(stratocaster);
		elisa.acquistaOggetto(steinway);

		gabriele.suonaStrumento(stratocaster, Nota.DO);
		elisa.accordaStrumento(steinway);
		elisa.suonaStrumento(steinway, Nota.MI);
		gabriele.accordaStrumento(besson);
		gabriele.lucidaStrumento(steinway);
		
		stratocaster.montaAccessorio(tracollaBlu);
		
	}

}
