package clientela.Modelli;

import negozio.Modelli.Strumento;

public class Musicista extends Cliente {

	private Strumento strumentoSuonato;
	private Boolean suonaConSpartito;

	public Musicista(String nome, String idZaino, Strumento strumentoSuonato, Boolean suonaConSpartito) {
		super(nome, idZaino);
		this.strumentoSuonato = strumentoSuonato;
		this.suonaConSpartito = suonaConSpartito;
	}

	public final Strumento getStrumentoSuonato() {
		return strumentoSuonato;
	}

	public final Boolean getSuonaConSpartito() {
		return suonaConSpartito;
	}

	public final void setStrumentoSuonato(Strumento strumentoSuonato) {
		this.strumentoSuonato = strumentoSuonato;
	}

	public final void setSuonaConSpartito(Boolean suonaConSpartito) {
		this.suonaConSpartito = suonaConSpartito;
	}

}
