
public class Utente {

	private int matricola;
	private String nome="";
	private String cognome="";
	private String dataNascita;
	private String username="";
	private String password="";
	private String email="";
	private String competenze="";
	

	public Utente() {
		
	}
	
	public Utente(int matricola, String nome, String cognome, String dataNascita, String username, String password, String email, String competenze) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.username = username;
		this.password = password;
		this.email = email;
		this.competenze = competenze;
	}
	
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompetenze() {
		return competenze;
	}

	public void setCompetenze(String competenze) {
		this.competenze = competenze;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public static Utente cloneDaString(int matricola, String nome , String cognome, String dataNascita, String username, String password, String email, String competenze) {
		Utente utente = new Utente();
		utente.setMatricola(matricola);
		utente.setNome(nome);
		utente.setCognome(cognome);
		utente.setDataNascita(dataNascita);
		utente.setUsername(username);
		utente.setPassword(password);
		utente.setEmail(email);
		utente.setCompetenze(competenze);
		return utente;
	}
	@Override
	public Utente clone() {
		return new Utente(this.matricola, this.nome, this.cognome, this.dataNascita, this.username, this.password,this.email, this.competenze);
	}
	@Override
	public String toString() {
		return "" + matricola + nome + cognome + dataNascita + username + password + email + competenze;
	}
	
}
