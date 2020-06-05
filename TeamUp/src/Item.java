import javax.swing.JMenuItem;

public class Item implements Comparable<Item>{

	private JMenuItem item;
	private String descrizione="";
	private String ricerca="";
	
	public Item(String testo){
		item= new JMenuItem(testo);
		
	}
	public Item(String testo, String descrizione, String ricerca){
		this.descrizione = descrizione;
		this.ricerca = ricerca;
		item= new JMenuItem(testo);
		
	}

	public JMenuItem getItem() {
		return item;
	}

	public void setItem(JMenuItem item) {
		this.item = item;
	}

	@Override
	public int compareTo(Item item) {
		if(!this.item.getText().equals(item.getItem().getText()))
			return 1;
		else
			return 0;
	}
	public String toString() {
		return System.lineSeparator()+item.getText();
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
	
}
