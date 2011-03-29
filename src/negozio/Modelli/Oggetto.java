package negozio.Modelli;

public abstract class Oggetto implements Comparable<Oggetto> {
/**
 * Un qualsiasi oggetto del negozio
 */
	private String nome;

	public Oggetto(String nome) {
		super();
		this.nome = nome;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Oggetto o) {
		/**
		 * La comparazione di due oggetti avviene comparandone alfabeticamente il nome
		 * La comparazione non è case sensitive
		 * @param o l'oggetto da confrontare
		 */
		return this.nome.compareToIgnoreCase(str)(o.getNome()); 
	}

}
