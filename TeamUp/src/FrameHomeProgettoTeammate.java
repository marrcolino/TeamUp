import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class FrameHomeProgettoTeammate {
	
private JFrame frame;
	
	
	private JLabel labelHomeProgetto;
	private JLabel labelNomeProgetto;
	private JLabel labelNomeProgettoVuoto;
	private JLabel labelDataCreazione;
	private JLabel labelDataCreazioneVuoto;
	private JLabel labelCategoria;
	private JLabel labelCategoriaVuoto;
	private JLabel labelDescrizione;
	private JTextArea textDescrizioneVuoto;
	private JLabel labelRicercaCompetenze;
	private JLabel labelRicercaCompetenzeVuoto;
	
	
	private JButton bottoneAnnulla;
	private JButton bottoneVisualizzaDettagliProgetto;
	private JButton bottoneAbbandonaProgetto;
	
	
	private JPanel pannello;
	
	
	private JSeparator separatore1;
	private JSeparator separatore2;
	private JSeparator separatore3;
	private JSeparator separatore4;
	
	
	
	public FrameHomeProgettoTeammate() {
	
		
		frame = new JFrame("Home Progetto Teammate");
		frame.setResizable(false);
		frame.setBounds(500, 150, 700, 600);
		frame.getContentPane().setBackground(java.awt.Color.orange);
		frame.getContentPane().setLayout(null);
	
		pannello = new JPanel();
		pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
		pannello.setBackground(java.awt.Color.cyan);
		pannello.setBounds(42, 50, 212, 369);
		
		
		
		labelHomeProgetto = new JLabel("Home Progetto");
		labelHomeProgetto.setForeground(java.awt.Color.red);
		labelHomeProgetto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelHomeProgetto.setBounds(256, -51, 200, 150);
		frame.getContentPane().add(labelHomeProgetto);
		
	
		labelNomeProgetto = new JLabel("Nome");
		labelNomeProgetto.setBounds(31, -53, 200, 150);
		pannello.add(labelNomeProgetto);
		labelNomeProgetto.setForeground(java.awt.Color.black);
		labelNomeProgetto.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    separatore1 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore1.setBounds(1, 42, 229, 20);
	    separatore1.setBackground(Color.black);
	    pannello.add(separatore1);
	   	
		
	    labelDataCreazione = new JLabel("Data di Creazione");
	    labelDataCreazione.setBounds(31, -14, 200, 150);
		pannello.add(labelDataCreazione);
		labelDataCreazione.setForeground(java.awt.Color.black);
		labelDataCreazione.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    separatore2 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore2.setBounds(1, 80, 229, 20);
	    separatore2.setBackground(Color.black);
	    pannello.add(separatore2);
	        
	   	
		labelCategoria = new JLabel("Categoria");
		labelCategoria.setBounds(31, 20, 200, 150);
		pannello.add(labelCategoria);
		labelCategoria.setForeground(java.awt.Color.black);
		labelCategoria.setFont(new Font("Helvetica", Font.ITALIC, 22));
		separatore3 = new JSeparator(JSeparator.HORIZONTAL);
		separatore3.setBounds(1, 114, 229, 20);
		separatore3.setBackground(Color.black);
	    pannello.add(separatore3);
	    

		labelDescrizione = new JLabel("Descrizione");
		labelDescrizione.setBounds(31, 53, 200, 150);
		pannello.add(labelDescrizione);
		labelDescrizione.setForeground(java.awt.Color.black);
		labelDescrizione.setFont(new Font("Helvetica", Font.ITALIC, 22));
		separatore4 = new JSeparator(JSeparator.HORIZONTAL);
		separatore4.setBounds(1, 198, 229, 20);
		separatore4.setBackground(Color.black);
	    pannello.add(separatore4);

	    
	    
	    labelRicercaCompetenze = new JLabel("Ricerca Competenze");
	    labelRicercaCompetenze.setBounds(31, 135, 200, 150);
	    pannello.add(labelRicercaCompetenze);
	    labelRicercaCompetenze.setForeground(java.awt.Color.black);
	    labelRicercaCompetenze.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    
	    
	    // VUOTO
		labelNomeProgettoVuoto = new JLabel("Nome Progetto Vuoto");
		labelNomeProgettoVuoto.setBounds(255, -10, 250, 150);
		labelNomeProgettoVuoto.setForeground(java.awt.Color.black);
		labelNomeProgettoVuoto.setFont(new Font("Helvetica", Font.ITALIC, 22));
		frame.getContentPane().add(labelNomeProgettoVuoto);

		
		
    
	    labelDataCreazioneVuoto = new JLabel("Data Descrizione Vuota");
	    labelDataCreazioneVuoto.setBounds(256, 68, 250, 150);
	    labelDataCreazioneVuoto.setForeground(java.awt.Color.black);
	    labelDataCreazioneVuoto.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    frame.getContentPane().add(labelDataCreazioneVuoto);

		
	    
	    
	    
	    labelCategoriaVuoto = new JLabel("Categoria Vuota");
	    labelCategoriaVuoto.setBounds(256, 151, 200, 150);
	    labelCategoriaVuoto.setForeground(java.awt.Color.black);
	    labelCategoriaVuoto.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    frame.getContentPane().add(labelCategoriaVuoto);
	    
	    

	    
	    labelRicercaCompetenzeVuoto = new JLabel("Ricerca Comptetenza vuoto");
	    labelRicercaCompetenzeVuoto.setBounds(256, 334, 333, 141);
	    labelRicercaCompetenzeVuoto.setForeground(java.awt.Color.black);
	    labelRicercaCompetenzeVuoto.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    frame.getContentPane().add(labelRicercaCompetenzeVuoto);

	    textDescrizioneVuoto = new JTextArea();
	    textDescrizioneVuoto.setBackground(Color.WHITE);
	    textDescrizioneVuoto.setBounds(256, 251, 337, 83);
	    frame.getContentPane().add(textDescrizioneVuoto);
	    
	    // JBUTTON
	    

		bottoneAnnulla = new JButton("...");
		bottoneAnnulla.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAnnulla.setBounds(35, 11, 41, 29);
		bottoneAnnulla.setFocusable(false);
		bottoneAnnulla.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAnnulla);
		
		bottoneAbbandonaProgetto = new JButton("Abbandona Progetto");
		bottoneAbbandonaProgetto.setForeground(Color.BLACK);
		bottoneAbbandonaProgetto.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAbbandonaProgetto.setBounds(466, 5, 214, 40);
		bottoneAbbandonaProgetto.setFocusable(false);
		bottoneAbbandonaProgetto.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAbbandonaProgetto);
		
		bottoneVisualizzaDettagliProgetto = new JButton("Visualizza Dettagli Progetto");
		bottoneVisualizzaDettagliProgetto.setForeground(Color.BLACK);
		bottoneVisualizzaDettagliProgetto.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneVisualizzaDettagliProgetto.setBounds(42, 435, 554, 40);
		bottoneVisualizzaDettagliProgetto.setFocusable(false);
		bottoneVisualizzaDettagliProgetto.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneVisualizzaDettagliProgetto);
	    
		
		frame.getContentPane().add(pannello);

	}
	
	

	public void rendiVisibile() {
		if(frame.isVisible())
 			frame.setVisible(false);
 		else
 			frame.setVisible(true);
   }



	public JFrame getFrame() {
		return frame;
	}



	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	public JLabel getLabelHomeProgetto() {
		return labelHomeProgetto;
	}



	public void setLabelHomeProgetto(JLabel labelHomeProgetto) {
		this.labelHomeProgetto = labelHomeProgetto;
	}



	public JLabel getLabelNomeProgetto() {
		return labelNomeProgetto;
	}



	public void setLabelNomeProgetto(JLabel labelNomeProgetto) {
		this.labelNomeProgetto = labelNomeProgetto;
	}



	public JLabel getLabelNomeProgettoVuoto() {
		return labelNomeProgettoVuoto;
	}



	public void setLabelNomeProgettoVuoto(String labelNomeProgettoVuoto) {
		this.labelNomeProgettoVuoto.setText(labelNomeProgettoVuoto);
	}



	public JLabel getLabelDataCreazione() {
		return labelDataCreazione;
	}



	public void setLabelDataCreazione(String labelDataCreazione) {
		this.labelDataCreazione.setText(labelDataCreazione);
	}



	public JLabel getLabelDataCreazioneVuoto() {
		return labelDataCreazioneVuoto;
	}



	public void setLabelDataCreazioneVuoto(String labelDataCreazioneVuoto) {
		this.labelDataCreazioneVuoto.setText(labelDataCreazioneVuoto);
	}



	public JLabel getLabelCategoria() {
		return labelCategoria;
	}



	public void setLabelCategoria(JLabel labelCategoria) {
		this.labelCategoria = labelCategoria;
	}



	public JLabel getLabelCategoriaVuoto() {
		return labelCategoriaVuoto;
	}



	public void setLabelCategoriaVuoto(String labelCategoriaVuoto) {
		this.labelCategoriaVuoto.setText(labelCategoriaVuoto);
	}



	public JLabel getLabelDescrizione() {
		return labelDescrizione;
	}



	public void setLabelDescrizione(JLabel labelDescrizione) {
		this.labelDescrizione = labelDescrizione;
	}



	public JTextArea getTextDescrizioneVuoto() {
		return textDescrizioneVuoto;
	}



	public void setTextDescrizioneVuoto(String textDescrizioneVuoto) {
		this.textDescrizioneVuoto.setText(textDescrizioneVuoto);
	}



	public JLabel getLabelRicercaCompetenze() {
		return labelRicercaCompetenze;
	}



	public void setLabelRicercaCompetenze(JLabel labelRicercaCompetenze) {
		this.labelRicercaCompetenze = labelRicercaCompetenze;
	}



	public JLabel getLabelRicercaCompetenzeVuoto() {
		return labelRicercaCompetenzeVuoto;
	}



	public void setLabelRicercaCompetenzeVuoto(String labelRicercaCompetenzeVuoto) {
		this.labelRicercaCompetenzeVuoto.setText(labelRicercaCompetenzeVuoto);
	}



	public JButton getBottoneAnnulla() {
		return bottoneAnnulla;
	}



	public void setBottoneAnnulla(JButton bottoneAnnulla) {
		this.bottoneAnnulla = bottoneAnnulla;
	}



	public JButton getBottoneVisualizzaDettagliProgetto() {
		return bottoneVisualizzaDettagliProgetto;
	}



	public void setBottoneVisualizzaDettagliProgetto(JButton bottoneVisualizzaDettagliProgetto) {
		this.bottoneVisualizzaDettagliProgetto = bottoneVisualizzaDettagliProgetto;
	}



	public JButton getBottoneAbbandonaProgetto() {
		return bottoneAbbandonaProgetto;
	}



	public void setBottoneAbbandonaProgetto(JButton bottoneAbbandonaProgetto) {
		this.bottoneAbbandonaProgetto = bottoneAbbandonaProgetto;
	}



	public JPanel getPannello() {
		return pannello;
	}



	public void setPannello(JPanel pannello) {
		this.pannello = pannello;
	}



	public JSeparator getSeparatore1() {
		return separatore1;
	}



	public void setSeparatore1(JSeparator separatore1) {
		this.separatore1 = separatore1;
	}



	public JSeparator getSeparatore2() {
		return separatore2;
	}



	public void setSeparatore2(JSeparator separatore2) {
		this.separatore2 = separatore2;
	}



	public JSeparator getSeparatore3() {
		return separatore3;
	}



	public void setSeparatore3(JSeparator separatore3) {
		this.separatore3 = separatore3;
	}



	public JSeparator getSeparatore4() {
		return separatore4;
	}



	public void setSeparatore4(JSeparator separatore4) {
		this.separatore4 = separatore4;
	}


}
