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

public class FrameModificaProgetto {
	
	private JFrame frame;
	
	
	private JLabel labelHomeProgetto;
	private JLabel labelNomeProgetto;
	private JLabel labelNomeProgettoVuoto;
	private JLabel labelDescrizione;
	private JTextArea textDescrizioneVuoto;
	private JLabel labelRicercaCompetenze;
	private JLabel labelRicercaCompetenzeVuoto;
	
	
	private JButton bottoneAnnulla;
	private JButton bottoneConferma;
	
	private JPanel pannello;
	
	
	private JSeparator separatore1;
	private JSeparator separatore4;
	

	
	public FrameModificaProgetto() {
					
		
		frame = new JFrame("Modifica Progetto");
		frame.setResizable(false);
		frame.setBounds(500, 150, 700, 400);
		frame.getContentPane().setBackground(java.awt.Color.orange);
		frame.getContentPane().setLayout(null);
	
		pannello = new JPanel();
		pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
		pannello.setBackground(java.awt.Color.cyan);
		pannello.setBounds(42, 50, 212, 195);
		
		
		
		labelHomeProgetto = new JLabel("Modifica Progetto");
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
	    
	    labelRicercaCompetenzeVuoto = new JLabel("Ricerca Comptetenza vuoto");
	    labelRicercaCompetenzeVuoto.setBounds(256, 163, 333, 141);
	    labelRicercaCompetenzeVuoto.setForeground(java.awt.Color.black);
	    labelRicercaCompetenzeVuoto.setFont(new Font("Helvetica", Font.ITALIC, 22));
	    frame.getContentPane().add(labelRicercaCompetenzeVuoto);

	    textDescrizioneVuoto = new JTextArea();
	    textDescrizioneVuoto.setBackground(Color.WHITE);
	    textDescrizioneVuoto.setBounds(255, 80, 337, 83);
	    frame.getContentPane().add(textDescrizioneVuoto);
	    
	    // JBUTTON
	    

		bottoneAnnulla = new JButton("...");
		bottoneAnnulla.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAnnulla.setBounds(35, 11, 41, 29);
		bottoneAnnulla.setFocusable(false);
		bottoneAnnulla.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAnnulla);
		
		
		bottoneConferma = new JButton("Conferma");
		bottoneConferma.setForeground(Color.BLACK);
		bottoneConferma.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneConferma.setBounds(193, 281, 223, 40);
		bottoneConferma.setFocusable(false);
		bottoneConferma.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneConferma);
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

	public void setLabelNomeProgettoVuoto(JLabel labelNomeProgettoVuoto) {
		this.labelNomeProgettoVuoto = labelNomeProgettoVuoto;
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

	public void setTextDescrizioneVuoto(JTextArea textDescrizioneVuoto) {
		this.textDescrizioneVuoto = textDescrizioneVuoto;
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

	public void setLabelRicercaCompetenzeVuoto(JLabel labelRicercaCompetenzeVuoto) {
		this.labelRicercaCompetenzeVuoto = labelRicercaCompetenzeVuoto;
	}

	public JButton getBottoneAnnulla() {
		return bottoneAnnulla;
	}

	public void setBottoneAnnulla(JButton bottoneAnnulla) {
		this.bottoneAnnulla = bottoneAnnulla;
	}

	public JButton getBottoneConferma() {
		return bottoneConferma;
	}

	public void setBottoneConferma(JButton bottoneConferma) {
		this.bottoneConferma = bottoneConferma;
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

	public JSeparator getSeparatore4() {
		return separatore4;
	}

	public void setSeparatore4(JSeparator separatore4) {
		this.separatore4 = separatore4;
	}

	
	
		

}