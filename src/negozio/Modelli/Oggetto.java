package negozio.Modelli;

public abstract class Oggetto implements Comparable<Oggetto> {

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
		return this.nome.compareTo(o.getNome()); 
	}

}
