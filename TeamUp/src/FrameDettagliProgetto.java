import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

public class FrameDettagliProgetto {
	
	private JFrame frame;
	
	private JLabel labelGestioneRichieste;
	private JLabel labelMatricola;
	private JLabel labelMatricolaVuoto;
	private JLabel labelNome;
	private JLabel labelNomeVuoto;
	private JLabel labelCognome;
	private JLabel labelCognomeVuoto;	
	private JLabel labelEmail;
	private JLabel labelEmailVuoto;
	private JLabel labelDataNascita;
	private JLabel labelDataNascitaVuoto;
	private JLabel labelCompetenze;
	private JLabel labelCompetenzeVuoto;
	private JPanel pannello2;
	private JPanel pannello3;
	
	private JPanel pannello;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem item1;
	private JMenuItem item2;
	
	private JButton bottoneAnnulla;
	private JButton bottoneAccettaRichiesta;
	private JButton bottoneRifiutaRichiesta;

	
	private JSeparator separatore1;
	private JSeparator separatore2;
	private JSeparator separatore3;
	private JSeparator separatore4;
	private JSeparator separatore5;
	private JSeparator separatore6;
	private JSeparator separatore7;
	private JSeparator separatore8;
	private JSeparator separatore9;
	private JSeparator separatore10;
	
	
	public FrameDettagliProgetto() {
		
		frame = new JFrame("Dettagli Progetto");
		frame.setResizable(false);
		frame.setBounds(500, 150, 600, 500);
		frame.getContentPane().setBackground(java.awt.Color.orange);
		frame.getContentPane().setLayout(null);
		
		pannello = new JPanel();
		pannello.setBackground(java.awt.Color.cyan);
		pannello.setBounds(10, 64, 190, 299);
		
		pannello2 = new JPanel();
		pannello2.setLayout(new BoxLayout(pannello2, BoxLayout.Y_AXIS));
		pannello2.setBackground(java.awt.Color.cyan);
		pannello2.setBounds(205, 77, 138, 286);
		
		pannello3 = new JPanel();
		pannello3.setLayout(new BoxLayout(pannello3, BoxLayout.Y_AXIS));
		pannello3.setBackground(Color.WHITE);
		pannello3.setBounds(343, 77, 239, 286);
		
		
		// JLabel
		labelGestioneRichieste = new JLabel("Informazioni Partecipanti");
		labelGestioneRichieste.setForeground(java.awt.Color.red);
		labelGestioneRichieste.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelGestioneRichieste.setBounds(171, -58, 318, 150);
		frame.getContentPane().add(labelGestioneRichieste);
		
		// JLabel
		
		labelMatricola = new JLabel("Matricola");
		labelMatricola.setForeground(java.awt.Color.BLACK);
		labelMatricola.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelMatricola.setBounds(215, 50, 251, 150);
		pannello2.add(labelMatricola);
	    separatore1 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore1.setBounds(1, 80, 229, 20);
	    separatore1.setBackground(Color.black);
	    pannello2.add(separatore1);
		
		
		// JLabel
	    labelMatricolaVuoto = new JLabel("Matricola Vuoto");
	    labelMatricolaVuoto.setForeground(java.awt.Color.BLACK);
	    labelMatricolaVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
	    labelMatricolaVuoto.setBounds(215, 50, 251, 150);
		pannello3.add(labelMatricolaVuoto);
	    separatore2 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore2.setBounds(1, 80, 229, 20);
	    separatore2.setBackground(Color.black);
	    pannello3.add(separatore2);
	    
		// JLabel
		labelNome = new JLabel("Nome");
		labelNome.setForeground(java.awt.Color.BLACK);
		labelNome.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelNome.setBounds(197, -52, 251, 150);
		pannello2.add(labelNome);
	    separatore3 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore3.setBounds(1, 80, 229, 20);
	    separatore3.setBackground(Color.black);
	    pannello2.add(separatore3);
		
		
	    
		labelNomeVuoto = new JLabel("Nome Vuoto");
		labelNomeVuoto.setForeground(java.awt.Color.BLACK);
		labelNomeVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelNomeVuoto.setBounds(197, -52, 251, 150);
		pannello3.add(labelNomeVuoto);
	    separatore4 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore4.setBounds(1, 80, 229, 20);
	    separatore4.setBackground(Color.black);
	    pannello3.add(separatore4);
		
		
		labelCognome = new JLabel("Cognome");
		labelCognome.setForeground(java.awt.Color.BLACK);
		labelCognome.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCognome.setBounds(215, 50, 251, 150);
		pannello2.add(labelCognome);
	    separatore5 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore5.setBounds(1, 80, 229, 20);
	    separatore5.setBackground(Color.black);
	    pannello2.add(separatore5);
		
		labelCognomeVuoto = new JLabel("Cognome Vuoto");
		labelCognomeVuoto.setForeground(java.awt.Color.BLACK);
		labelCognomeVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCognomeVuoto.setBounds(215, 50, 251, 150);
		pannello3.add(labelCognomeVuoto);
	    separatore6 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore6.setBounds(1, 80, 229, 20);
	    separatore6.setBackground(Color.black);
	    pannello3.add(separatore6);
		
		
		labelEmail = new JLabel("Email");
		labelEmail.setForeground(java.awt.Color.BLACK);
		labelEmail.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelEmail.setBounds(215, 50, 251, 150);
		pannello2.add(labelEmail);
	    separatore7 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore7.setBounds(1, 80, 229, 20);
	    separatore7.setBackground(Color.black);
	    pannello2.add(separatore7);
		
		labelEmailVuoto = new JLabel("Email Vuoto");
		labelEmailVuoto.setForeground(java.awt.Color.BLACK);
		labelEmailVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelEmailVuoto.setBounds(215, 50, 251, 150);
		pannello3.add(labelEmailVuoto);
	    separatore8 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore8.setBounds(1, 80, 229, 20);
	    separatore8.setBackground(Color.black);
	    pannello3.add(separatore8);
		
		
		labelDataNascita = new JLabel("Data Nascita");
		labelDataNascita.setForeground(java.awt.Color.BLACK);
		labelDataNascita.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelDataNascita.setBounds(215, 50, 251, 150);
		pannello2.add(labelDataNascita);
	    separatore9 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore9.setBounds(1, 80, 229, 20);
	    separatore9.setBackground(Color.black);
	    pannello2.add(separatore9);
		
		labelDataNascitaVuoto = new JLabel("Data Nascita Vuoto");
		labelDataNascitaVuoto.setForeground(java.awt.Color.BLACK);
		labelDataNascitaVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelDataNascitaVuoto.setBounds(215, 50, 251, 150);
		pannello3.add(labelDataNascitaVuoto);
	    separatore10 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore10.setBounds(1, 80, 229, 20);
	    separatore10.setBackground(Color.black);
	    pannello3.add(separatore10);
		
		
		labelCompetenze = new JLabel("Competenze");
		labelCompetenze.setForeground(java.awt.Color.BLACK);
		labelCompetenze.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCompetenze.setBounds(215, 50, 251, 150);
		pannello2.add(labelCompetenze);
		
		labelCompetenzeVuoto = new JLabel("Competenze Vuoto");
		labelCompetenzeVuoto.setForeground(java.awt.Color.BLACK);
		labelCompetenzeVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCompetenzeVuoto.setBounds(215, 50, 251, 150);
		pannello3.add(labelCompetenzeVuoto);

	    
		
		
		frame.getContentPane().add(pannello3);
		frame.getContentPane().add(pannello2);
		
		barraMenu = new JMenuBar();
		menu = new JMenu("Membri Team");
		item1 = new JMenuItem("utente1234s");
		item2 = new JMenuItem("username123213");
		

		menu.add(item1);
		menu.add(item2);
		
		barraMenu.add(menu);

		pannello.add(barraMenu);
		
		frame.getContentPane().add(pannello);
		
		
		// JBUTTON
		bottoneAnnulla = new JButton("...");
		bottoneAnnulla.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAnnulla.setBounds(36, 10, 41, 29);
		bottoneAnnulla.setFocusable(false);
		bottoneAnnulla.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAnnulla);
		

	}
	
	
	
	
	
	public JFrame getFrame() {
		return frame;
	}





	public void setFrame(JFrame frame) {
		this.frame = frame;
	}





	public JLabel getLabelGestioneRichieste() {
		return labelGestioneRichieste;
	}





	public void setLabelGestioneRichieste(JLabel labelGestioneRichieste) {
		this.labelGestioneRichieste = labelGestioneRichieste;
	}





	public JLabel getLabelMatricola() {
		return labelMatricola;
	}





	public void setLabelMatricola(JLabel labelMatricola) {
		this.labelMatricola = labelMatricola;
	}





	public JLabel getLabelMatricolaVuoto() {
		return labelMatricolaVuoto;
	}





	public void setLabelMatricolaVuoto(JLabel labelMatricolaVuoto) {
		this.labelMatricolaVuoto = labelMatricolaVuoto;
	}





	public JLabel getLabelNome() {
		return labelNome;
	}





	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}





	public JLabel getLabelNomeVuoto() {
		return labelNomeVuoto;
	}





	public void setLabelNomeVuoto(JLabel labelNomeVuoto) {
		this.labelNomeVuoto = labelNomeVuoto;
	}





	public JLabel getLabelCognome() {
		return labelCognome;
	}





	public void setLabelCognome(JLabel labelCognome) {
		this.labelCognome = labelCognome;
	}





	public JLabel getLabelCognomeVuoto() {
		return labelCognomeVuoto;
	}





	public void setLabelCognomeVuoto(JLabel labelCognomeVuoto) {
		this.labelCognomeVuoto = labelCognomeVuoto;
	}





	public JLabel getLabelEmail() {
		return labelEmail;
	}





	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}





	public JLabel getLabelEmailVuoto() {
		return labelEmailVuoto;
	}





	public void setLabelEmailVuoto(JLabel labelEmailVuoto) {
		this.labelEmailVuoto = labelEmailVuoto;
	}





	public JLabel getLabelDataNascita() {
		return labelDataNascita;
	}





	public void setLabelDataNascita(JLabel labelDataNascita) {
		this.labelDataNascita = labelDataNascita;
	}





	public JLabel getLabelDataNascitaVuoto() {
		return labelDataNascitaVuoto;
	}





	public void setLabelDataNascitaVuoto(JLabel labelDataNascitaVuoto) {
		this.labelDataNascitaVuoto = labelDataNascitaVuoto;
	}





	public JLabel getLabelCompetenze() {
		return labelCompetenze;
	}





	public void setLabelCompetenze(JLabel labelCompetenze) {
		this.labelCompetenze = labelCompetenze;
	}





	public JLabel getLabelCompetenzeVuoto() {
		return labelCompetenzeVuoto;
	}





	public void setLabelCompetenzeVuoto(JLabel labelCompetenzeVuoto) {
		this.labelCompetenzeVuoto = labelCompetenzeVuoto;
	}





	public JPanel getPannello2() {
		return pannello2;
	}





	public void setPannello2(JPanel pannello2) {
		this.pannello2 = pannello2;
	}





	public JPanel getPannello3() {
		return pannello3;
	}





	public void setPannello3(JPanel pannello3) {
		this.pannello3 = pannello3;
	}





	public JPanel getPannello() {
		return pannello;
	}





	public void setPannello(JPanel pannello) {
		this.pannello = pannello;
	}





	public JMenuBar getBarraMenu() {
		return barraMenu;
	}





	public void setBarraMenu(JMenuBar barraMenu) {
		this.barraMenu = barraMenu;
	}





	public JMenu getMenu() {
		return menu;
	}





	public void setMenu(JMenu menu) {
		this.menu = menu;
	}





	public JMenuItem getItem1() {
		return item1;
	}





	public void setItem1(JMenuItem item1) {
		this.item1 = item1;
	}





	public JMenuItem getItem2() {
		return item2;
	}





	public void setItem2(JMenuItem item2) {
		this.item2 = item2;
	}





	public JButton getBottoneAnnulla() {
		return bottoneAnnulla;
	}





	public void setBottoneAnnulla(JButton bottoneAnnulla) {
		this.bottoneAnnulla = bottoneAnnulla;
	}





	public JButton getBottoneAccettaRichiesta() {
		return bottoneAccettaRichiesta;
	}





	public void setBottoneAccettaRichiesta(JButton bottoneAccettaRichiesta) {
		this.bottoneAccettaRichiesta = bottoneAccettaRichiesta;
	}





	public JButton getBottoneRifiutaRichiesta() {
		return bottoneRifiutaRichiesta;
	}





	public void setBottoneRifiutaRichiesta(JButton bottoneRifiutaRichiesta) {
		this.bottoneRifiutaRichiesta = bottoneRifiutaRichiesta;
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





	public JSeparator getSeparatore5() {
		return separatore5;
	}





	public void setSeparatore5(JSeparator separatore5) {
		this.separatore5 = separatore5;
	}





	public JSeparator getSeparatore6() {
		return separatore6;
	}





	public void setSeparatore6(JSeparator separatore6) {
		this.separatore6 = separatore6;
	}





	public JSeparator getSeparatore7() {
		return separatore7;
	}





	public void setSeparatore7(JSeparator separatore7) {
		this.separatore7 = separatore7;
	}





	public JSeparator getSeparatore8() {
		return separatore8;
	}





	public void setSeparatore8(JSeparator separatore8) {
		this.separatore8 = separatore8;
	}





	public JSeparator getSeparatore9() {
		return separatore9;
	}





	public void setSeparatore9(JSeparator separatore9) {
		this.separatore9 = separatore9;
	}





	public JSeparator getSeparatore10() {
		return separatore10;
	}





	public void setSeparatore10(JSeparator separatore10) {
		this.separatore10 = separatore10;
	}





	// METODO RENDI VISIBILE
	public void rendiVisibile() {
		if(frame.isVisible())
 			frame.setVisible(false);
 		else
 			frame.setVisible(true);
   }

}
