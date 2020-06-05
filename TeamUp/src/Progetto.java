
public class Progetto implements Comparable<Progetto>{

	private int id;
	private String nome="";
	private String categoria="";
	private String data="";
	private String descrizione="";
	private String ricerca="";
	

	public Progetto(String categoria) {
		this.categoria.concat(categoria);
	}
	public Progetto() {
		
	}
	public Progetto(int id, String nome, String categoria, String data,  String descrizione, String ricerca) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.data = data;
		this.descrizione = descrizione;
		this.ricerca = ricerca;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getRicerca() {
		return ricerca;
	}
	public void setRicerca(String ricerca) {
		this.ricerca = ricerca;
	}
	@Override
	public String toString() {
		return nome + id + categoria + data + descrizione + ricerca;
	}
	@Override
	public int compareTo(Progetto progetto) {
		if(progetto.id > this.id)
			return -1;
		else if(progetto.id < this.id)
			return 1;
		else 
			return 0;
	}
	
}
