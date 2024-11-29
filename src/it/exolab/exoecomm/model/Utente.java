package it.exolab.exoecomm.model;

public class Utente {
	
	private Long id;
	private String nome;
	private String cognome;
	private Ruolo ruolo;
	private String email;
	private String password;
	private String indirizzo_spedizione;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIndirizzo_spedizione() {
		return indirizzo_spedizione;
	}
	public void setIndirizzo_spedizione(String indirizzo_spedizione) {
		this.indirizzo_spedizione = indirizzo_spedizione;
	}
	public Utente(Long id, String nome, String cognome, Ruolo ruolo, String email, String password,
			String indirizzo_spedizione) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.email = email;
		this.password = password;
		this.indirizzo_spedizione = indirizzo_spedizione;
	}
	
	public Utente() {
		super();
		
	}
	
	public boolean isStaff() {
		
		return ruolo!=null && ruolo.isStaff();
	}
	
	

}
